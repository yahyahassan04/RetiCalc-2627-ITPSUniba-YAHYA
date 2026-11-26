
import java.io.*;
import java.net.*;

public class ServerTCP {

    public static void main(String[] args) {

    	

	try {
	    ServerSocket serverSocket = new ServerSocket(5000);
	    System.out.println("Server is waiting for a client...");
	while(true) {
	    Socket clientSocket = serverSocket.accept();
	    System.out.println("Client connected!");
	    
	    PrintWriter out = new PrintWriter(
	    	    clientSocket.getOutputStream(), true);

	    	out.println("connessione avvenuta");
	    	
    	BufferedReader in = new BufferedReader(
    	        new InputStreamReader(clientSocket.getInputStream()));

    	while (true) {
    	int n1 = Integer.parseInt(in.readLine());
    	int n2 = Integer.parseInt(in.readLine());
    	int n3 = Integer.parseInt(in.readLine());
    	
    	int res = n1 + n2 - n3;

    	System.out.println("La somma di " + n1 + " + " + n2
    	        + " - " + n3 + " = " + res);
    	
    	if (res == 100) {
    	    out.println("QUIT");
            break;
    	} else {
    	    out.println(res);
    	}
    	
	}
    	clientSocket.close();
    	
}
	
	} catch (IOException e) {
	    e.printStackTrace();
	}

    	
	
    	
    }
}
