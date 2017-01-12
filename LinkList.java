public class LinkList {
	private Node head;
	
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

	public int sizeofList(){
		int count=0;
		Node current = this.head;
		while (current!=null){
			count++;
			current = current.getNextNode();
		}
		return count;

	}

	public Node find(int data){
		int index = 0;
		Node current = this.head;
		while(current!=null) {
			if(current.getData() == data){
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode; 
	}

	public void deleteAtHead(){
		this.head = this.head.getNextNode();
	}

}