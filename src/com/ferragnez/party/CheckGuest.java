package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		// creare e inizializzare l’array contenente i nomi degli invitati
		String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		// chiedere all’utente come si chiama
		System.out.print("Nome? ");
		Scanner scan = new Scanner(System.in);
		String userName = scan.nextLine();
		
		// verificare che il nome sia presente nella lista
		// lasciarlo entrare o rispedirlo cortesemente da dove è venuto
		boolean trovato = false;
		int counter = 0;
		
		// versione con WHILE
		while(!trovato && counter < guestList.length) {
		
			if(userName.equals(guestList[counter])) {
				trovato = true;
				System.out.println("Accesso consentito. [ver. WHILE]");
			} else {
				counter++;
			}
			
		}
		
		// versione con FOR
		for(int i = 0; i < guestList.length; i++) {
			
			if(userName.equals(guestList[i])) {
				trovato = true;
				System.out.println("Accesso consentito. [ver. FOR]");
				
				break;
			}
		
		}
		
		if(!trovato) {
			System.out.println("Accesso negato.");
		}
		
		// Scanner close
		scan.close();
		
	}

}
