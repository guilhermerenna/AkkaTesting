package Stimuli;

public abstract	class StimulusMessage {
	private static int counter = 0; 
	private final int sequenceNumber;
	private String text;
	
	public StimulusMessage(String text) {
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
