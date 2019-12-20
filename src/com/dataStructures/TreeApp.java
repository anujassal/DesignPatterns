package com.dataStructures;

public class TreeApp {
	
	public static void main(String[] args){
		
		Tree t = new Tree();
		t.insert(50);
		t.insert(20);
		t.insert(10);
		t.insert(70);
		
		Node n = t.find(20);
		if(n!=null)
			System.out.println("Node found");
		else
			System.out.println("Node not found");
		
		}
	}

}
