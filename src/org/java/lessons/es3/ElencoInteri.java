package org.java.lessons.es3;

public class ElencoInteri {
	private int[] elenco = new int[0];
	private int counter = 0;
	
	public ElencoInteri()
	{
		
	};

	public ElencoInteri(int[] elenco) {
		
		setElenco(elenco);
	}

	public int[] getElenco() {
		return elenco;
	}

	public void setElenco(int[] elenco) {
		this.elenco = elenco;
	}
	
	
	
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getElementoSuccessivo()
	{
		int nextElem = getCounter();
		setCounter(getCounter() + 1);
		return getElenco()[nextElem];
	}
	
	boolean hasAncoraElementi()
	{
		return (getCounter() < getElenco().length) ? true : false;
	}
	
	public int length()
	{
		return getElenco().length;
	}
	
	public void addElemento(int elem)
	{
		int[] oldArray = getElenco();
		int[] newArray = new int[getElenco().length + 1];


		for(int i = 0; i < oldArray.length; i++)
		{
			newArray[i] = oldArray[i];
		}
		newArray[newArray.length - 1] = elem;
		
		setElenco(newArray);
	}
	
	public void reset()
	{
		if(!hasAncoraElementi())
		{
			setCounter(0);
		}
		
	}
}
