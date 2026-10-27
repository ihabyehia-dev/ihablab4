package ihablab4;

import java.util.*;

public class linkedlist {
	Node head;
	String name;

	linkedlist() {
		this.name = name;
		this.head = head;
	}

	linkedlist(String name) {
		this.name = null;
		this.head = null;
	}

	Node h = new Node();

	linkedlist(Node h) {
		this.h = null;
	}

	boolean isempty() {
		boolean ok = true;
		if (h == null) {
			ok = false;
			h = head;
		}
		return ok;

	}

	void insertatfront(int d) {
		Node n = new Node(d);
		if (isempty() == false) {
			n.next = head;
			head = n;
		} else {
			head = n;
		}
	}

	void insertatback(int d) {
		Node z = new Node(d);
		if (isempty() == true) {
			head = z;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = z;
		}
	}

	void insertafter(int element, int targetElement) {
		Node n = new Node(element);
		if (isempty() == true) {
			head = n;
		} else {
			Node current = head;
			int prev;
			while (current.next != null) {
				prev = current.data;
				current = current.next;
				if (current.data == targetElement) {
					prev = element;
				}
			}
		}
	}

	void display() {
		Node n = new Node();
		while (n.next != null) {
			System.out.println(n.data + " -> ");
		}
	}

	void deletefromfront() {
		Node n = new Node();
		n.data = 0;
		head = n.next;
	}

	void deletefromback() {
		Node n = new Node();
		Node current = head;
		Node prev = head;
		while (current.next != null) {
			prev = current;
			current = current.next;
			if (current.next == null) {
				prev.next = null;
			}
		}
	}

	void deleteatposition(int pos) {
		Node n = new Node();
		Node current = head;
		int count = 0;
		Node prev = current;
		while (current.next != null) {
			prev = current;
			current = current.next;
			if (current.data == pos) {
				prev = current;
				current.next = current.next.next;
			}
		}
	}

	int occurenceNB(int a) {
		Node n = new Node();
		int count = 0;
		Node current = head;
		while (current.next != null) {
			if (current.data == a) {
				count++;
			}
		}
		return count;
	}

	int evenNBs() {
		int counteven = 0;
		Node n = new Node();
		Node current = head;
		while (current.next != null) {
			if (current.data % 2 == 0) {
				counteven++;
			}
		}

		return counteven;
	}

	int maximum() {
		Node n = new Node();
		int max = 0;
		Node current = head;

		while (current.next != null) {
			if (current.data > max) {
				max = current.data;
			} else {
				max = max;
			}
		}
		return max;
	}

	boolean issorted() {
		Node n = new Node();
		Node current = head;
		boolean sorted = false;

		while (current.next != null) {
			if (current.data < current.next.data) {
				sorted = true;
			} else {
				return sorted = false;
			}
		}
		return sorted;
	}

	double average() {
		Node n = new Node();
		Node current = head;
		double average = 0;
		double sum = 0;
		int count = 0;
		while (current.next != null) {
			count++;
			sum += current.data;
		}

		return average = sum / count;
	}
	

}
