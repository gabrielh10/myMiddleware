package middleware.nameservice;

import middleware.ClientProxy;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

public interface INaming {
    void bind (String serviceName, ClientProxy clientProxy) throws UnknownHostException, IOException, Throwable;
    ClientProxy lookup (String serviceName)throws UnknownHostException, IOException, Throwable;
    ArrayList<String> list() throws UnknownHostException, IOException, Throwable;


}
