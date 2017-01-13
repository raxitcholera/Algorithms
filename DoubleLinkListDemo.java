public class DoubleLinkListDemo {
	public static void main (String[] args){
		DoubleLinkList list = new DoubleLinkList();

		list.insertAtTail(5);
		list.insertAtTail(10);
		list.insertAtTail(2);
		list.insertAtTail(20);
		list.insertAtHead(18);
		list.insertAtHead(6);
		list.insertAtHead(31);
		list.insertAtHead(1);

		System.out.println(list);
		System.out.println("Size :- " + list.sizeofList());

		list.deleteAtHead();
		
		System.out.println(list);
		System.out.println("Size :- " + list.sizeofList());

		// System.out.println("trying to find 12 "+list.find(12));
		// System.out.println("trying to find 20 "+list.find(20));

	}
}