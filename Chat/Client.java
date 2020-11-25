package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost",9999);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            Thread thread = new Thread(new Runnable() {
                @Override

                public void run() {

                    try {

                        while (true){
                            String response = in.readUTF();
                            System.out.println(response);
                        }

                    }catch (IOException e){
                        e.printStackTrace();

                    }
                }
            });

            thread.start();

            Scanner scanner = new Scanner(System.in);

            while(true){
                String msg = scanner.nextLine();
                out.writeUTF(msg);
            }

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
