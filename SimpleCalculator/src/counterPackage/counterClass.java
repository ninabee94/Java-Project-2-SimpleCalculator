package counterPackage;

public class counterClass {
	
	private int total;
	private String symbol;
	
	public int count(int first, int second, int ops) {
		switch(ops) {
		   case 1: total=first+second; break;
		   case 2: total=first-second; break;
		   case 3: total=first*second; break;
		   case 4: total=first/second; break;
		}
		return total;
	}
	
	public String convert(int ops) {
		switch(ops) {
		   case 1: symbol="+"; break;
		   case 2: symbol="-"; break;		   			   
		   case 3: symbol="*"; break;
		   case 4: symbol="/"; break;
		}
		return symbol;
	}

}
