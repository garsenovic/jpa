package at.crosspi.jpa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timestamp {
	
	public Timestamp(){
		      
	}
	
	public String getTime(long timestamp){
		Date datum = new Date (timestamp * 1000);
        SimpleDateFormat sfd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dt = sfd.format(datum);
        return dt;
	}
}
