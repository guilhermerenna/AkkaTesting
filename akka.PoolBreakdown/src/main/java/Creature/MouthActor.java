package Creature;

import Stimuli.*;
import akka.actor.UntypedActor;

public class MouthActor extends UntypedActor {
	
	@Override
	public void onReceive(Object arg0) throws Exception {
		if(arg0 instanceof SpikeStimulusMessage) {
			System.out.println("Ouch! A spike! Ref.: " + ((SpikeStimulusMessage) arg0).getSequenceNumber());
		} else if(arg0 instanceof TickleStimulusMessage) {
			System.out.println("Tickle stimulus received. Ref.: " + ((TickleStimulusMessage) arg0).getSequenceNumber());
		} else if(arg0 instanceof EnergeticStimulusMessage) {
			System.out.println("Energetic stimulus received. Ref.: " + ((SpikeStimulusMessage) arg0).getSequenceNumber());
		} else if(arg0 instanceof MechanicalStimulusMessage) {
			System.out.println("Mechanical stimulus received. Ref.: " + ((MechanicalStimulusMessage) arg0).getSequenceNumber());
		} else if(arg0 instanceof StimulusMessage) {
			System.out.println("Unknown stimulus received. Discarding ref. " + ((StimulusMessage) arg0).getMessage());
		} else {
			throw new Exception("Message type not supported.");
		}
		
	}

}
