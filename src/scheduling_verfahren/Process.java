package scheduling_verfahren;

public class Process {
	private int bearbeitungszeit;
	private int ankunftszeit = 0;
	private int prozessnummer;
	private static int counter = 1;
	
	public Process(int b) {
		bearbeitungszeit = b;
		prozessnummer = counter;
		counter++;
	}
	public Process(int b, int a) {
		bearbeitungszeit = b;
		ankunftszeit = a;
		prozessnummer = counter;
		counter++;
	}
	
	public void bearbeiten(int time) {
		if (time < ankunftszeit) {
			System.out.println("Prozess noch nicht bereit!");
		} else {
			bearbeitungszeit--;	
		}
		
		//System.out.print(this.toString());
	
	}
	
	public boolean isFinished() {
		if (bearbeitungszeit == 0) {
			return true;
		} else
			return false;
	}
	
	public char getProzessnummer() {
		return (char) prozessnummer;
	}
	
	public int getBearbeitungszeit() {
		return bearbeitungszeit;
	}
	
	public String toString() {
		return "Prozess " + prozessnummer + ": Bearbeitungszeit: " + bearbeitungszeit + " Ankunftszeit: "  +ankunftszeit + " ";
	}
}
