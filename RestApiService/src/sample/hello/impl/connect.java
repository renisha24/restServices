package sample.hello.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class connect {

	public static void main(String[] args) {
		try {
		    URL myURL = new URL("https://herewegoyea.blogspot.in/2016/09/all-about-staying-in-bangalore.html");
		    URLConnection myURLConnection = myURL.openConnection();
		    myURLConnection.connect();
		    System.out.println("done");
		} 
		catch (MalformedURLException e) { 
		    // new URL() failed
		    // ...
		} 
		catch (IOException e) {   
		    // openConnection() failed
		    // ...
		}
	}

}
