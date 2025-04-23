package quersumme_n_bis_m;

public class Main {
	public static int gesuchteQuersumme = 9;
	
	
	/*
	 * Die Anno-Spielreihe bringt seit mehreren Jahren nun Spiele immer mit denen
	 * Spieljahren heraus, die eine Quersumme von 9 haben.
	 */
	public static void main(String[] args) {
		vonBis(0, 3000);
		
		
	}
	
	public static void vonBis(int x, int y) {
		for (int i = x; i < y;i++) {
			int total = 0;
			char[] arr = iToArray(i);
			
			total = quersumme(arr);
			
			if (total == gesuchteQuersumme) {
				output(arr);
			}
			
		}
	}
	
	public static int quersumme(char[] arr) {
		int zahl = 0;
		
		for(int j = 0;j < arr.length;j++) {
			zahl += Character.getNumericValue(arr[j]);
		}
		
		return zahl;
	}
	
	public static char[] iToArray(Integer zahl) {
		String s = zahl.toString();
		char[] arr = new char[s.length()];
		
		for (int i = 0;i < arr.length;i++) {
			arr[i] = s.charAt(i);
		}
		
		return arr;
	}
	public static void output(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
