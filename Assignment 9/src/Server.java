import java.net.*;
import java.io.*;
 
public class Server {
    public static void main(String[] args) throws IOException {
 
        try ( 
            ServerSocket serverSocket = new ServerSocket(6000);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out =
                new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
        ) {
         
            String inputLine, outputLine;
             
            // Initiate conversation with client
            FelixCustomerServiceBot kkp = new FelixCustomerServiceBot();
            outputLine = kkp.processInput(null);
            out.println(outputLine);
 
            while ((inputLine = in.readLine()) != null) {
                outputLine = kkp.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("Bye."))
                    break;
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                + 6000  + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}
