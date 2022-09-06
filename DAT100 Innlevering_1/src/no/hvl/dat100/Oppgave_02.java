package no.hvl.dat100;

import static java.lang.Double.*;
import static java.lang.Math.*;
import static java.lang.Object.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_02 {

	public static void main(String[] args) {

		final int MAX_ANT_E = 10;
		final int MIN_ANT_E = 1;

		int e = 0; // e står for elev
		
		
		
		for (e = 1; e <= MAX_ANT_E; e++) {

			int karakter = Integer.parseInt(showInputDialog("Din karakter: "));

			if (karakter <= 100 && karakter >= 90) {
				System.out.println("Du fikk A");

			} else if (karakter <= 89 && karakter >= 80) {
				System.out.println("Du fikk B");

			} else if (karakter <= 79 && karakter >= 60) {
				System.out.println("Du fikk C");

			} else if (karakter <= 59 && karakter >= 50) {
				System.out.println("Du fikk D");

			} else if (karakter <= 49 && karakter >= 40) {
				System.out.println("Du fikk E");

			} else if (karakter <= 39 && karakter >= 0) {
				System.out.println("Du fikk F");

			} else if (karakter > 100 && karakter < 0) {
				System.out.println("Ugyldig poengsum");
			} else {
				showMessageDialog(null, "Ugyldig sum: " + karakter);
				e--;
			}

		}

	}

}
