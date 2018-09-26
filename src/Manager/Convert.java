/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Model.ACK;
import Model.Message;

/**
 *
 * @author Marcelo
 */
public class Convert {
    
    public static String MessageToJson(Message message){
        String json = "";
        return json;
    }
    
    public static Message JsonToMessage(String json){
        Message message = new Message();
        return message;
    }
    
    public static String ACKToJson(ACK ack){
        String json = "";
        return json;
    }
    
    public static ACK JsonToACK(String json){
        ACK ack = new ACK();
        return ack;
    }
    
    public static boolean isACK(String json){
        
    }
}
