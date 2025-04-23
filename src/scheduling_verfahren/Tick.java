package scheduling_verfahren;

public class Tick {
	private int currentTick = 0;
	private static Tick instance = null;
	
	private Tick() {
	}
	
	public static Tick getInstance() {
		if (instance != null) {
			return instance;
		} else {
			return instance = new Tick();
		}
	}
	
	public int getCurrentTick() {
		return currentTick++;
	}

}
