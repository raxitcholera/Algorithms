public class BubbleSort {

	public static void main(String[] args){
        int[] num = {5, 8, 24, 15, 200, 192, 86, 35, 78, 4 ,9, 20};
        printAll(num);
        // recursiveBubbleSort(num,12,0);
        taileredbubbleSort(num,5);
        //bubbleSort(num);
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
    public static void taileredbubbleSort (int[] num,int k){
        int i,j,temp;
        for(i=0;i<k;i++) {
            for(j=num.length-1;j>0;j--) {
                if(num[j]<num[j-1]){
                    temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
            }
        }
    }
	public static int[] recursiveBubbleSort(int[] list, int n,int start) {
        if (start == n) {
            return list; //finished sorting
        }
        
        int temp;
        for (int i = n-1; i > start; i--) {
            if (list[i] < list[i-1]) {
                temp = list[i];
                list[i] = list[i-1];
                list[i-1] = temp;
            }
        }
        return recursiveBubbleSort(list, n, start+1);
    }
	public static void printAll(int[] num) {
		for(int i = 0; i < num.length; i++){
            System.out.print("\t" + num[i]);
        }
        System.out.println();
	}
}
