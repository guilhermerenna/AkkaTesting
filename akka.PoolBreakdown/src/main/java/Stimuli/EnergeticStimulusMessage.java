package Stimuli;

public class EnergeticStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int touchSequenceNumber;
	private String text;
	
	public EnergeticStimulusMessage(String text) {
		super(text);
		this.touchSequenceNumber = counter;
		counter++;
	}

	public String getMessage() {
		return this.text;
	}
	
	public int getSequenceNumber() {
		return this.touchSequenceNumber;
	}

}
