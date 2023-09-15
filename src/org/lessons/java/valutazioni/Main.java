package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rnd  = new Random();
		
		int lng = 20;
		Studente[] studenti = new Studente[lng];
		int promossi = 0;
		
		for (int i = 0; i < lng; i++) {
			studenti[i]          = new Studente();
			studenti[i].id       = i + 1;
			studenti[i].media    = rnd.nextInt(6);
			studenti[i].assenze  = rnd.nextInt(101);
			
			System.out.println("\n------Studente " + (i + 1) + "------\n");
			System.out.println("id : " + studenti[i].id);
			System.out.println("media : " + studenti[i].media);
			System.out.println("assenze : " + studenti[i].assenze);

			if (studenti[i].risultato()) {
				System.out.println("\nPromosso");
				promossi++;
			} else System.out.println("\nBocciato");
		}
		
		System.out.println("\n-----------------------\n");
		System.out.println("Studenti promossi: " + promossi);
	}
}
