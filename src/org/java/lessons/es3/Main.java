package org.java.lessons.es3;

public class Main {
	public static void main(String[] args) {
		
		int[] array = {22,33,44,45,56};
		
		ElencoInteri elenco = new ElencoInteri(array);
		
				
		while(elenco.hasAncoraElementi())
		{
			System.out.println(elenco.getElementoSuccessivo());
		}
	}
}
