package Stimuli;

public class LuminousStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int luminousSequenceNumber;
	private String text;
	
	public LuminousStimulusMessage(String text) {
		super(text);
		this.luminousSequenceNumber = counter;
		counter++;
	}

	public String getMessage() {
		return this.text;
	}
	
	public int getSequenceNumber() {
		return this.luminousSequenceNumber;
	}

}
