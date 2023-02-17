package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException{
		System.out.println("Select the way of the consulting call assignment");
		System.out.println("R : assign one by one");
		System.out.println("L : assign to the agent resting or has the least queue");
		System.out.println("P : assign first to the higher-priority customer");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("the unsupported function");
		}
		
		scheduler.getNectCall();
		scheduler.sendCallToAgent();
	}

}
