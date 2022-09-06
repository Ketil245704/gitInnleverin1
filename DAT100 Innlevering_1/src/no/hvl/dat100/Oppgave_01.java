package no.hvl.dat100;

import static java.lang.Double.*;
import static java.lang.Math.*;
import static java.lang.Math.min;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Oppgave_01 {
	
public static void main(String[] args) {
		
		double sats0 = 0.00;
		double sats1 = 0.093;
		double sats2 = 0.241;
		double sats3 = 0.1152;
		double sats4 = 0.145200;
		
		int brutto = Integer.parseInt(showInputDialog("Års inntekt før skatt: "));
		
		double inntekt = brutto ;
		
		
		if (brutto >= 0 && brutto <= 164100) {
			double skatt = inntekt;
			System.out.println("Din skatt er: " + inntekt * sats0);
			System.out.println("Din lønn er: " + inntekt);
		
		} else if (brutto >= 164101 && brutto <= 230950) {
			double skatt = inntekt * sats1;
			System.out.println("Dinn skatt er: " + skatt);
			System.out.println("Din lønn er: " + (inntekt - skatt));

		} else if (brutto >= 230951 && brutto <= 580650 ) {
			double skatt = inntekt * sats2;
			System.out.println("Dinn skatt er: " + skatt);
			System.out.println("Din lønn er: " + (inntekt - skatt));

		} else if (brutto >= 580651 && brutto <= 934050) {
			double skatt = inntekt * sats3;
			System.out.println("Dinn skatt er: " + skatt);
			System.out.println("Din lønn er: " + (inntekt - skatt));

		} else if (brutto >= 934051 * sats4) {
			double skatt = inntekt * sats4;
			System.out.println("Dinn skatt er: " + skatt);
			System.out.println("Din lønn er: " + (inntekt - skatt));

		} else {
			System.out.println("Ugyldig");
		}
		
	
	}

}
