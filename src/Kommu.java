
import javax.swing.*;

public class Kommu {

	public void Kommu() {
		JFrame frame = new JFrame("asd");
		
		String IPinput = (String) JOptionPane.showInputDialog(frame, "input IP address");
		String PortAdrres =(String) JOptionPane.showInputDialog(frame, "input port address");
		System.out.println("Port address " + PortAdrres);
		System.out.println("IpAdress " +IPinput);
		
	}

}
