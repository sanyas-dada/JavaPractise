package com.sanyasdada.likedlist;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}

}

class LinkedList {
	Node head;

	LinkedList(int data) {
		Node a = new Node(data);
		head = a;
	}

	public void inserAtBegining(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
		
	}
	public void insertAnyNode(Node n1, Node x) {
		x.next = n1.next;
		n1.next = x;
		
		
		
	}
	public void inserAtlastPosition(Node l1,Node l2) {
		l1.next = l2;
		
	}
	public void inserAtBegining(Node n2) {
		n2.next = head;
		head = n2;
		
	}

	public void traversal() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}
}

public class Main {
	public static void main(String[] args) {

		LinkedList l1 = new LinkedList(4);
		Node n1 = new Node(5);
		Node n2 = new Node(7);
		Node n3 = new Node(8);
		l1.head.next = n1;
		n1.next = n2;
		n2.next = n3;
		Node first = new Node(2);
		//l1.inserAtBegining(2);
		l1.inserAtBegining(first);
		l1.traversal();
		System.out.println("__________");
		Node x = new Node(6);
		Node last = new Node(9);
		l1.insertAnyNode(n1, x);
		l1.traversal();
		System.out.println("__________");
		l1.inserAtlastPosition(n3,last);
		l1.traversal();

	}

}
