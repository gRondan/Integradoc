package backend;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class DataCollector {
	private  String baseUrl = "http://api.football-data.org/v1/teams/teamIdToReplace/fixtures";
	private  String filter = "/?timeFrame=daysToReplace";
	public DataCollector() {
		
	}
	public  Match getMatchData(String teamId){
		
		baseUrl = baseUrl.replaceAll("teamIdToReplace", teamId);
		
		Fixture dataFixture = new Fixture();
		boolean flag = true;
		int daysFrame = 10;
		while(flag || dataFixture.getCount() == 0) {
			filter = filter.replaceAll("daysToReplace", "p"+String.valueOf(daysFrame));
			String url = baseUrl+filter;
			String response = makeRequest(url);
			System.out.println(response);
			dataFixture = new Gson().fromJson(response, Fixture.class);
			daysFrame += 10;
			flag = false;
		}
		return dataFixture.getFixtures()[dataFixture.getCount()-1];
	}
	
	private   String makeRequest(String url) {
	    HttpURLConnection c = null;
	    try {
	    	
	      URL u = new URL(url);
	      c = (HttpURLConnection) u.openConnection();
	      c.setRequestMethod("GET");
	      c.setRequestProperty("Content-length", "0");
	      c.setRequestProperty("X-Auth-Token", "602b52033cea415eb549b2cacc9a1cc0"); 
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
			System.out.println(ex.getMessage());
			return null;
	    }
		return null; 
	  
	}
}
