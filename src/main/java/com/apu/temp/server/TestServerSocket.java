/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.temp.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author apu
 */
public class TestServerSocket {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8189);
        Socket incoming;
        InputStream inStream;
        OutputStream outStream;
        while(true) {
        incoming = server.accept();
        inStream = incoming.getInputStream();
        outStream = incoming.getOutputStream();
        
        PrintWriter out = new PrintWriter(outStream,true);
        out.println("Hello!!!");
        incoming.close();
        }
    }
    
}
