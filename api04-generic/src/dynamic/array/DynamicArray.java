package dynamic.array;

public class DynamicArray<T> implements Array<T>{
	
	private Object[] array;
	
	public DynamicArray() {
		array = new Object[]{};
		System.out.println("Default size: " + size());
	}

	@Override
	public void add(T t) {
		Object[] temp = new Object[size() + 1];
		
		for(int i=0; i < size(); i++) {
			temp[i] = array[i];
		}
		
		temp[temp.length - 1] = t;
		
		// change reference
		array = temp;
	}

	@Override
	public T get(int index) {
		return (T)array[index];
	}

	@Override
	public int size() {
		return array.length;
	}

	
}
