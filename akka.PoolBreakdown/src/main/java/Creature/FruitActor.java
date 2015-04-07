package Creature;

import Stimuli.*;
import akka.actor.UntypedActor;

public class FruitActor extends UntypedActor {
	
	@Override
	public void onReceive(Object arg0) throws Exception {
		if(arg0 instanceof LuminousStimulusMessage) {
			System.out.println("A can see something! "+((LuminousStimulusMessage) arg0).getMessage()+"! Ref.: " + ((LuminousStimulusMessage) arg0).getSequenceNumber());
		} else if(arg0 instanceof TouchStimulusMessage) {
			System.out.println("Something toched me! Touching back... "+((TouchStimulusMessage) arg0).getMessage()+"! Ref.: " + ((TouchStimulusMessage) arg0).getSequenceNumber());
			//TODO get sender ((TouchStimulusMessage) arg0).
		} else if(arg0 instanceof DestructiveStimulusMessage) {
			System.out.println("Destructive stimulus?! Bye, bye, world! Ref.: " + ((DestructiveStimulusMessage) arg0).getSequenceNumber());
			//TODO destruct itself.
			try {
				this.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if(arg0 instanceof StimulusMessage) {
			System.out.println("Unknown stimulus received. Discarding ref. " + ((StimulusMessage) arg0).getMessage());
		} else {
			throw new Exception("Message type not supported.");
		}
		
	}

}
