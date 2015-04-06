package Stimuli;

public class TouchStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int energeticSequenceNumber;
	private String text;
	
	public TouchStimulusMessage(String text) {
		super(text);
		this.energeticSequenceNumber = counter;
		counter++;
	}

	public String getMessage() {
		return this.text;
	}
	
	public int getSequenceNumber() {
		return this.energeticSequenceNumber;
	}

}
