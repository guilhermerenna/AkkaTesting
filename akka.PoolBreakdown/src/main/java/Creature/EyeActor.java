package Creature;

import Stimuli.*;
import akka.actor.UntypedActor;

public class EyeActor extends UntypedActor {
	
	@Override
	public void onReceive(Object arg0) throws Exception {
		if(arg0 instanceof LuminousStimulusMessage) {
			System.out.println("A can see something! "+((LuminousStimulusMessage) arg0).getMessage()+"! Ref.: " + ((LuminousStimulusMessage) arg0).getSequenceNumber());
		} else if(arg0 instanceof StimulusMessage) {
			System.out.println("Unknown stimulus received. Discarding ref. " + ((StimulusMessage) arg0).getMessage());
		} else {
			throw new Exception("Message type not supported.");
		}
		
	}

}
