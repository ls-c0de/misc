package scheduling_verfahren;

public class FIFO implements IAlgorithmn {
	private Tick tick = Tick.getInstance();
	
	@Override
	public int[] finishProcesses(Process[] list) {
		int[] res = new int[calculateTotalTime(list)];
		
		for (int i = 0;i < list.length;i++) {
			while (list[i].isFinished() != true) {
				int currentTick = tick.getCurrentTick();
				list[i].bearbeiten(currentTick);
				res[currentTick] = list[i].getProzessnummer();
			}
		}
		
		System.out.println("Done!");
		
		return res;
	}
	
	private int calculateTotalTime(Process[] list) {
		int sum = 0;
		for (int i = 0;i< list.length;i++) {
			sum += list[i].getBearbeitungszeit();
		}
		return sum;
	}

}
