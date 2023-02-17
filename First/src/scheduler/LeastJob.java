package scheduler;

public class LeastJob implements Scheduler{

	@Override
	public void getNectCall() {
		System.out.println("Take consulting call in order in the queue");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Assign to the agent who has no task or the least queue");
	}
}
