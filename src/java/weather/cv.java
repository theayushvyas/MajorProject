package weather;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

 public class cv{
     private static HttpURLConnection con;
 
      public JSONObject GetWeather(String city)
{
	BufferedReader br;
    String line;
    StringBuffer responsecontent = new StringBuffer();
    Scanner sc = new Scanner(System.in);

    try {
        String ApiKey = "8118ed6ee68db2debfaaa5a44c832918";
        int cnt = 5;
        String urll ="https://api.openweathermap.org/data/2.5/forecast/daily?q="+city+"&units=metric&cnt="+cnt+"&appid="+ApiKey;
       
        
        URL url = new URL(urll);
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
        //TODAYS WEATHER
        //System.out.println(responsecontent.toString());
        JSONObject json = new JSONObject(responsecontent.toString());
        JSONArray JA = json.getJSONArray("list");
        JSONObject JO = JA.getJSONObject(0);
        JSONObject temp = JO.getJSONObject("temp");
        JSONObject feels = JO.getJSONObject("feels_like");
        JSONArray weather =JO.getJSONArray("weather");
        JSONObject disc =weather.getJSONObject(0);
        return JO;
}

catch(Exception e)
{
    System.out.println(e.getMessage());
}
	return null;



        } }