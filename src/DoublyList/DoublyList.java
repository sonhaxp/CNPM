package DoublyList;

public class DoublyList {
	Node head;
	Node tail;
	DoublyList(){
		head = tail = null;
	}
	public void addHead(int x) {
		if(head==null) {
			head = tail = new Node(x);
		}
		else {
			Node newNode = new Node(x);
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	public void addTail(int x) {
		if(head==null) {
			head = tail = new Node(x);
		}
		else {
			Node newNode = new Node(x);
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	public void deleteHead() {
		if(head == null) System.out.println("Khong xoa duoc");
		else {
			head = head.next;
			head.prev = null;
		}
		if(head == null) tail = null;
	}
	public void deleteTail() {
		if(head == null) System.out.println("Khong xoa duoc");
		else {
			tail = tail.prev;
			tail.next = null;
		}
		if(tail == null) head = null;
	}
	public void show() {
		if(head!=null) {
			if(head == tail) System.out.println(head.data);
			else {
				Node p = head;
				while(p!=tail) {
					System.out.print(p.data+" ");
					p = p.next;
				}
				System.out.print(p.data+" ");
			}
		}
	}
	public void addIndex(int index,int data) {
		Node newNode = new Node(data);
		Node  p = head;
		while(index-->1) {
			p = p.next;
		}
		newNode.next = p.next;
		p.next.prev = newNode;
		p.next = newNode;
		newNode.prev = p;
	}
	public void removeIndex(int index) {
		Node  p = head;
		while(index-->1) {
			p = p.next;
		}
		p.next = p.next.next;
		p.next.prev = p;
	}
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	public static void main(String[] args) {
		DoublyList l = new DoublyList();
		l.addHead(0);
		l.addHead(1);
		l.addTail(2);
		l.addTail(3);
		l.show();
		System.out.println();
		l.addIndex(1, 4);
		l.show();
		l.removeIndex(1);
		System.out.println();
		l.show();
	}
}
