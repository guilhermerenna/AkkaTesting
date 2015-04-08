package akka.PoolBreakdown;

import Stimuli.*;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

//import akka.kernel.Bootable;

public class Boot {

	public static void main(String[] args) throws InterruptedException {
		ActorSystem actorSystem = ActorSystem.create("MySystem");
		ActorRef creature1 = actorSystem.actorOf(
				new Props(CreatureActor.class), "creature1");
		ActorRef creature2 = actorSystem.actorOf(
				new Props(CreatureActor.class), "creature2");
		ActorRef fruit = actorSystem.actorOf(
				new Props(FruitActor.class), "fruit1");
		ActorRef cactus = actorSystem.actorOf(
				new Props(CactusActor.class), "cactus1");

		creature1.tell(new LuminousStimulusMessage("image of creature 2"),creature2);
		creature2.tell(new LuminousStimulusMessage("~le image of a fruit!"),fruit);
		cactus.tell(new TouchStimulusMessage("--touched--"), creature1);
		fruit.tell(new DestructiveStimulusMessage("--touched again--"), creature1);
		Thread.sleep(1000);
		actorSystem.shutdown();
	}

}
