package com.linkedlist;

public class FlatLinkedList {

	public Node mergeSortedList(Node n1, Node n2) {
		Node head = null;
		Node tail = null;
		Node i = n1;
		Node j = n2;

		while (i != null && j != null) {
			Node temp = null;
			if (i.data < j.data) {
				temp = i;
				i = i.bottom;
			} else {
				temp = j;
				j = j.bottom;
			}

			if (head == null) {
				head = temp;
				tail = temp;
			} else {
				tail.bottom = temp;
				tail = temp;
			}
		}
		while (i != null) {
			if (head == null) {
				head = i;
				tail = i;
			} else {
				tail.bottom = i;
				tail = i;
				i = i.bottom;
			}

		}
		while (j != null) {
			if (head == null) {
				head = j;
				tail = j;
			} else {
				tail.bottom = j;
				tail = j;
				j = j.bottom;
			}

		}
		return head;
	}

	public Node merge(Node n) {
		if (n == null) {
			return null;
		}
		if (n.next == null) {
			Node t = new Node(n.data);
			t.bottom = n.bottom;
			return t;
		}

		Node head = new Node(n.data);

		Node right = merge(n.next);

		head.bottom = mergeSortedList(n.bottom, right);

		return head;
	}

	private void addNode(Node head, Node tail, Node n) {
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
	}

	private void addRemaininButtom(Node bottomRoot, Node n) {
		if (bottomRoot == null) {
			bottomRoot = n;
			return;
		}
		Node prev = null;
		Node current = bottomRoot;
		while (current != null) {
			if (current.data < n.data) {
				prev = current;
				current = current.next;
			} else {
				break;
			}
		}
		if (prev == null) {
			n.next = bottomRoot;
			bottomRoot = n;
			return;
		}
		n.next = prev.next;
		prev = n;
	}

	Node flatten(Node root) {
		Node head = null;
		Node tail = null;
		Node rButtom = null;
		Node current = root;

		while (current != null) {

			current = current.next;
		}
		return head;
	}
}
