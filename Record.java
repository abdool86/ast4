
public class Record {
	Pair key;
	String data;
	public Record(Pair key, String data) {
		this.key = key;
		this.data = data;
	}
	
	public Pair getKey() {
		return this.key;
	}
	
	public String getData() {
		return this.data;
	}
	
}
