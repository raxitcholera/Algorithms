public class LinkListDemo {
	public static void main (String[] args){
		LinkList list = new LinkList();

		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(20);
		list.insertAtHead(18);
		list.insertAtHead(6);
		list.insertAtHead(31);
		list.insertAtHead(1);

		System.out.println(list);
		System.out.println("Size :- " + list.sizeofList());

		list.deleteAtHead();
		
		System.out.println(list);
		System.out.println("Size :- " + list.sizeofList());


	}
}