//create a browser history system where each visited page as a node .Use a can visit new pages*display browsing history,*search for a page,*delete a page from history,*count total visited pages.
class Node{
	String page;
	Node next;
	
	Node(String page){
		this.page=page;
		this.next=null;
	}
}
public class Singlylinkedlist{
	public static void main(String[] args){
		Node p1=new Node("Page 1:Google");
		Node p2=new Node("Page 2:Instagram");
		Node p3=new Node("Page 3:spotify");
		
		p1.next=p2;
		p2.next=p3;
		
		System.out.println("-----History-----");
		System.out.println(p1.page);
		System.out.println(p2.page);
		System.out.println(p3.page);
		
		System.out.println("---Searching for Youtube---");
		if(p2.page.equals("Youtube")){
			System.out.println("Youtube is found");
		}
		else{
			System.out.println("Youtube is not found");
		}
		
		p1.next=p3;
		System.out.println("---After deletion---");
		System.out.println("2nd page:"+p1.next.page);
	}
}
		
		
		