## java io流总结

字节流->字符流: encode

字符流->字节流：decode

### 1.字节流

#### 1.1 InputStream

- int read (byte b[])
- int read (byte b[],int off, int len)

#### 1.2 OutputStream

- write (int b)

- write (byte b[])

- flush()

  ```java
  byte buffer[]= new byte [512];
  System.in.read(buffer);
  ```

与inputStream类似的class：

- FileInputStream,读文件流
- BufferedInputStream 缓存
- ByteArrayInputStream

与outputStream类似的class：

FileOutputStream

BufferedOutputStream

PrintStream

#### 1.3 BufferArrayInputStream&BufferArrayOutputStream

```java
//在字节数组与流之间搭建桥梁
ByteArrayInputStream bais = new BufferArrayInputStream (byte[]buf);
//用字节数组作为字节流数据源
while((n = bais.read())!=-1){
    System.out.print((char)n);
}//以单个字节输出

```

#### 1.4 FileInputStream & FileOutputStream

```java
FileInputStream rf = new FileInputStream ("ABC.java")
while((c=rf.read(buffer,0,n))!=-1){
	System.out.print(new String(buffer,0,c));
	//c是长度，buffer是存储的字符数组，解码字符串再输出
}
```

### 2.字符流

- fileReader & FileWriter
- PipeReader & PipeWriter

#### 2.1 字节流与字符流转换

InputStreamReader (InputStream in)

`InputStreamReader ins = new InputStreamReader(System.in);`

#### 2.2 流的装配

将数据流包装成文件、缓存、数据

```JAVA
DataInputStream di = new DataInputStream (new BufferedInputStream(new FileInputStream(f)));
```

#### 2.3 过滤流

DataInputStream & DataOutputStream: 从字节流写入、读取java基本数据类型

缓存作用，用于装配文件磁盘，网络设备，终端

```java
BufferReader k = new BufferReader(new InputStreamReader(System.in));
//缓存字符流
```

#### 2.4 流的串行化

介质存储和网络传输：

ObjectInputStream and ObjectOutputStream

