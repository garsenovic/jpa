package at.crosspi.jpa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JsonUrlArray {



  private static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
      sb.append((char) cp);
    }
    return sb.toString();
  }

  public static JSONArray readJsonFromUrl(String url) throws IOException, JSONException {
    InputStream is = new URL(url).openStream();
    try {
      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      String jsonText = readAll(rd);
      JSONArray json = new JSONArray(jsonText);
      return json;
    } finally {
      is.close();
    }
  }

  public static void main(String[] args) throws IOException, JSONException {
    JSONArray json = readJsonFromUrl("https://crosspi.at/xpi/feed/list.json&apikey=394c86968bb0c69ff0fe1f482de52829");
    //System.out.println(json.toString());
    Timestamp time = new Timestamp();
    //System.out.println(json.get(1));
    
    for (int i=0; i < json.length(); i++){
    	System.out.println("Index: " + i + " ID: " + json.getJSONObject(i).get("id").toString() + " " 
    			+ json.getJSONObject(i).get("tag").toString()
    			+ " - " + json.getJSONObject(i).get("name").toString() + ": " + json.getJSONObject(i).get("value").toString()
    			+ " Datum/Uhrzeit: " + time.getTime(json.getJSONObject(i).getLong("time")));
    	
    	
    }
         
  
    
        
}
}
