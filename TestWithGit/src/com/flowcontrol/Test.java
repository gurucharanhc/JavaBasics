package com.flowcontrol;

import java.util.ArrayList;
class Solution {
	private Node top;
	private class Node {
		private Node next;
		private int data;
		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public void push(int data) {
		if (top == null) {
			Node n = new Node(data, null);
			top = n;
		} else {
			Node n = new Node(data, top);
			top = n;
		}
	}

	public int pop()  {
		if (top == null) {
			System.out.println("nothing in stack to pop");
		}
		int dat = top.data;
		top = top.next;
		return dat;
	}
    
    public int solution(String S) {
        // write your code in Java SE 7
    	
    	char[] charArray = S.toCharArray();
    	for(char c : charArray)
    	{
    		if(c>=48 && c<=57)
    			push(c-48);
    		else 
    		{
    			switch(c){
    			case '+' : push(pop()+pop()); break;
    			case '*' : push(pop()*pop()); break;
    			case '/' : push(pop()/pop()); break;
    			case '-' : push(pop()-pop()); break;
    			}	
    		}		
    	}
    	return pop();
    }
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution n = new Solution();
	System.out.println(n.solution("13+*"));
	System.out.println("guru");
	//n.printStack();
//	 char c='1';
//	 char b='2';
//	 int a=(int)c+(int)b;
//	 System.out.println(a);
	}

}
