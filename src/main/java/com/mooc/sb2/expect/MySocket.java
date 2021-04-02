package com.mooc.sb2.expect;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @author mao  2021/3/13 3:19
 */
public class MySocket {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        serverSocket.accept();
    }
}
