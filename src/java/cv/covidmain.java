package cv;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
public class covidmain {
    private static HttpURLConnection con;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // TODO code application logic here
        System.out.println("Welcome to Corona Virus Case Tracker");
        
        
    }
    
  
        BufferedReader br;
        String line;
        StringBuffer responsecontent = new StringBuffer();
    
   
        try {
            URL url = new URL("https://api.thevirustracker.com/free-api?global=stats");
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);

            int status = con.getResponseCode();
            System.out.println(status);
            br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            while ((line = br.readLine()) != null) {
                responsecontent.append(line);
            }
            br.close();
            JSONObject jObject = new JSONObject(responsecontent.toString());
            JSONArray JA = jObject.getJSONArray("results");
            JSONObject ja1 =JA.getJSONObject(0);
            System.out.println("total cases : "+ja1.get("total_cases"));
            System.out.println("total active cases : "+ja1.get("total_serious_cases"));
            System.out.println("total recovered cases : "+ja1.get("total_recovered"));
            System.out.println("total deaths: "+ja1.get("total_deaths"));
            System.out.println("total new cases today : "+ja1.get("total_new_cases_today"));
            System.out.println("total new deaths cases: "+ja1.get("total_new_deaths_today"));
            request.setAttribute();
            
            
          // System.out.println(responsecontent.toString());
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
}
    public int India()
         {
        BufferedReader br;
        String line;
        StringBuffer responsecontent = new StringBuffer();
    
   
        try {
            URL url = new URL("https://api.thevirustracker.com/free-api?countryTotal=IN");
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);

            int status = con.getResponseCode();
            System.out.println(status);
            br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            while ((line = br.readLine()) != null) {
                responsecontent.append(line);
            }
            br.close();
          //  System.out.println(responsecontent.toString());
           JSONObject jObject = new JSONObject(responsecontent.toString());
            JSONArray ja =jObject.getJSONArray("countrydata");
        //  System.out.println(ja);
            JSONObject ja1 = ja.getJSONObject(0);
           // System.out.println(ja1);
          //  JSONObject ja2 =ja1.getJSONObject("total_active_cases");
            System.out.println("total cases : "+ja1.get("total_cases"));
            System.out.println("total active cases : "+ja1.get("total_serious_cases"));
            System.out.println("total recovered cases : "+ja1.get("total_recovered"));
            System.out.println("total deaths: "+ja1.get("total_deaths"));
            System.out.println("total new cases today : "+ja1.get("total_new_cases_today"));
            System.out.println("total new deaths cases: "+ja1.get("total_new_deaths_today"));
            int a = ja1.getInt("total_cases");
            int b = ja1.getInt("total_recovered");
            return a;
            
            
            
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
}
    public void All()
         {
    	Scanner sc = new Scanner(System.in);
        BufferedReader br;
        String line;
        StringBuffer responsecontent = new StringBuffer();
       
   
        try {
            URL url = new URL("https://api.thevirustracker.com/free-api?countryTotals=ALL%27");
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);

            int status = con.getResponseCode();
            System.out.println(status);
            br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            while ((line = br.readLine()) != null) {
                responsecontent.append(line);
            }
            br.close();
            JSONObject JO = new JSONObject(responsecontent.toString());
            JSONArray ja =JO.getJSONArray("countryitems");
           //JSONObject JO1 =ja.getJSONObject(0);
           JSONObject af = ja.getJSONObject(1);
            	System.out.println("total cases : "+af.get("total_cases"));
                System.out.println("total active cases : "+af.get("total_serious_cases"));
                System.out.println("total recovered cases : "+af.get("total_recovered"));
                System.out.println("total deaths: "+af.get("total_deaths"));
                System.out.println("total new cases today : "+af.get("total_new_cases_today"));
               System.out.println("total new deaths cases: "+af.get("total_new_deaths_today"));
            
            ///System.out.println(responsecontent.toString());
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    
    
}
    public void TimeLineIN()
         {
        BufferedReader br;
        String line;
        StringBuffer responsecontent = new StringBuffer();
    
   
        try {
            URL url = new URL("https://api.thevirustracker.com/free-api?countryTimeline=IN");
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);

            int status = con.getResponseCode();
            System.out.println(status);
            br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            while ((line = br.readLine()) != null) {
                responsecontent.append(line);
            }
            br.close();
            System.out.println(responsecontent.toString());
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
}}

}
