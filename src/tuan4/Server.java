package tuan4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    private int port;
    public static ArrayList<Socket> listSK;

    public Server(int port) {
        this.port = port;
    }

    private void execute() throws IOException {
        ServerSocket server = new ServerSocket(port);
        writeServer write = new writeServer();
        write.start();
        System.out.println("server is listening....");
        while (true) {
            Socket socket = server.accept();
            System.out.println("Đã Kết nối với " + socket);
            Server.listSK.add(socket);
            readServer read = new readServer(socket);
            read.start();
        }
    }
    public static void main(String[] args) throws IOException {
        Server.listSK = new ArrayList<>();
        Server server = new Server(15757);
        server.execute();
    }
}

class readServer extends Thread {
    private Socket socket;

    public readServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(socket.getInputStream());
            while (true) {
                String sms = dis.readUTF();
                if (sms.contains("exit")) {
                    Server.listSK.remove(socket);
                    System.out.println("đã ngắt kết nối với " + socket);
                    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                    dos.writeUTF("đã thoát");
                    socket.close();
                    dis.close();
                    continue;

                }

                for (Socket item : Server.listSK) {
                    if(item.getPort()!=socket.getPort()) {
                        DataOutputStream dos = new DataOutputStream(item.getOutputStream());
                        dos.writeUTF(sms);
                    }


                }
                System.out.println(sms);
            }
        } catch (Exception e) {
            try {
                dis.close();
                socket.close();
            } catch (Exception e1) {
                System.out.println("interupt conneted");
            }
        }
    }
}

class writeServer extends Thread {

    @Override
    public void run() {
        DataOutputStream dos = null;
        Scanner sc = new Scanner(System.in);
        while(true) {
            String sms = sc.nextLine();
            try {
                for (Socket item : Server.listSK) {
                    dos = new DataOutputStream(item.getOutputStream());
                    dos.writeUTF("Server : " + sms);
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


