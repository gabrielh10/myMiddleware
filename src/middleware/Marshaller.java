package middleware;

import java.io.*;

public class Marshaller {
    public byte[] marshall (Message msg) throws IOException {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ObjectOutputStream objectStream = new ObjectOutputStream(byteStream);
        objectStream.writeObject(msg);

        return byteStream.toByteArray();
    }
    public Message unMarshall (byte[] msg) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteStream = new ByteArrayInputStream(msg);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteStream);

        return (Message) objectInputStream.readObject();
    }

}
