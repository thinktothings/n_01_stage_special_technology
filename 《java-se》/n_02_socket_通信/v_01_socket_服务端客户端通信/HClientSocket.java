package com.opensourcesteam.java.enhance.n_02_socket_通信.v_01_socket_服务端客户端通信;

import java.io.*;
import java.net.Socket;


public class HClientSocket {

    public static void main(String[] args) throws IOException {
        String host = "127.0.0.1";
        //host = "localhost";
        //host ="192.168.12.9";
        Socket socket = new Socket(host,1234);
        System.out.println("客户端发送请求...");

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));

        writer.write(" a");
        writer.newLine();

        writer.flush();


        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.println("服务器返回的数据 : " + reader.readLine());

        writer.close();
        reader.close();

        socket.close();
    }
}
