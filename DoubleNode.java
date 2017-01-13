public class DoubleNode {
	private int data;
	private DoubleNode nextNode;
	private DoubleNode previousNode;
	
	public DoubleNode (int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}
	public DoubleNode getNextNode(){
		return this.nextNode;
	}
	public DoubleNode getPreviousNode(){
		return this.previousNode;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setNextNode(DoubleNode thisNode){
		this.nextNode = thisNode;
	}
	public void setPreviousNode(DoubleNode thisNode){
		this.previousNode = thisNode;
	}

	@Override
	public String toString() {
		return "Data:- "+ this.data;
	}

}