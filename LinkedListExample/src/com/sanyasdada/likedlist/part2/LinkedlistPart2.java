package com.sanyasdada.likedlist.part2;

class Node {
	int data;
	Node next; // this is the reference of the next node

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Linkedlist {
	Node head;

	Linkedlist(int data) {
		Node a = new Node(data);
		head = a;
	}

	public void deleteAtFirstNode() {
		Node ode = head.next;
		head.next = null;
		head = ode;
	}

	public void traversal() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void reverseOrder() {
		Node temp = head;
		Node q = head;
		while(temp!=null){
			Node p = temp.next;
			temp.next = temp;
			q = temp.next;
			temp = p;
		}
         q = head.next;
         head = q;
         head.next = null;
	}
}

public class LinkedlistPart2 {

	public static void main(String[] args) {
		Linkedlist link = new Linkedlist(12);
		Node l1 = new Node(24);
		Node l2 = new Node(34);
		Node l3 = new Node(45);
		Node l4 = new Node(55);
		link.head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		link.deleteAtFirstNode();
		link.traversal();
		link.reverseOrder();
		System.out.println("Give me some Gap");
		link.traversal();

	}

}
