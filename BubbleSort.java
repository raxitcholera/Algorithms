public class BubbleSort {

	public static void main(String[] args){
        int[] num = {5, 8, 24, 15, 200, 192, 86, 35, 78, 4 ,9, 20};
        printAll(num);
        bubbleSort(num);
        printAll(num);
	}
	public static void bubbleSort (int[] num){
		int i,j,temp;
		for(i=0;i<num.length-1;i++) {
			for(j=0;j<num.length-i-1;j++) {
				if(num[j]<num[j+1]){
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
	}
	public static void printAll(int[] num) {
		for(int i = 0; i < num.length; i++){
            System.out.print("\t" + num[i]);
        }
        System.out.println();
	}
}
