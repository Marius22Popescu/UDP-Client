import java.io.*;
import java.net.*;
public class UDPServer {
	public static void main(String args[]) {
	    try {
	    	// Create a datagram socket
	    	DatagramSocket datagramSocket = new DatagramSocket(8080);
	    	//create the buffer
	    	byte[] buffer = new byte[65508]; 
	    	// Initialize a datagram packet 
	    	DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
	    	//Receive a packet through the socket
	    	datagramSocket.receive(packet);
	    	//Obtaining the data
	    	buffer = packet.getData();
	    String message = new String(buffer); //Convert from bytes to string
	    	//Display the message from the UDPClient
	    	 System.out.println("The message ftom the UDP Client is: " + message);
	    } catch (Exception e) {
		      System.err.println(e);
		    }
	}
}
