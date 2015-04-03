package akka.PoolBreakdown;

public class SMSMessage {
	private static int counter = 0; 
	private final int sequenceNumber;
	private final String text;
	
	public SMSMessage(String text) {
		super();
		this.text = text;
		this.sequenceNumber = counter;
		counter++;
	}

	public String getMessage() {
		return this.text;
	}
	
	public int getSequenceNumber() {
		return this.sequenceNumber;
	}

}
