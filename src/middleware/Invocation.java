package middleware;

import java.util.ArrayList;
import java.util.Objects;

public class Invocation {
    private int objectID;
    private String ipAdress;
    private int portNumber;
    private String operation;
    private ArrayList<Object> parameters;

    public int getObjectID() {
        return objectID;
    }

    public void setObjectID(int objectID) {
        this.objectID = objectID;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ArrayList<Object> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Object> parameters) {
        this.parameters = parameters;
    }
}
