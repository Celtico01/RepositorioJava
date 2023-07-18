package collectionsframework.dynamicArray;

@SuppressWarnings("unchecked")

public class Array <T> implements Iterable <T>{

	private T[] array;
	private int tamanho = 0; //tamanho que o usuario acha que o array tem
	private int capacidade = 0; //tamanho real do array
	
	public Array() {this(16);}
	
	public Array(int capacidade) {
		if(capacidade < 0) throw new IllegalArgumentException("Capacidade Illegal: " + capacidade);
		this.capacidade = capacidade;
		array = (T[]) new Object[capacidade];
	}
	
	public int getTamanho() {return tamanho;}
	public boolean isEmpty() {return tamanho == 0 ? true : false;}
	
	public T getElemento(int indice) {
		if(indice > tamanho - 1 && indice < 0) throw new IndexOutOfBoundsException("Indice invalido: " + indice);
		else {
			return array[indice];
		}
	}
	public void setElemento(int indice, T elemento) {
		if (indice > tamanho -1 && indice < 0) throw new IndexOutOfBoundsException("Indice invalido: " + indice);
		else {
			array[indice] = elemento;
		}
	}
	public void addElemento(T elemento) {
		//reajustar o tamanho
		if(tamanho + 1 > capacidade) {
			if(capacidade == 0) capacidade = 1;
			else capacidade *= 2; // dobra o tamanho
			T[] novo_array = (T[]) new Object[capacidade];
			for(int i = 0; i < tamanho; i++) {
				novo_array[i] = array[i];
			}
			array = novo_array; //mais espaçoes nulos
		}
		array[tamanho + 1] = elemento;
	}
	
	public T removerElemento(int indice) {
		if(indice >= tamanho && indice < 0) throw new IndexOutOfBoundsException("Indice invalido: " + indice);
		T dado = array[indice];
		T[] novo_array = (T[]) new Object[tamanho - 1];
		for(int i = 0, j = 0; i < tamanho; i++, j++) 
			if (i == indice) j--;
			else novo_array[j] = array[i];
		array = novo_array;
		capacidade = --tamanho;
		return dado;
	}
	
	public boolean removerElemento(Object objeto) {
		for(int i = 0; i < tamanho; i++) {
			if(array[i].equals(objeto)) {
				this.removerElemento(i); return true; }}
		return false;
	}
	
	public int indexOf(Object objeto) {
		for(int i = 0; i < tamanho; i++) {
			if(array[i].equals(objeto)) {
				return i; }}		
		return -1; //caso não encontre;
	}
	
	public boolean contains(Object objeto) {
		return this.indexOf(objeto) != -1 ? true : false;
	}
	

	@Override
	public java.util.Iterator<T> iterator() {
	    return new java.util.Iterator<T>() {
	        int indice = 0;

	        public boolean hasNext() {
	            return indice < tamanho ? true : false;
	        }

	        public T next() {
	            return array[indice++];
	        }
	    };
	}

	@Override
	public String toString() {
		if(tamanho == 0) return "[]";
		else {
			StringBuilder sb = new StringBuilder(tamanho).append("[");
			for(int i = 0; i < tamanho -1; i++) {
				sb.append(array[i] + ",");
			}
			return sb.append(array[tamanho - 1]).append("]").toString();
		}
		
	}
	
	

}
