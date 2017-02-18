
public class MergeSort {

	public static void main(String[] args){
        int[] num = {5, 8, 24, 15, 200, 192, 86, 35, 78, 4 ,9, 20};
        // int[] num = {5,2,8,3,4,1};
        mergesort(num,0,num.length-1);
        printAll(num);    
	}
	public static void mergesort (int[] num,int start, int end){
		int middle;
		
		if(start < end)
		{
			middle = (int)Math.floor((start+end)/2);
			mergesort(num,start,middle);
			mergesort(num,middle+1,end);
			Merge(num,start,middle,end);
		}
	}
	public static void Merge(int [] num, int start, int middle, int end){
		int n1 = middle-start+1, n2 = end-middle;
		int [] left = new int[n1];
		int [] right = new int[n2];
		for(int i=0;i<n1;i++) left[i]= num[start+i];
		for (int j=0;j<n2;j++) right[j] = num[middle+j+1];
		int i=0,j=0;
		for(int k=start;k<=end;k++){
			// if(left[i]<= right[j]){
			if ((j >= n2) || (i < n1 && left[i] <= right[j])) {
				num[k] = left[i];
				i++;
			}else {
				num[k]=right[j];
				j++;
			}
		}


		// System.out.print("\n start "+ start + " end "+ end);
		// int temp;
		// if(num[start]>num[end]) {
		// 	temp = num[start];
		// 	num[start]=num[end];
		// 	num[end]=temp;
		// }
	}
	public static void printAll(int[] num) {
		for(int i = 0; i < num.length; i++){
            System.out.print("\n" + num[i]);
        }
        System.out.println();
	}
}