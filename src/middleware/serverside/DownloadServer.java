package middleware.serverside;

import middleware.DownloadServiceProxy;
import middleware.nameservice.NamingProxy;

import java.io.IOException;

public class DownloadServer {
    public static void main (String[] args) throws InterruptedException, IOException, ClassNotFoundException, Throwable {
        DownloadServiceInvoker invoker = new DownloadServiceInvoker();

        DownloadServiceProxy downloadService = new DownloadServiceProxy();

        //missing naming proxy implementation yet
        NamingProxy namingService = new NamingProxy("localhost", 9999);
        //missing implementation yet
        namingService.bind("DownloadService", downloadService);

        invoker.invoke(downloadService);
    }
}
