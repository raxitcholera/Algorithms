public class testSelect3 {

	public static void main(String[] args){
        int[] num = {48,71,83,98,141,193,209,345,386,481};
        // printAll(num);
        SELECT3(num,0,num.length-1,5);
        //bubbleSort(num);
        // printAll(num);
	}
	public static int findMedian(int arr[],int start, int n)
    {
        System.out.println("Start "+start );
        sort(arr,start+n,start); // Sort the array
        printAll(arr);
        System.out.println("element at median is "+arr[(start+start+n)/2]);
        return arr[(start +start+n)/2]; // Return middle element
    }
    public static int[] sort(int[] list, int n,int start) {
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
        return sort(list, n, start+1);
    }
    public static int partition(int arr[], int l, int r, int x)
    {
        int i;
        for (i=l; i<r; i++)
            if (arr[i] == x)
            break;

        swap(arr,i, r);
        i = l;
        for (int j = l; j <= r - 1; j++)
        {
            if (arr[j] <= x)
            {
                swap(arr,i, j);
                i++;
            }
        }
        swap(arr,i, r);
        return i;

    }
    public static int SELECT3 (int arr[], int l, int r, int k) {
        printAll(arr);

            if (k > 0 && k <= r - l + 1)
            {
                
                int n = r-l+1; // Number of elements in arr[l..r]
                int i;
                int[] median = new int[(n+4)/5]; // There will be floor((n+4)/5) groups;
                for (i=0; i<n/5; i++){
                    median[i] = findMedian(arr,l+i*5,5);
                }
                if (i*5 < n) //For last group with less than 5 elements
                {
                    median[i] = findMedian(arr,l+i*5, n%5); 
                    i++;
                } 
                System.out.println("the median set is as following");
                printAll(median);
                int medOfMed = (i == 1)? median[i-1]:SELECT3(median, 0, i-1, i/2);
                System.out.println("final median is "+medOfMed);
                return -1;
            }


        
        return -1;
    }

    public static void swap (int data[], int a, int b){
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
    
	public static void printAll(int[] num) {
		for(int i = 0; i < num.length; i++){
            System.out.print(" " + num[i]);
        }
        System.out.println();
	}
}
