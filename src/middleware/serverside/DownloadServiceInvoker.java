package middleware.serverside;

import middleware.*;

import java.io.IOException;

public class DownloadServiceInvoker {
    public void invoke(ClientProxy clientProxy) throws IOException, InterruptedException, ClassNotFoundException {
        ServerHandler serverHandler = new ServerHandler(clientProxy.getPort());
        byte[] msgToBeUnmarshalled = null;
        byte[] msgMarshalled = null;

        Message msgUnmarshalled = new Message();
        Marshaller marshaller = new Marshaller();
        Termination termination = new Termination();

        //instantiate the object missing
        DownloadServiceImp obj = new DownloadServiceImp();

        while(true){
            msgToBeUnmarshalled = serverHandler.get();
            msgUnmarshalled = marshaller.unMarshall(msgToBeUnmarshalled);

            if(msgUnmarshalled.getBody().getRequestHeader().getOperation().equals("list")){

            }else if(msgUnmarshalled.getBody().getRequestHeader().getOperation().equals("download")){

            }else if (msgUnmarshalled.getBody().getRequestHeader().getOperation().equals("welcomeMSG")){
                termination.setResult(obj.welcomeMSG());

                Message message = new Message(new MessageHeader("protocolo", 0, false,0,0),
                        new MessageBody(null, null, new ReplyHeader("", 0, 0),
                                new ReplyBody(termination.getResult())));

                msgMarshalled = marshaller.marshall(message);
                System.out.println(msgMarshalled.length);
                serverHandler.send(msgMarshalled);
            }
        }

    }
}
