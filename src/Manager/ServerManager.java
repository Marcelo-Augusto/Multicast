/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Listener.ServerListener;
import Listener.ServerManagerListener;
import Model.Server;

/**
 *
 * @author Marcelo
 */
public class ServerManager {
    private Server server;
    private ServerManagerListener serverManagerListener;
    
    public ServerManager(){
        this.server = new Server(6789);
        this.server.setServerListener(new ServerListener() {
            @Override
            public void receivePacket(String json) {
               
            }
        });
    }

    public void setServerManagerListener(ServerManagerListener serverManagerListener) {
        this.serverManagerListener = serverManagerListener;
    }
}
