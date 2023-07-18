package collectionsframework.iterator;

import java.util.Iterator;

@SuppressWarnings("unchecked")

public class GenericList<T> implements Iterable<T>{
	private T[] elems;
	private int size;
	
	GenericList(){
		this.size = 0;
		elems = (T[]) new Object[10];
	}
	
	public void add(T elem) {
		elems[size ++] = elem;
	}
	
	public T getAtIndex(int index) {
		return elems[index];
	}

	@Override
	public Iterator<T> iterator() {
		return new GenericListIterator(this);
	}
	
	private class GenericListIterator implements Iterator<T> {
		
		private GenericList<T> list;
		private int index = 0;
		
		public GenericListIterator(GenericList<T> list) {
			this.list = list;
		}

		@Override
		public boolean hasNext() {
			return index < list.size;
		}

		@Override
		public T next() {
			return (T) list.elems[index ++];
		}
		
	}
	
}
