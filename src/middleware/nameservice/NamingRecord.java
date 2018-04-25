package middleware.nameservice;

import middleware.ClientProxy;

public class NamingRecord {
    private String serviceName;
    private ClientProxy clientProxy;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setClientProxy(ClientProxy clientProxy) {
        this.clientProxy = clientProxy;
    }

    public ClientProxy getClientProxy() {
        return clientProxy;
    }
}
