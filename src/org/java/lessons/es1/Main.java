package org.java.lessons.es1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Regalo> listaRegali = new ArrayList<Regalo>();
		
		System.out.println("Lista di natale");
		System.out.println("\n----------------\n");
		
		while(true) {
			System.out.print("Vuoi aggiungere un regalo? (y/n)");
			String input = sc.nextLine();
			
			if(input.equals("n"))
			{
				break;
			}

			System.out.print("Che regalo vuoi aggiungere?");
			String nomeRegalo = sc.nextLine();

			System.out.println("Per chi?");
			String destinatario = sc.nextLine();


			Regalo r = new Regalo(nomeRegalo, destinatario);

			listaRegali.add(r);
			
			System.out.println("Lunghezza lista " + listaRegali.size());
		}
		
		sc.close();
		
		System.out.println("\n------------------------\n");
		System.out.println("Lista:\n");
		for(Regalo elem : listaRegali)
		{
			System.out.println(elem + "\n");
		}
		
	}
}
