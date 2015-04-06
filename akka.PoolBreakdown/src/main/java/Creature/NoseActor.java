package Creature;

import Stimuli.*;
import akka.actor.UntypedActor;

public class NoseActor extends UntypedActor {
	private MouthActor mouth;
	private NoseActor nose;
	
	@Override
	public void onReceive(Object arg0) throws Exception {
		if(arg0 instanceof SmellStimulusMessage) {
			System.out.println("Sniff! Smell stimulus received! Ref.: " + ((SmellStimulusMessage) arg0).getSequenceNumber());
		} else if(arg0 instanceof PheromoneStimulusMessage) {
			System.out.println("Pheromone stimulus received. Ref.: " + ((PheromoneStimulusMessage) arg0).getSequenceNumber());
		} else if(arg0 instanceof StimulusMessage) {
			System.out.println("Unknown stimulus received. Discarding ref. " + ((StimulusMessage) arg0).getMessage());
		} else {
			throw new Exception("Message type not supported.");
		}
		
	}

}
