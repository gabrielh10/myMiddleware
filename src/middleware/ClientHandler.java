package middleware;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    private String ip;
    private int port;

    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;

    public ClientHandler (String ip, int port){
        this.ip = ip;
        this.port = port;
    }
    public void send (byte[] msg) throws IOException, InterruptedException{
    }

    public byte[] get() throws IOException, InterruptedException{
        return null;
    }


}
