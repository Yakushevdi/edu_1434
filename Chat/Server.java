package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("INFO: Server started");

            while (true){
                Socket socket = serverSocket.accept();
                Thread thread = new Thread(new Runnable() {
                    @Override

                    public void run() {

                        try {
                            DataInputStream in = new DataInputStream(socket.getInputStream());
                            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                            out.writeUTF("Input your name: ");
                            String userName = in.readUTF();
                            User user = new User(userName,socket);
                            users.add(user);
                            user.sendMessage(users,"Client "+userName+" has connected "," Server ");

                            while (true){
                                String request = in.readUTF();
                                System.out.println(request);
                                user.sendMessage(users,request,userName);
                            }

                            }catch (IOException exception) {
                                exception.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}

class User{
    private String name;
    private Socket socket;

    public User(String name, Socket socket) {
        this.name = name;
        this.socket = socket;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Socket getSocket() {
        return socket;
    }

    public void sendMessage (ArrayList<User> users, String message, String userName){

        for (User user : users ) {

            try {
                DataOutputStream out = new DataOutputStream(user.getSocket().getOutputStream());

                if (user.getName().equals(this.name)) {
                    out.writeUTF("your message has been send");
                    continue;
                }

                out.writeUTF(userName+" : "+message);

            }catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }
}
