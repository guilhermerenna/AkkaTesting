package Stimuli;

public class DestructiveStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int destructiveSequenceNumber;
	private String text;
	
	public DestructiveStimulusMessage(String text) {
		super(text);
		this.destructiveSequenceNumber = counter;
		counter++;
	}

	public String getMessage() {
		return this.text;
	}
	
	public int getSequenceNumber() {
		return this.destructiveSequenceNumber;
	}

}
