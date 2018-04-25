package middleware;

import java.io.IOException;
import java.util.ArrayList;

public class DownloadServiceProxy extends ClientProxy implements IDownloadService {

    public DownloadServiceProxy(){

    }

    @Override
    public ArrayList<String> listFiles() {
        return null;
    }

    @Override
    public byte[] downloadFile(String name) throws IOException {
        return new byte[0];
    }

    public String welcomeMSG() throws Throwable {
        Invocation inv = new Invocation();
        Termination ter = new Termination();
        ArrayList<Object> parameters = new ArrayList<Object>();
        class Local {};
        String methodName = null;
        Requestor requestor = new Requestor();

        //from client
        methodName = Local.class.getEnclosingMethod().getName();
        //parameters.add() se houver

        //sent to requestor
        inv.setObjectID(this.getObjectId());
        inv.setIpAdress(this.getIp());
        inv.setPortNumber(this.getPort());
        inv.setOperation(methodName);
        inv.setParameters(parameters);

        ter = requestor.invoke(inv);

        return (String) ter.getResult();


     //   return "Opa, Deu Bom !";
    }
}
