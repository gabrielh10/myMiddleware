package middleware;

import java.io.IOException;
import java.util.ArrayList;

public interface IDownloadService {
    byte[] downloadFile(String name) throws IOException;
    ArrayList<String> listFiles();
}
