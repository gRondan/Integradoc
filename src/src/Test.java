package src;
import java.io.*;
import java.net.*;
import javax.swing.*;

//import com.evanotero.footballcontainer.*;
//import com.google.gson.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeRequest());
	}

	private static String makeRequest() {
	    HttpURLConnection c = null;
	    try {
	    	String url = "http://api.football-data.org/v1/teams/73/fixtures/?timeFrame=p20";
	    	
	      URL u = new URL(url);
	      c = (HttpURLConnection) u.openConnection();
	      c.setRequestMethod("GET");
	      c.setRequestProperty("Content-length", "0");
	      c.setRequestProperty("X-Auth-Token", "602b52033cea415eb549b2cacc9a1cc0"); // API Token
	      c.setUseCaches(false);
	      c.setAllowUserInteraction(false);
	      c.setConnectTimeout(2000);
	      c.setReadTimeout(2000);
	      c.connect();
	      int status = c.getResponseCode();
	      
	      switch (status) {
	        case 200:
	        case 201:
	          BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
	          StringBuilder sb = new StringBuilder();
	          String line;
	          while ((line = br.readLine()) != null) {
	            sb.append(line+"\n");
	          }
	          br.close();
	          return sb.toString();
	      }
	      
	    } catch (IOException ex) {
			JOptionPane.showMessageDialog(new JFrame(), ex.getMessage()+" - closing application.","Error",JOptionPane.ERROR_MESSAGE);
			System.exit(1);
	    } finally {
	      if (c != null) {
	        try {
	          c.disconnect();
	        } catch (Exception ex) {
	        	JOptionPane.showMessageDialog(new JFrame(), ex.getMessage()+" - closing application.","Error",JOptionPane.ERROR_MESSAGE);
	            System.exit(1);
	        }
	      }
	    }
	    return null;
	  
	}

}
