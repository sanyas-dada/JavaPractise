package www.sanyasdada.com.networkingRelatedtest;
import java.io.*;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
import static java.lang.System.out;

public class NetworkInterfaceTest {

	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub
	      Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
	        
	        for (NetworkInterface netIf : Collections.list(nets)) {
	            out.printf("Display name: %s\n", netIf.getDisplayName());
	            out.printf("Name: %s\n", netIf.getName());
	            displaySubInterfaces(netIf);
	            out.printf("\n");
	        }
	    }

	    static void displaySubInterfaces(NetworkInterface netIf) throws SocketException {
	        Enumeration<NetworkInterface> subIfs = netIf.getSubInterfaces();
	        
	        for (NetworkInterface subIf : Collections.list(subIfs)) {
	            out.printf("\tSub Interface Display name: %s\n", subIf.getDisplayName());
	            out.printf("\tSub Interface Name: %s\n", subIf.getName());
	        }
	     }
	}


