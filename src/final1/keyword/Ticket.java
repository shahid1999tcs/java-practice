package final1.keyword;

public class Ticket {
	private final String movie = "Batman";
	private float price;
	public final void sell() {
		
	}
	public final void sell(float price) {
		
	}
}

class IlleagalTicket extends Ticket{
	public final void sell(float price) {
		
	}
	
}
