package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Controller {
    Socket socket;
    DataOutputStream out;
    @FXML
     TextField textField;
    @FXML
    TextArea messegeWindow;
    @FXML
    private void send() {
        try {
            String str = textField.getText();
            out.writeUTF(str);
            textField.clear();
            textField.requestFocus();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
    @FXML
    private void connect(){
        try {
            Socket socket = new Socket("localhost",8189);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true){
                            String response = in.readUTF();
                            messegeWindow.appendText(response+"\n");
                        }
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            });
            thread.start();

        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
