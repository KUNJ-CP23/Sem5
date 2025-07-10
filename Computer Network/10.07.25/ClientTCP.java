//client-side programming using TCP
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;

public class ClientTCP {

    private Socket s = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    // constructor
    public ClientTCP(String addr, int port){
        try{
            s = new Socket(addr,port);
            System.out.println("Connected");
            
            // takes input from terminal
            in = new DataInputStream(System.in);

            // sends output to socket
            out = new DataOutputStream(s.getOutputStream());
        }
        catch(UnknownHostException u){
            System.out.println(u);
            return;
        }
        catch(IOException i){
            System.out.println(i);
            return;
        }
        String k = "";
        while(!k.equals("Over")){
            try{
                k = in.readLine();
                out.writeUTF(k);
            }
            catch (IOException i) {
                System.out.println(i);
            }
        }
        //close connection
        try {
            in.close();
            out.close();
            s.close();
        }
        catch (IOException i) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        ClientTCP c = new ClientTCP("127.0.0.1",5023);
    }
}