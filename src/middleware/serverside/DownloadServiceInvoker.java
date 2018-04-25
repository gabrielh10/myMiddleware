package middleware.serverside;

import middleware.*;

import java.io.IOException;

public class DownloadServiceInvoker {
    public void invoke(ClientProxy clientProxy) throws IOException, InterruptedException, ClassNotFoundException {
        ServerHandler serverHandler = new ServerHandler(clientProxy.getPort());
        byte[] msgToBeUnmarshalled;
        byte[] msgMarshalled;

        Message msgUnmarshalled = new Message();
        Marshaller marshaller = new Marshaller();
        Termination termination = new Termination();

        //instantiate the object missing

        while(true){
            msgToBeUnmarshalled = serverHandler.get();
            msgUnmarshalled = marshaller.unMarshall(msgToBeUnmarshalled);

            if(msgUnmarshalled.getBody().getRequestHeader().getOperation().equals("list")){

            }else if(msgUnmarshalled.getBody().getRequestHeader().getOperation().equals("download")){

            }
        }

    }
}
