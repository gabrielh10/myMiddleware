package middleware;

public class RequestHeader {
    private String context;
    private int requestID;
    private boolean responseExpected;
    private int objectKey;
    private String operation;

    public RequestHeader (String context, int requestID, boolean responseExpected, int objectKey, String operation){
        this.context = context;
        this.requestID = requestID;
        this.responseExpected = responseExpected;
        this.objectKey = objectKey;
        this.operation = operation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public boolean isResponseExpected() {
        return responseExpected;
    }

    public void setResponseExpected(boolean responseExpected) {
        this.responseExpected = responseExpected;
    }

    public int getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(int objectKey) {
        this.objectKey = objectKey;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
