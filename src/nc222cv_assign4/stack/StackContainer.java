package nc222cv_assign4.stack;

public class StackContainer implements Stack {
	
	private Object[] arr;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return arr.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(arr == null || arr.length == 0) 
			return true;
		return false;
	}

	@Override
	public void push(Object element) {
		// TODO Auto-generated method stub
		if(this.isEmpty())
			this.arr = new Object[] {element};
		
		else {
			Object[] tempArr = new Object[size() + 1];
			for(int i = 0, length = size(); i < length; i++) {
				tempArr[i] = arr[i];
			}
			
			tempArr[size()] = element;
			arr = tempArr;
		}
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(!this.isEmpty()) {
			Object element = arr[arr.length - 1];
			
			Object[] tempArr = new Object[size() - 1];
			for(int i = 0, length = tempArr.length; i < length; i++) {
				tempArr[i] = arr[i];
			}
			
			arr = tempArr;
			return element;
		}
		
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		if(!this.isEmpty()) {
			Object element = arr[arr.length - 1];
			return element;
		}
		return null;
	}

	@Override
	public Object[] iterator() {
		// TODO Auto-generated method stub
		return arr;
	}
}
