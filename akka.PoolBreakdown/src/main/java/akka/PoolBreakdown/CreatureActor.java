package akka.PoolBreakdown;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;

public class CreatureActor extends UntypedActor {
	public void onReceive(Object message) {
		System.out.println(message.toString());
		if (message instanceof SMSMessage) {
			// System.out.println( "My message is: " + ( ( MyMessage )message
			// ).getMessage() );
			System.out.println(message);
		}
	}

	public void sendStimulus() {
		// TODO: missing...
	}

	public static void main(String[] args) {
		ActorSystem actorSystem = ActorSystem.create("MySystem");
		ActorRef creature1 = actorSystem.actorOf(
				new Props(CreatureActor.class), "creature1");
		ActorRef creature2 = actorSystem.actorOf(
				new Props(CreatureActor.class), "creature2");
		// actorRef.tell( new MyMessage( "Hello, Akka!" ) );
		creature1.tell("Hello akka");
		// creature2.sendStimulus();
	}
}