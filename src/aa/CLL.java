package aa;

import java.util.Scanner;

public class CLL<T> {
	class Node<T>{
		T data;
		Node <T> next;
		
		public Node(T data) {
			this.data=data;
			this.next=null;
		}
		
	}
	Node <T> head;
	Node <T>tail;
	public void AddFirst( T data) {
		Node<T> node =new Node<>(data);
		if(head==null) {
			head=node;
			tail=node;
			}
		else {
			tail.next=node;
			node.next=head;
			head=node;
		}
	}
	public void AddLast(T data) {
		Node<T> node=new Node<>(data);
		if(head==null) {
			head=node;
			tail=node;
		}else {
			tail.next=node;
			node.next=head;
			tail=node;
		}}
		public void Delete(int index) {
			Node<T> p=head;
			if(head==null) {
				System.out.println("K xoa");
			}
			else {
				while(index-1>0) {
					p=p.next;
					index--;
				}
				p.next=p.next.next;
				
			}}
		public int size() {
			int count=1;
			Node<T> p=head;
			while(p!=tail) {
				count++;
				p=p.next;
			}return count;
		}
		public void Remove(int n) {
			int size=size();
			int x=n;
			Node<T> p=head;
			for(int i=1;i<size;i++) {
				while(x--!=2) {
					p=p.next;
				}
				if(p.next==tail) {
					tail=p;;
					p.next=head;
					p=p.next;
					
				}
				else if(p.next==head) {
					p.next=p.next.next;
					p=p.next;
					head=p;
				}
				else {
					p.next=p.next.next;
					p=p.next;
				}
				x=n;
			}
		}
			public void Show() {
				Node<T> cur=head;
				if(head==null) {
					System.out.println("List is empty");
				}
				else {
					while(cur!=tail) {
					System.out.print(cur.data+" ");
					cur=cur.next;
				}System.out.println(cur.data);
					}
				
			}
			public static void main(String[] args) {
				CLL<Integer> cll=new CLL<Integer>();
				int n,k;
				Scanner sc = new Scanner(System.in);
				n = sc.nextInt();
				k = sc.nextInt();
				for (int i = 1; i <= n; i++) {
					cll.AddLast(i);
				}
				cll.Remove(k);
				cll.Show();
		}
}