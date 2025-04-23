package scheduling_verfahren;

public class Main {
	public static void main(String[] args) {
		Process[] processlist = createProcesses();
		
		FIFO f = new FIFO();
		int[] res = f.finishProcesses(processlist);
		
		outputArray(res);
	}
	
	private static Process[] createProcesses() {
		Process pr[] = new Process[5];
		
		pr[0] = new Process(15);
		pr[1] = new Process(7);
		pr[2] = new Process(1, 3);
		pr[3] = new Process(4, 6);
		pr[4] = new Process(8, 6);
		
		return pr;
	}
	
	private static void outputArray(int[] arr) {
		for (int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}


