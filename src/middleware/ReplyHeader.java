package middleware;

public class ReplyHeader {
    private String serviceContext;
    private int requestID;
    private int replyStatus;

    public String getServiceContext() {
        return serviceContext;
    }

    public void setServiceContext(String serviceContext) {
        this.serviceContext = serviceContext;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getReplyStatus() {
        return replyStatus;
    }

    public void setReplyStatus(int replyStatus) {
        this.replyStatus = replyStatus;
    }
}
