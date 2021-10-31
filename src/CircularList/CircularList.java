package CircularList;


public class CircularList {
	Node head;
	Node tail;
	CircularList(){
		head = tail = null;
	}
	CircularList(int data){
		head=tail = new Node(data);
		tail.next = head;
	}
	public void add(int data) {
		if(head == null) {
			head= tail = new Node(data);
//			head.next = tail;
//			tail.next = head;
		}
		else {
			Node p = new Node(data);
			tail.next = p;
			tail = p;
			p.next = head;
		}
	}
	public void addHead(int data) {
		if(head == null) {
			head= tail = new Node(data);
			head.next = tail;
			tail.next = head;
		}
		else {
			Node p = new Node(data);
			tail.next = p;
			p.next = head;
			head = p;
		}
	}
	public void delete() {
		Node p = head;
		while(p.next.next!=head) {
			p = p.next;
		}
		p.next = p.next.next;
	}
	public int size() {
		if(head.next == head) return 0;
		Node p = head;
		int dem = 1;
		while(p.next!=head) {
			p = p.next;
			dem++;
		}
		return dem;
	}
	public void show() {
		Node p = head;
		while(p.next!=head) {
			System.out.print(p.data+" ");
			p = p.next;
		}
		System.out.println(p.data);
	}
	public void remove(int n) {
		int size = size();
		int x = n;
		Node p = head;
		for(int i = 1;i<size;i++) {
			while(x--!=2) {
				p = p.next;
			}
			System.out.println(p.next.data);
			if(p.next == tail) {
				tail = p;
				p.next = head;
				p=p.next;
			}
			else if(p.next == head) {
				p.next = p.next.next;
				p=p.next;
				head=p;
			}
			else{
				p.next = p.next.next;
				p=p.next;
			}
		 	x = n; 
		}
	}
	public static void main(String[] args) {
		CircularList c = new CircularList();
		for(int i = 1; i<=13;i++) {
			c.add(i);
		}
		c.remove(3);
		c.show();
	}
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
}
