package no.hvl.dat100;

import static java.lang.Double.*;
import static java.lang.Math.*;
import static java.lang.Object.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_03 {

	public static void main(String[] args) {

		int fakultet = Integer.parseInt(showInputDialog("Gi et tall: "));

		int sum = 1;
		System.out.println("Resultatet av " + fakultet + "! er:");
		for (int i = fakultet; i > 0; i--) {

			sum *= i;
			if (i > 1) {
				System.out.print(i + " * ");
			} else {
				System.out.print(i);
			}

		}
		System.out.print(" = " + sum);
	}

}
