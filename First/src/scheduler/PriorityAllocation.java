package scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNectCall() {
		System.out.println("Take first the call of higher-level customer");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Distribute first to the agent good at task-management-skill");
	}
}
