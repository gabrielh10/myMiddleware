package middleware;

public class ClientProxy {
    String ip;
    int port;
    int objectId;

    public ClientProxy(){}

    public ClientProxy(int port){

    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }
}
