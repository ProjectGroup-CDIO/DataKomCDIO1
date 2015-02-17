
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.*;

public class Kommu {

	public void Kommu() {
		JFrame frame = new JFrame("asd");

		String IPinput = (String) JOptionPane.showInputDialog(frame, "input IP address");
		String PortAdrres =(String) JOptionPane.showInputDialog(frame, "input port address");

		Socket s = null;  
		DataOutputStream outputStream = null;
		DataInputStream inputstream = null;

		System.out.println("IpAdress " +IPinput);
		System.out.println("Port address " + PortAdrres);

		Scanner scanner = new Scanner(System.in);

		try {
			s = new Socket(IPinput,Integer.parseInt(PortAdrres));
			outputStream = new DataOutputStream(s.getOutputStream());
			inputstream = new DataInputStream(s.getInputStream());
		} catch (UnknownHostException e) {
			System.err.println("Don't know about host: hostname");
		} catch (IOException e) {
			System.err.println("Couldn't get I/O for the connection to: hostname");
		}
		while(scanner.hasNext()){
			String dataInput = scanner.nextLine();




		}

	}
}
