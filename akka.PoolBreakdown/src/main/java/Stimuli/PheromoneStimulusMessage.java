package Stimuli;

public class PheromoneStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int pheromoneSequenceNumber;
	private String text;
	
	public PheromoneStimulusMessage(String text) {
		super(text);
		this.pheromoneSequenceNumber = counter;
		counter++;
	}

	public String getMessage() {
		return this.text;
	}
	
	public int getSequenceNumber() {
		return this.pheromoneSequenceNumber;
	}

}
