package tuan4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
//import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private InetAddress host;
    private int port;

    public Client(InetAddress host, int port) {
        this.host = host;
        this.port = port;
    }

    private void execute() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String name = sc.nextLine();

        Socket client = new Socket(host, port);
        readClient read = new readClient(client);
        read.start();
        writeClient write = new writeClient(client, name);
        write.start();

    }

    public static void main(String[] args) throws UnknownHostException,IOException  {
        Client client = new Client(InetAddress.getLocalHost(),15757);
        client.execute();
    }
}

class readClient extends Thread{
    private Socket client;

    public readClient(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(client.getInputStream());
            while(true) {
                String sms = dis.readUTF();
                System.out.println(sms);
            }
        } catch (Exception e) {
            try {
                dis.close();
                client.close();
            } catch (Exception e1) {
                System.out.println("interupt conneted");
            }
        }
    }
}
class writeClient extends Thread{
    private Socket client;
    private String name;

    public writeClient(Socket client,String name) {
        this.client = client;
        this.name = name;
    }

    @Override
    public void run() {
        DataOutputStream dos = null;
        Scanner sc = null;
        try {
            dos = new DataOutputStream(client.getOutputStream());
            sc = new Scanner(System.in);
            while(true) {
                String sms = sc.nextLine();
                dos.writeUTF(name + " : " + sms);
            }
        } catch (Exception e) {
            try {
                dos.close();
                client.close();
            } catch (Exception e1) {
                System.out.println("interupt conneted");
            }
        }
    }
}

