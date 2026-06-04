//create a java program for social media feed navigation .Implement a free scrolling for next post ,previous post,delete post, insert sponsor post
//Doubly Linked list
class Node{
	String post;
	Node prev,next;
	
	Node(String post){
		this.post=post;
	}
}
public class Doublylinkedlist{
	public static void main(String[] args){
		Node p1=new Node("Post 1");
		Node p2=new Node("Post 2");
		Node p3=new Node("Sponsored post");
		
		p1.next=p2;
		p2.prev=p1;
		
		p2.next=p3;
		p3.prev=p2;
		
		System.out.println("current post:"+p1.post);
		System.out.println("Next post:"+p1.next.post);
		System.out.println("Previous post:"+p3.prev.post);
		
		p1.next=p3;
		p3.prev=p1;
		
		System.out.println("After deletion:");
		System.out.println(p1.post);
		System.out.println(p1.next.post);
	}
}
		
		
		
		