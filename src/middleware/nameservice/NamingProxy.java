package middleware.nameservice;

import middleware.ClientProxy;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class NamingProxy extends ClientProxy implements INaming {
    private NamingRepository rep;
    ArrayList<NamingRecord> records;

    public NamingProxy(String ip, int port){
        if(rep == null) {
            rep = new NamingRepository();
        }
        records = rep.getNamingRecord();
        this.setIp(ip);
        this.setPort(port);
    }
    @Override
    public void bind(String serviceName, ClientProxy clientProxy) throws Throwable {
        NamingRecord newName = new NamingRecord();
        newName.setServiceName(serviceName);
        newName.setClientProxy(clientProxy);
        records.add(newName);
    }

    @Override
    public ClientProxy lookup(String serviceName) throws Throwable {
       for(int i=0; i<records.size();i++){
           if(records.get(i).getServiceName().equals(serviceName)){
               return records.get(i).getClientProxy();
           }
       }
       return null;

    }

    @Override
    public ArrayList<String> list() throws Throwable {
        return null;
    }
}
