package middleware;

import java.io.IOException;
import java.util.ArrayList;

public class DownloadServiceImp implements IDownloadService {
    public DownloadServiceImp(){

    }

    @Override
    public ArrayList<String> listFiles() {
        return null;
    }

    @Override
    public byte[] downloadFile(String name) throws IOException {
        return new byte[0];
    }
    public String welcomeMSG (){
        return "Deu bom !";
    }


}
