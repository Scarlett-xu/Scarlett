## java socket通信：聊天器（1）

#### 目的：实现多个客户之间的通信

首先，这个聊天器的框架是这样的：

![1573287701050](C:\Users\fishdeer\AppData\Roaming\Typora\typora-user-images\1573287701050.png)

对于服务器端：建立socket，连接到服务器，并且开始监听。

```java
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.net.*;
public class MultiTalkServer{
	static int clientnum = 0;
	//创建一个arraylist数组来保存socket,
	public static List <Socket> socketList = new ArrayList <Socket>();
	public static void main(String args[])throws IOException{
		ServerSocket serverSocket = null;
		boolean listening = true;
		try {
			serverSocket= new ServerSocket(4700);
			System.out.println("欢迎来到聊天室。");
		}catch(IOException e) {
			System.out.println("Could not listen on port:4700.");
			System.exit(-1);
		}
		while (listening) {
			clientnum++;
		    Socket st = serverSocket.accept();//先创建一个socket
            //此处会阻塞，等待接收
		    socketList.add(st);//将这个线程添加到list里
			System.out.println("上线通知： 用户" + clientnum+"上线啦！"); 
		    new ServerThread(st,clientnum).start();//再创建一个服务端线程
		}
		serverSocket.close();
	}
}
```

服务器线程：

```java
import java.io.*;
import java.net.*;
public class ServerThread extends Thread{
	Socket socket = null;//服务器的套接字
	int clientnum;
	String line;
	//将line定义在外面
	public ServerThread(Socket socket,int num){
		this.socket=socket;
		clientnum=num+1;
	}
	public void run() {
		try {
			BufferedReader is = new BufferedReader(new
			InputStreamReader(socket.getInputStream()));//is：从缓存区读入
			
			PrintWriter os = new PrintWriter(socket.getOutputStream());//os：从缓存区输出
			
			BufferedReader sin = new BufferedReader(
					new InputStreamReader(System.in));//系统标准输入
			
			System.out.println("Client:"+clientnum+is.readLine());//显示从客户端读入的对象，在这里等待客户端输入
			
			line=sin.readLine();
			//前面是初始化
			while(!line.equals("bye")) {
				os.println(line);//向客户端输出该字符串
				os.flush();//刷新，让客户端接收到
				System.out.println("Server:"+line);//显示服务端读入的字符
				System.out.println("Client:"+clientnum+is.readLine());//再次从客户端读入字符串
				line=sin.readLine();//从服务端读入字符
			}
			os.close();
			is.close();
			socket.close();
					
		}catch(Exception e) {
			System.out.println("Error:"+e);
		}
	}
}
```

客户端：

```java
import java.net.*;
import java.io.*;
public class TalkClient{

	public static void main(String args[]){
		try {
			Socket socket = new Socket("127.0.0.1",4700);
			System.out.print("已连接成功,");
			new Thread(new ClientThread(socket)).start();
			new Thread(new ClientThread2(socket)).start();
		}catch(Exception e) {
			System.out.println("Error"+e);
		}
		
}
}
```

客户端线程1：

```java
import java.io.*;
import java.net.*;
public class ClientThread extends Thread{
	Socket socket;
	String line;
	public ClientThread(Socket socket) {
		this.socket = socket;

	}
	public void run(){
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			while(true) {
				line = is.readLine();
				out.println(line); //向服务器输入；
				out.flush();
			}
		}catch(Exception e){
			System.out.println("Error:"+e);
		}
	}
}
```

客户端线程2：

```java
import java.io.*;
import java.net.*;
public class ClientThread2 extends Thread{
	Socket socket;

	public ClientThread2(Socket socket) {
		this.socket = socket;
	}
	public void run(){
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String line = in.readLine();
				System.out.println(line); 
			}
		}catch(Exception e){
			System.out.println("Error:"+e);
		}
	}
}
```

先启动服务器，再启动客户端：

![1573288077642](C:\Users\fishdeer\AppData\Roaming\Typora\typora-user-images\1573288077642.png)

![1573288091557](C:\Users\fishdeer\AppData\Roaming\Typora\typora-user-images\1573288091557.png)

![1573288106420](C:\Users\fishdeer\AppData\Roaming\Typora\typora-user-images\1573288106420.png)