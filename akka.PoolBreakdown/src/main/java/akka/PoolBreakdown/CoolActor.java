package akka.PoolBreakdown;

import akka.actor.UntypedActor;

public class CoolActor extends UntypedActor {
	
	@Override
	public void onReceive(Object arg0) throws Exception {
		if(arg0 instanceof String) {
			System.out.println("Meeeeeessage!! \n" + arg0);
		} else if(arg0 instanceof SMSMessage) {
			System.out.println("Texteeeed!!! \n" + ((SMSMessage) arg0).getMessage());
		} else {
			throw new Exception("Message type not supported.");
		}
		
	}

}
