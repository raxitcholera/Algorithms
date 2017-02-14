public class TreeNode{

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public int getData() {
		return data;
	}
	public TreeNode getLeftChild () {
		return leftChild;
	}
	public TreeNode getRightChild () {
		return rightChild;
	}
		public void setLeftChild (TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public void setRightChild (TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public TreeNode find(int data) {
		if(this.data == data)
			return this;
		else if (data < this.data && leftChild != null) 
			return leftChild.find(data);
		else if (data > this.data && rightChild != null)
			return rightChild.find(data);
		else
			return null;
	}

	public void insert(int data) {
		if(data>= this.data)	{
			if(this.rightChild == null) {
				this.rightChild = new TreeNode(data);
			}else {
				this.rightChild.insert(data);
			}
		}else {
			if(this.leftChild == null) {
				this.leftChild = new TreeNode(data);
			}else {
				this.leftChild.insert(data);
			}
		}
	}


	public TreeNode(int data) {
		this.data = data;
	}
}