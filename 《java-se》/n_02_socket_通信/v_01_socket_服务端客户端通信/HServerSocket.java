package com.opensourcesteam.java.enhance.n_02_socket_通信.v_01_socket_服务端客户端通信;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HServerSocket {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket socket = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String readData = "";
        System.out.println("服务已启动,端口为:" +serverSocket.getLocalPort() + " ...... ");
        while (true){
            socket = serverSocket.accept();
            InetAddress addr =  socket.getInetAddress();
            System.out.println("接收到了,客户端请求:" + addr.getHostName());

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8")) ;
            readData = reader.readLine();
            System.out.println("服客reader端:读取客户端数据-->" +readData);

           // reader.close();

            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
            writer.write("服务端处理后返回-->" +readData);
            writer.newLine();
            writer.flush();
            //writer.close();

           // socket.close();
        }


    }
}
