package solutions.challenge2.solution4.running;

public class NoRunning implements RunBehaviour {

	@Override
	public void run() {
		System.out.println("Cannot Run");
	}

	@Override
	public boolean canRun() {
		return false;
	}

}
