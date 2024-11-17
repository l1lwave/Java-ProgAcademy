package lesson7thirdex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayBasedStack<T extends Comparable<T>> implements Iterable<T>{
	private T[] dataArray;
	private int size;
	private int capacity;
	private final int DEFAULT_CAPACITY = 16;
	private final int MAX_STACK_SIZE = Integer.MAX_VALUE - 1;
	
	@SuppressWarnings("unchecked")
	public ArrayBasedStack() {
		dataArray = (T[]) new Comparable[DEFAULT_CAPACITY];
		capacity = dataArray.length;
		size = 0;
	}
	
	public void push(T value) {
		if (size >= capacity) {
			boolean resizeResult = upResize();
			if (!resizeResult) {
				throw new RuntimeException("Cannot add element");
			}
		}
		dataArray[size] = value;
		size += 1;
	}

	private boolean upResize() {
		if (capacity >= MAX_STACK_SIZE) {
			return false;
		}
		long newCapacityL = (capacity * 3L) / 2L + 1L;
		int newCapacity = 0;
		if (newCapacity < MAX_STACK_SIZE) {
			newCapacity = (int) newCapacityL;
		} else {
			newCapacity = MAX_STACK_SIZE;
		}
		dataArray = Arrays.copyOf(dataArray, newCapacity);
		capacity = newCapacity;
		return true;
	}
	
	public T pop() {
		if (size == 0) {
			return null;
		}
		size -= 1;
		T element = dataArray[size];
		dataArray[size] = null;
		return element;
	}
	
	public T peek() {
		if(size == 0) {
			return null;
		}
		return dataArray[size - 1];
	}
	
	public int size() {
		return size;
	}
	
	public void trimToSize() {
		dataArray = Arrays.copyOf(dataArray, size);
		capacity = dataArray.length;
	}
	
	@SuppressWarnings("unchecked")
	public void clear() {
		dataArray = (T[]) new Comparable[DEFAULT_CAPACITY];
		capacity = dataArray.length;
		size = 0;
	}

	@Override
	public String toString() {
		return "ArrayBasedStack [dataArray=" + Arrays.toString(dataArray) + "]";
	}
	
	@Override
	public Iterator<T> iterator() {
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<T> {
		private int currentIndex = size - 1;

		@Override
		public boolean hasNext() {
			return currentIndex >= 0;
		}

		@Override
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException("No more elements in the stack.");
			}
			return dataArray[currentIndex--];
		}
	}

}
