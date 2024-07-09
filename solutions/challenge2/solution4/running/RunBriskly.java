package solutions.challenge2.solution4.running;

public class RunBriskly implements RunBehaviour {

	@Override
	public void run() {
		System.out.println("Running Briskly");
	}

	@Override
	public boolean canRun() {
		return true;
	}

}
