package Stimuli;

public class GeneticStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int geneticSequenceNumber;
	private String text;
	
	public GeneticStimulusMessage(String text) {
		super(text);
		this.geneticSequenceNumber = counter;
		counter++;
	}

	public String getMessage() {
		return this.text;
	}
	
	public int getSequenceNumber() {
		return this.geneticSequenceNumber;
	}

}
