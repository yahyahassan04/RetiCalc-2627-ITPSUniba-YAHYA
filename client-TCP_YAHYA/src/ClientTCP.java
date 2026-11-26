
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientTCP {

    public static void main(String[] args) {

    	

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter server IP: ");
	String serverIP = scanner.nextLine();
	
	System.out.print("Enter server port: ");
	int port = scanner.nextInt();
	

	try {
	    Socket socket = new Socket(serverIP, port);
	
	    System.out.println("Connected to server: " 
	            + socket.getInetAddress().getHostAddress());
	    
	    BufferedReader in = new BufferedReader(
	    	    new InputStreamReader(socket.getInputStream()));

	    	PrintWriter out = new PrintWriter(
	    	    socket.getOutputStream(), true);

	    	String message = in.readLine();
	    	System.out.println("Server: " + message);
	    	
	    	while (true) {
	    	    System.out.print("Enter n1: ");
	    	    int n1 = scanner.nextInt();

	    	    System.out.print("Enter n2: ");
	    	    int n2 = scanner.nextInt();

	    	    System.out.print("Enter n3: ");
	    	    int n3 = scanner.nextInt();

	    	    out.println(n1);
	    	    out.println(n2);
	    	    out.println(n3);
	    	    
	    	    String response = in.readLine();

	    	    if (response == null || response.equals("QUIT")) {
	    	        System.out.println("Server disconnected or sent QUIT.");
	    	        break;
	    	    }

	    	    System.out.println("Result from server: " + response);
	    	}
	    	socket.close();
	    	scanner.close();
	
	} catch (IOException e) {
	    System.out.println("Connection error: " + e.getMessage());
	}

    	
    	
    	
    }
}
