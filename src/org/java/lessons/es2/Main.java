package org.java.lessons.es2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Contatore di lettere");
		System.out.println("\n--------------\n");
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Inserisci una parola");
			String word = sc.nextLine();

			Map<Character, Integer> letterCounter = new HashMap<Character, Integer>();
			for(int i = 0; i < word.length(); i++)
			{
				Character letter = word.charAt(i);
				if(letterCounter.containsKey(letter))
				{
					letterCounter.put(letter, letterCounter.get(letter) + 1);
				}
				else
				{
					letterCounter.put(letter, 1);
				}
			}

			System.out.println(letterCounter);

			System.out.println("Vuoi continuare a giocare? (y/n)");
			String input = sc.nextLine();

			if(input.equals("n"))
			{
				break;
			}
		}
		
		System.out.println("FINE");
		sc.close();		
		
	}
}
