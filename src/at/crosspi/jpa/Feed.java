package at.crosspi.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Feed {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int fid;
	private String name;
	private String tag;
	private String value;
	private long time;
	
	public Feed ( int fid, String name, String tag, String value, long time){
		super( );
		this.fid = fid;
		this.name = name;
		this.tag = tag;
		this.value = value;
		this.time = time;
	}
	
	public Feed(){
		super();
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	
	@Override
	public String toString(){
		return "Feed [fid=" + fid + ", name=" + name + ", tag=" + tag + ", value=" + value + ", time=" + time + "]";
	}
	
	

}
