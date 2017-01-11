public class SelectionSort {

	public static void main(String[] args){
        int[] num = {5, 8, 24, 15, 200, 192, 86, 35, 78, 4 ,9, 20};
        printAll(num);
        selectionSort(num);
        printAll(num);
	}
	public static void selectionSort (int[] num){
		int i,j,temp,index;
		for(i=0;i<num.length;i++) {
			index=i;
			for(j=i+1;j<num.length;j++) {
				if(num[j]<num[i]){
					index = j;
				}
					temp = num[index];
					num[index] = num[i];
					num[i] = temp;
				
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
