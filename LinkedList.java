import java.util.*;

public class LinkedList<T> implements List {
	Node head;
	int size;

	public LinkedList() {
		this.head = new Node(null);
		this.size = 0;
	}

	public void add(Object item){
		if(head.data == null){
			head = new Node(item);
			size++;
		}
		else{
			Node newNode = new Node(item);
			Node previous = head;

			while(previous.next != null)
			{
				previous = previous.next;
			}
			previous.next = newNode;
			size++;
		}
	}

	public void add(int pos, Object item){
		//base case
		if(pos+1>size || pos<0){
			System.out.println("Position is out of bounds!");
		}

		if(pos==0){
			Node newNode = new Node(item);
			newNode.next = head;
			head = newNode;
			size++;
		}
		else{
			Node previous = head;
			for(int i=0;i<pos;i++){
				previous = previous.next;
			}
			Node newNode2 = new Node(item);
			newNode2.next = previous.next;
			previous.next = newNode2;
			size++;
		}
	}
	//this methods removes an element 
	public Object remove(int pos){
		//base case
		if(pos>size || pos<0){
			System.out.println("Position is out of bounds!");
			return null;
		}
		if(pos==0){
			Node newNode = head;
			head = head.next;
			--size;
			return newNode.data;
		}
		else{
			Node previous = head;
			for(int i=0;i<pos;i++){
				previous = previous.next;
			}
			Node newNode2 = previous.next;
			previous.next = newNode2.next;
			--size;
			return newNode2.data;
		}
	}
	//this returns an element
	public Object get(int pos){
		Node current = head;
		int x = 0;

		while(current != null){
			if(x==pos){
				return current.data;
			}
			++x;
			current = current.next;
		}
		return null;
	}

	public int size(){
		return this.size;
	}
}
