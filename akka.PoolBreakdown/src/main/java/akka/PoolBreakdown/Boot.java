package akka.PoolBreakdown;

import Creature.CreatureActor;
import Stimuli.*;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

//import akka.kernel.Bootable;

public class Boot {

	public static void main(String[] args) {
		ActorSystem actorSystem = ActorSystem.create("MySystem");
		ActorRef creature1 = actorSystem.actorOf(
				new Props(CreatureActor.class), "creature1");
		ActorRef creature2 = actorSystem.actorOf(
				new Props(CreatureActor.class), "creature2");
		ActorRef fruit = actorSystem.actorOf(
				new Props(CreatureActor.class), "fruit1");
		// actorRef.tell( new MyMessage( "Hello, Akka!" ) );
		creature1.tell(new LuminousStimulusMessage("~le image of creature 2"));
		creature2.tell(new LuminousStimulusMessage("~le image of a fruit!"));
		fruit.tell(new TouchStimulusMessage("--touched--"), creature1);
		fruit.tell(new DestructiveStimulusMessage("--touched--"), creature1);
	}

}
