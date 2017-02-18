public class QuickSort {

	public static void main(String[] args){
        int[] num = {5, 8, 24, 15, 200, 192, 86, 35, 78, 4 ,9, 20};
        printAll(num);
        quickSort(num,0,num.length-1);
        printAll(num);

        
	}
	public static void quickSort (int[] num,int start, int end){
			if(start < end) {
			int pivot = partition(num, start, end);
			quickSort(num, start, pivot-1);
			quickSort(num, pivot+1,end);
		}
	}

	public static int partition(int[] num, int start, int end) {
		int pivot = num[end];
		int temp,i = start;
		for(int j=start; j<=end-1;j++) {
			if(num[j]<=pivot){
				temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				i++;
			}
		}
		temp = num[i];
		num[i] = num[end];
		num[end] = temp;
	return i;
	}
	public static void printAll(int[] num) {
		for(int i = 0; i < num.length; i++){
            System.out.print("\t" + num[i]);
        }
        System.out.println();
	}
}