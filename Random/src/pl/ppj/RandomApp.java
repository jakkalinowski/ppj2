package pl.ppj;

import java.util.Arrays;
import java.util.Random;
/**
 * Klasa g³ówna
 * 
 * @author U¿ytkownik WEiTI
 *
 */
public class RandomApp {
	
	
	/**
	 * Metoda g³ówna
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] table = new int[50][2];
		Random rand = new Random();
		int counter = 0;
		/**
		 * zmianna empty
		 */
		int empty = 0;
		int attempt = 20000;
		
		do {
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					if (j == 0)
						table[i][j] = i;
					else if (i == rand.nextInt(attempt) && j == 1)
						table[i][j] += 1;
				}
			}
			counter++;
		} while (counter < attempt-1);

		System.out.println(Arrays.deepToString(table));
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (table[i][j]==0) empty++;
			}
		}
		System.out.println("Numbers not drawn: " + empty * 1. / table.length );
	}

}
