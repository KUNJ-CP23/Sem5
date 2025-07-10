//LAB 6

// server-side Programming using TCP
import java.net.*;
import java.io.*;

public class ServerTCP {
  
    private Socket s = null;
    private ServerSocket ss = null;
    private DataInputStream in = null;

    public ServerTCP(int port) {
      
        try
        {
            ss = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client ..");

            s = ss.accept();
            System.out.println("Client accepted");

            // input from client socket
            in = new DataInputStream(
                new BufferedInputStream(s.getInputStream()));

            String m = "";

            //read mesg from client here
            while (!m.equals("Over"))
            {
                try
                {
                    m = in.readUTF();
                    System.out.println(m);

                }
                catch(IOException i)
                {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");

            // Close connection
            s.close();
            in.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        ServerTCP s = new ServerTCP(5023);
    }
}