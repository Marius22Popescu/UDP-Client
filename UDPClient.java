import java.io.*;
import java.net.*;
import java.util.Scanner;
public class UDPClient {
	public static void main(String args[]) {
	    try {
	    	  // Create a datagram socket
		  DatagramSocket datagramSocket = new DatagramSocket();
		  
		  //Create variable
	      int port = 8080;
	      String message = "";
	      Scanner console = new Scanner(System.in);
	      System.out.println("Please enter your a message:");  //Ask the user for a message and store it
		  message = console.nextLine();	  
	      byte[] buffer = new byte[65508];   //create the buffer
	      buffer = message.getBytes();
	      // Get the Internet address of the local host
	      InetAddress receiverAddress = InetAddress.getLocalHost();
	      // Initialize a datagram packet with data and address
	      DatagramPacket packet = new DatagramPacket(buffer, buffer.length, receiverAddress, port);
	      datagramSocket.send(packet);  //Send the package through the socket	      
	      datagramSocket.close();  //Close the socket
	      
	    } catch (Exception e) {
	      System.err.println(e);
	    }
	  }
}


//_________Bibliography:
// http://tutorials.jenkov.com/java-networking/udp-datagram-sockets.html
// http://www.java2s.com/Code/Java/Network-Protocol/SendoutUDPpockets.htm