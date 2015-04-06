package Stimuli;

public class TickleStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int tickleSequenceNumber;
	private String text;
	
	public TickleStimulusMessage(String text) {
		super(text);
		this.tickleSequenceNumber = counter;
		counter++;
	}

	public String getMessage() {
		return this.text;
	}
	
	public int getSequenceNumber() {
		return this.tickleSequenceNumber;
	}

}
