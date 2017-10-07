import java.io.*;
import java.util.*;
public class BinaryTree {

	private TreeNode root;

	public TreeNode getRoot(){
		return root;
	}
	public void printInorder(TreeNode n){
		if(n != null){
			System.out.print("(");
			printInorder(n.getLeftChild());
			n.print();
			printInorder(n.getRightChild());
			System.out.print(")");
		}
	}
	public void insert_data (int data) {
		if (root == null){
			this.root = new TreeNode(data);
		}else {
			root.insert(data);
		}
	}
	public void delete (int data) {
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;

		if(current == null) {
			return;
		}
		while(current != null && current.getData() != data){
			parent = current;
			if(data<current.getData()){
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}
		if(current == null) return;

		if(current.getLeftChild() == null && current.getRightChild() == null) {
			if(current==root) { root = null; }
			else {
				if(isLeftChild) { parent.setLeftChild(null); }
				else { parent.setRightChild(null); }
				}
		} else if (current.getRightChild() == null ) {
			if(current == root) {root = current.getLeftChild();}
			else if (isLeftChild) {parent.setLeftChild(current.getLeftChild());}
			else {parent.setRightChild(current.getLeftChild());}
		} else if (current.getLeftChild() == null ) {
			if(current == root) {root = current.getRightChild();}
			else if (isLeftChild) {parent.setLeftChild(current.getRightChild());}
			else {parent.setRightChild(current.getRightChild());}
		} else {
            TreeNode successor = getSuccessor(current);
            if (current == root)
                root = successor;
            else if (isLeftChild) {
                parent.setLeftChild(successor);
            } else {
                parent.setRightChild(successor);
            }
            successor.setLeftChild(current.getLeftChild());
        }
	}
	private TreeNode getSuccessor(TreeNode node) {
        TreeNode parentOfSuccessor = node;
        TreeNode successor = node;
        TreeNode current = node.getRightChild();
        while (current != null) {
            parentOfSuccessor = successor;
            successor = current;
            current = current.getLeftChild();
        }
        if (successor != node.getRightChild()) {
            parentOfSuccessor.setLeftChild(successor.getRightChild());
            successor.setRightChild(node.getRightChild());
        }
        return successor;
    }
	public TreeNode find (int data) {
		if(root != null)
			return root.find(data);
		return null;
	}
	public static void main(String[] args)throws FileNotFoundException, IOException {
        // int[] num = {4,5,8,9,15,20,24,35,78,86,192,200};
        // printAll(num);
        BinaryTree test = new BinaryTree();
        String fileName = "";
        String outputFileName = "";
		int inputMaxCount = 21;
		try{
			fileName = args[0];
		}catch(Exception e){
			System.out.println(e);
			fileName = "f.txt";
			System.out.println("No inputfile name provided going with f.txt");
		}
			BufferedReader br = new BufferedReader(new FileReader(fileName));
        	String line;
        	ArrayList<String> list = new ArrayList<String>();
			while((line = br.readLine()) != null){
			    list.add(line);
			}

			String[] stringArray = list.toArray(new String[list.size()]);

			for(int i=0;i<stringArray.length;i++){
				// System.out.println(stringArray[i]);
				if(stringArray[i].contains("I")){
					// System.out.println("Got I");
					Scanner in = new Scanner(stringArray[i]).useDelimiter("[^0-9]+");
					while(in.hasNext()){
						int integer = in.nextInt();
						test.insert_data(integer);
					}
				}
				if(stringArray[i].contains("P")){
					// System.out.println("Got P");
					test.printInorder(test.getRoot());
    				System.out.println();
				}
				if(stringArray[i].contains("D")){
					Scanner in = new Scanner(stringArray[i]).useDelimiter("[^0-9]+");
					while(in.hasNext()){
						int integer = in.nextInt();
						if(test.find(integer) != null){
    						test.delete(integer);
    						// System.out.println("Deleted " + integer);
    					}else{
    						System.out.println("Delete " + integer + " FAILED (not in the list)");
    					}
						
					}
					// System.out.println("Got D");
				}
			}
	}
}
