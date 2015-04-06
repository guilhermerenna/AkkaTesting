package Creature;

import Stimuli.*;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

public class CreatureActor extends UntypedActor {
	private final ActorRef mouth = getContext().actorOf(Props.create(MouthActor.class),"mouth");
	private final ActorRef nose = getContext().actorOf(Props.create(NoseActor.class));
	
	
	@Override
	public void onReceive(Object arg0) throws Exception {
		if(arg0 instanceof SmellStimulusMessage) {
			System.out.println("Smell stimulus received. Forwarding to nose...");
			nose.tell(arg0);
		} else if(arg0 instanceof PheromoneStimulusMessage) {
			System.out.println("Pheromone stimulus received. Forwarding to nose...");
			nose.tell(arg0);
		} else if(arg0 instanceof SpikeStimulusMessage) {
			System.out.println("Spike stimulus received. Forwarding to nose...");
			mouth.tell(arg0);
		} else if(arg0 instanceof TickleStimulusMessage) {
			System.out.println("Tickle stimulus received. Forwarding to nose...");
			mouth.tell(arg0);
		} else if(arg0 instanceof EnergeticStimulusMessage) {
			System.out.println("Energetic stimulus received. Forwarding to nose...");
			mouth.tell(arg0);
		} else if(arg0 instanceof MechanicalStimulusMessage) {
			System.out.println("Mechanical stimulus received. Forwarding to nose...");
			mouth.tell(arg0);
		} if(arg0 instanceof StimulusMessage) {
			System.out.println("Unknown stimulus received. Discarding... Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
		} else {
			throw new Exception("Message type not supported.");
		}
		
	}

}
