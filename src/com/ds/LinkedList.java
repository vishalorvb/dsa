package com.ds;

public class LinkedList {
	private class Node {
		Integer data;
		Node node;
	}

	Node head = null;
	Node tail = null;
	private Integer size = 0;

	public void AddLast(Integer n) {
		Node temp = new Node();
		temp.data = n;
		temp.node = null;
		size += 1;
		if(head  == null) {
			head = temp;
			tail = temp;
		}
		else {
			tail.node = temp;
			tail = temp;
		}
	}
	
	public void Show() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data);
			n = n.node;
		}
	}
	
	public int getSize() {
		return size;
	}

}
