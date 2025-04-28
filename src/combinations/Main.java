package combinations;

public class Main {
	public static void main(String[] args) {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] easy = "abc".toCharArray();
		
		generateCombinations(easy, 3);
	}
	
	private static void doSomething(String s) {
		System.out.println(s);
	}
	
	//ChatGPT
	public static void generateCombinations(char[] alphabet, int maxStellen) {
        for (int stellen = 1; stellen <= maxStellen; stellen++) {
            int[] indices = new int[stellen];
            while (true) {
                // Aktuelle Kombination ausgeben
                StringBuilder sb = new StringBuilder();
                for (int index : indices) {
                    sb.append(alphabet[index]);
                }
                //System.out.println(sb);
                doSomething(sb.toString());
                
                // Zähler erhöhen (wie bei einem Zahlensystem)
                int pos = stellen - 1;
                while (pos >= 0) {
                    indices[pos]++;
                    if (indices[pos] < alphabet.length) {
                        break;
                    } else {
                        indices[pos] = 0;
                        pos--;
                    }
                }
                // Wenn wir an der ersten Stelle überlaufen, sind wir fertig
                if (pos < 0) {
                    break;
                }
            }
        }
	}
}
