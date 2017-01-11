public class InsertionSort {

	public static void main(String[] args){
        int[] num = {5, 8, 24, 15, 200, 192, 86, 35, 78, 4 ,9, 20};
        printAll(num);
        insertionSort(num);
        printAll(num);
	}
	public static void insertionSort (int[] num){
		int i,j,temp,index;
		for(i=0;i<num.length-1;i++) {
			temp=num[i];
			j=i-1;
			while(j>=0 && num[j]>temp)
			{
				num[j+1] = num[j];
				j--;
			}
			num[j+1] = temp;
		}
	}
	public static void printAll(int[] num) {
		for(int i = 0; i < num.length; i++){
            System.out.print("\t" + num[i]);
        }
        System.out.println();
	}
}
