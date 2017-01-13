public class DoubleLinkList {
	private Node head;
	private Node tail;

	// public void insertAtHead(int data) {
	// 	Node newNode = new Node(data);
	// 	newNode.setNextNode(this.head);
	// 	this.head = newNode; 
	// }
	public void insertAtTail(int data) {
		Node newNode = new Node(data);
		if(this.head == null)
		{
			this.head = newNode;
		}
		if(this.tail != null)
		{
			this.tail.setNextNode(newNode);
			
		}
		this.tail = newNode;
	}
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		if(this.tail == null)
		{
			this.tail = newNode;
		}
		newNode.setNextNode(this.head);
		this.head = newNode; 
		
	}
	public int sizeofList(){
		int count=0;
		Node current = this.head;
		while (current!=null){
			count++;
			current = current.getNextNode();
		}
		return count;

	}
	public void deleteAtHead(){
		this.head = this.head.getNextNode();
	}
	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		while(current!=null){
			result += current.toString()+ ",";
			current = current.getNextNode();
		}

		result +="}";
		return result;
	}
}