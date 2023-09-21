package org.java.lessons.es3;

public class ElencoInteri {
	private int[] elenco;
	private int counter = 0;

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
	
	public void reset()
	{
		if(!hasAncoraElementi())
		{
			setCounter(0);
		}
		
	}
}
