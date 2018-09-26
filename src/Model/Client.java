/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Marcelo
 */
public class Client {
//    public static void main (String args[]) throws Exception {
//        Socket client = new Socket("localhost", 6789);
//        DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
//        String msg = "mensagem do cliente!";
//        outToServer.writeBytes(msg);
//        client.close();
//    }
    
    private Socket client;
    private DataOutputStream outToServer;
    private int port;
    public Client(int port){
        this.port = port;
        try{
            client = new Socket("localhost", port);
            outToServer = new DataOutputStream(client.getOutputStream());
        } catch (Exception e) {
            client = null;
            e.printStackTrace();
        }
    }
    
    public void outToServer (String json) {
        if(client!=null && outToServer!=null){
            try{
                outToServer.writeBytes(json);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}