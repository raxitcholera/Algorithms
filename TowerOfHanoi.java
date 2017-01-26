public class TowerOfHanoi {

	public static void main(String[] args){
	TowerOfHanoi toh = new TowerOfHanoi();
	toh.move(4,'a','b','c');
	}
	public void move (int num, char from, char to, char using){
		if(num == 1)  {
			System.out.println("Moving Disk " + num + " from "+ from + " to " + to);
		}else {
		 move (num-1,from, using, to);
		 System.out.println("Movind Disk " + num + " from " + from + " to " + to);
		 move (num-1,using, to, from);
		}
 	}

}