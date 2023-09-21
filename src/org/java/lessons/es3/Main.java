package org.java.lessons.es3;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		int[] array = {22,33,44,45,56};
		
		ElencoInteri elenco = new ElencoInteri(array);
		
				
		while(elenco.hasAncoraElementi())
		{
			System.out.println(elenco.getElementoSuccessivo());
		}
		
		System.out.println("\n------------------------\n");
		
		ElencoInteri elenco2 = new ElencoInteri();
		Random rnd = new Random();
		
		for(int i = 0; i < 5; i++)
		{
			elenco2.addElemento(rnd.nextInt(0,51));
		}
		
		elenco2.addElemento(3);
		elenco2.addElemento(4);
		elenco2.addElemento(7);
		
		
		
		while(elenco2.hasAncoraElementi())
		{
			System.out.println(elenco2.getElementoSuccessivo());
		}
	}
}
