package middleware;

import java.io.IOException;
import java.net.UnknownHostException;

public class Requestor {
    public Termination invoke(Invocation inv) throws UnknownHostException, IOException, Throwable{
        ClientHandler ch = new ClientHandler(inv.getIpAdress(), inv.getPortNumber());

        Marshaller marshaller = new Marshaller();
        Termination termination = new Termination();

        byte[] msgMarshalled;
        byte[] msgToBeUnMarshalled;
        Message msgUnmarshalled = new Message();


        RequestHeader requestHeader = new RequestHeader("", 0, true, 0, inv.getOperation());

        RequestBody requestBody = new RequestBody(inv.getParameters());

        MessageHeader messageHeader = new MessageHeader("MIOP", 0, false, 0,0);

        MessageBody messageBody = new MessageBody(requestHeader, requestBody, null, null);

        Message msgToBeMarshalled = new Message (messageHeader, messageBody);



        msgMarshalled = marshaller.marshall(msgToBeMarshalled);
        ch.send(msgMarshalled);

        msgToBeUnMarshalled = ch.get();
        msgUnmarshalled = marshaller.unMarshall(msgToBeUnMarshalled);

        termination.setResult(msgUnmarshalled.getBody().getReplyBody().getResult());
        return termination;
    }
}
