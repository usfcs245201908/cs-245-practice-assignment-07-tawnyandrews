import java.util.*;

public class ArrayList<T> implements List{
	Object[] a;
	int size;
	int pos;

	public ArrayList(){
		a = new Object[100];
		size = 0;
		pos = 0;
	}

	public void add(Object item){
		if(size == a.length){
			grow_array();
		}
		a[size++] = item;
	}

	public void add(int pos, Object item){
		//base case
		if(pos<0 || pos>size){
			System.out.println("Position is out of bounds!");
		}
		if(size==a.length){
			grow_array();
		}
		for(int i=size-1;i>pos;i--){
			a[i+1] = a[i];
		}
		a[pos] = item;
		++size;
	}
	//this will return a certain element
	public Object get(int pos){
		if(pos<0 || pos>size){
			System.out.println("Position is out of bounds!");
		}
		return a[pos];
	}
	//this will remove an element 
	public Object remove(int pos){
		if(pos<0 || pos>size){
			System.out.println("Position is out of bounds!");
		}
		Object temp = a[pos];
		for(int i=pos;i<size()-1;i++)
			a[i] = a[i+1];
		--size;
		return temp;
		//return size;		
	}
	//this will double the size of the array when needed to add a new element
	public void grow_array(){
		Object[] new_a = Arrays.copyOfRange(a,0,a.length*2);
		a = new_a;
	}

	public int size(){
		return this.size;
	}
}
