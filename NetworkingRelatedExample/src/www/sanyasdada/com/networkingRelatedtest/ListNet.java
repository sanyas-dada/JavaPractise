package www.sanyasdada.com.networkingRelatedtest;

import java.io.*;
import java.net.*;
import java.util.*;
import static java.lang.System.out;

public class ListNet {

	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub
		  Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
	        for (NetworkInterface netint : Collections.list(nets))
	            displayInterfaceInformation(netint);
	    }

	    static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
	        out.printf("Display name: %s\n", netint.getDisplayName());
	        out.printf("Name: %s\n", netint.getName());
	        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
	        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
	            out.printf("InetAddress: %s\n", inetAddress);
	        }
	        out.printf("\n");
	     }
      

	}
