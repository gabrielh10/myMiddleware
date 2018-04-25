package middleware;

import middleware.nameservice.NamingProxy;

public class DownloadClient {
    public static void main(String[] args) throws Throwable {
        NamingProxy namingService = new NamingProxy("localhost", 9999);

        DownloadServiceProxy downloadServiceProxy = (DownloadServiceProxy) namingService.lookup("DownloadService");

        System.out.println(downloadServiceProxy.welcomeMSG());
        downloadServiceProxy.listFiles();

    }
}
