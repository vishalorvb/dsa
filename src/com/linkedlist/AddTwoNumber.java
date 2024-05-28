package com.linkedlist;

public class AddTwoNumber {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int carry = 0;
		ListNode head = null;
		ListNode tail = null;
		ListNode n1 = l1;
		ListNode n2 = l2;

		while (n1 != null && n2 != null) {
			int sum = (n1.val + n2.val + carry);
			int num = sum % 10;
			carry = sum / 10;
			ListNode temp = new ListNode(num);
			if (head == null) {
				head = temp;
				tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		while (n1 != null) {
			int sum = (n1.val + carry);
			int num = sum % 10;
			carry = sum / 10;
			ListNode temp = new ListNode(num);

			tail.next = temp;
			tail = temp;
			n1 = n1.next;
		}
		while (n2 != null) {
			int sum = (n2.val + carry);
			int num = sum % 10;
			carry = sum / 10;
			ListNode temp = new ListNode(num);

			tail.next = temp;
			tail = temp;
			n2 = n2.next;
		}

		if(carry !=0) {
			ListNode temp = new ListNode(carry);

			tail.next = temp;
			tail = temp;
		}
		return head;
	}

}
