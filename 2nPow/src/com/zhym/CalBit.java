package com.zhym;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SelectionKey;

/**
 * @description:
 * @author: zhym
 * @time: 2021/1/13 0013 20:56
 */
public class CalBit {

    public static void main(String[] args) throws IOException {

        /**
         * 0000 1111 1110
         */
        /*int a = -128, c;
        c = a << 1;
        System.out.println(c);*/

        /*ServerSocket socket = new ServerSocket(9000);


        while (true) {
            final Socket clientClient = socket.accept();

            new Thread(() -> {
                doRequest(clientClient);
            });

        }*/
        int[][] arr = new int[10][10];


    }

    private static void doRequest(Socket socket){
        byte[] b = new byte[1024];
        final int read;
        try {
            read = socket.getInputStream().read(b);
            if (read > -1) {
                String msg = new String(b, 0, read);
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
