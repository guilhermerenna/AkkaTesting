package Stimuli;

public class SmellStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int smellSequenceNumber;
	private String text;
	
	public SmellStimulusMessage(String text) {
		super(text);
		this.smellSequenceNumber = counter;
		counter++;
	}

	public String getMessage() {
		return this.text;
	}
	
	public int getSequenceNumber() {
		return this.smellSequenceNumber;
	}

}
