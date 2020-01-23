
public class TTime {
	public static void main(String[] args){
		
	String inTime = Terminal.getString("Please type in a time in the format H[H]:M[M]:S[S]");
	Time TimeObject = new Time(inTime);
	Terminal.put("TimeObject has been created, time entered is: " + TimeObject);
	}
} 
