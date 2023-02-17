package scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNectCall() {
		System.out.println("Take consulting call in order in the queue");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Distribute to agent in the following order");
	}
}
