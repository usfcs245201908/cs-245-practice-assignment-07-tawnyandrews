import java.util.*;

public class ArrayList<T>(){
	public Object get(int pos){
		if(pos<0 || pos>size-1) //fix this later!
			throw new Exception("");
		return a[pos];
	}

	public Object remove(int pos){
		if(pos<0 || pos>size)
			throw new Exception("");
		for(int i=pos;i<size;i++)
			a[i] = a[i+1];
		i--;
		return temp;		
	}
}