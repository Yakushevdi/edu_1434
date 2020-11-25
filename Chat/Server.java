package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;

public class Server {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("INFO: Server started");

            while (true){
                Socket socket = serverSocket.accept();
                User user = new User(null,socket);
                Thread thread = new Thread(new Runnable() {
                    @Override

                    public void run() {

                        try {
                            DataInputStream in = new DataInputStream(socket.getInputStream());
                            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                            out.writeUTF("Input your name: ");
                            String userName = in.readUTF();
                            user.setName(userName);
                            users.add(user);
                            user.sendMessage(users,"Client "+userName+" has connected "," Server ");

                            while (true){
                                String request = in.readUTF();
                                System.out.println(request);
                                user.sendMessage(users,request,userName);
                            }

                        }catch (IOException exception) {
                            System.out.println("Client "+ user.getName()+ " had gone");
                            String userLeft = user.getName();
                            users.remove(user);
                            user.sendMessage(users,"Client "+ userLeft + " had gone", "Server");
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
