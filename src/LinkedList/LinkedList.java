package LinkedList;

public class LinkedList<T> {
	Node<T> head;
	public void add(T data) {
		if(head == null) {
			head = new Node<T>(data);
		}
		else {
			Node<T> p = head;
			while(p.next!=null)
				p = p.next;
			p.next = new Node<T>(data);
		}
	}
	public void show() {
		Node<T> p = head;
		while(p.next!=null) {
			System.out.print(p.data+" ");
			p = p.next;
		}
		System.out.println(p.data);
	}
	public Node<T> getNode() {
		return head;
	}
	static class Node<T>{
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.show();
		Node<Integer> p = l.getNode();
		System.out.println(p.data);
	}

}
