package akka.PoolBreakdown;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import Stimuli.*;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

//import akka.kernel.Bootable;

public class ArtificeClusterApp {

	public static void main(String[] args) throws InterruptedException {
		if (args.length == 0){
			startup(new String[] { "2551", "2552", "0" });
		} else
			startup(args);
	}

	public static void startup(String[] ports) throws InterruptedException {

		
		for (String port : ports) {
			// Override the configuration of the port
			Config config = ConfigFactory.parseString(
					"akka.remote.netty.tcp.port=" + port).withFallback(
					ConfigFactory.load());

			ActorSystem aSystem = ActorSystem.create("ArtificeSystem", config);
			// ConfigFactory.load().getConfig("ArtificeRouter"));
		}
		
		ActorRef creature1 = aSystem.actorOf(
				Props.create(CreatureActor.class), "creature1");
		ActorRef creature2 = aSystem.actorOf(
				Props.create(CreatureActor.class), "creature2");
		ActorRef creature3 = aSystem.actorOf(
				Props.create(CreatureActor.class), "creature3");
		ActorRef creature4 = aSystem.actorOf(
				Props.create(CreatureActor.class), "creature4");
		ActorRef creature5 = aSystem.actorOf(
				Props.create(CreatureActor.class), "creature5");
		ActorRef creature6 = aSystem.actorOf(
				Props.create(CreatureActor.class), "creature6");
		ActorRef creature7 = aSystem.actorOf(
				Props.create(CreatureActor.class), "creature7");
		ActorRef creature8 = aSystem.actorOf(
				Props.create(CreatureActor.class), "creature8");
		ActorRef fruit = aSystem.actorOf(Props.create(FruitActor.class),
				"fruit1");
		ActorRef cactus = aSystem.actorOf(Props.create(CactusActor.class),
				"cactus1");

		ActorRef listener = aSystem.actorOf(Props.create(ArtificeClusterListener.class), "listener");
		
		for (int i = 0; i < 100000; i++) {
			creature1.tell(new LuminousStimulusMessage(
					"image of creature 2"), creature2);
			creature2.tell(new LuminousStimulusMessage(
					"~le image of a fruit!"), fruit);
			cactus.tell(new TouchStimulusMessage("--touched--"), creature1);
			fruit.tell(new DestructiveStimulusMessage("--touched again--"),
					creature1);
		}
		Thread.sleep(2000);
		aSystem.shutdown();

	}
}
