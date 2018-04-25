package middleware;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerHandler {
    private int port;
    private ServerSocket serverSocket;
    private Socket socket;

    private DataOutputStream out;
    private DataInputStream in;

    public ServerHandler(int port){
        this.port = port;
    }
    public void send (byte[] msg) throws IOException, InterruptedException{}

    public byte[] get () throws IOException, InterruptedException{ return null;}


}
