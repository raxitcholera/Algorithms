import java.util.*;
public class SortingAlgos {
	public static int comp_counter=0;
	public static void main(String[] args){


//Data Start
		Random r2 = new Random();
	    int[] merge_sorted_num_32 =    {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64};
	    int[] merge_reverse_sorted_num_32 =  {63,61,59,57,55,53,51,49,47,45,43,41,39,37,35,33,31,29,27,25,23,21,19,17,15,13,11,9,7,5,3,1};
	    int[] quick_sorted_num_32 =    {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64};
	    int[] quick_reverse_sorted_num_32 =  {63,61,59,57,55,53,51,49,47,45,43,41,39,37,35,33,31,29,27,25,23,21,19,17,15,13,11,9,7,5,3,1};
	   	int[] heap_sorted_num_32 =    {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64};
	    int[] heap_reverse_sorted_num_32 =  {63,61,59,57,55,53,51,49,47,45,43,41,39,37,35,33,31,29,27,25,23,21,19,17,15,13,11,9,7,5,3,1};
	    

	    int[] merge_random_num_32 = new int[32];
        for(int i = 0; i < merge_random_num_32.length; i++) {
            merge_random_num_32[i] = r2.nextInt(32);	
        }
		//copy for quick sort
		int[] quick_random_num_32 = new int[32];
        for(int i = 0; i < quick_random_num_32.length; i++) {
            quick_random_num_32[i] = merge_random_num_32[i];	
        }
        //copy for heap sort
		int[] heap_random_num_32 = new int[32];
        for(int i = 0; i < heap_random_num_32.length; i++) {
            heap_random_num_32[i] = merge_random_num_32[i];	
        }
	    

	    int[] merge_random_num_1024 = new int[1024];
	    	for(int i=0;i<merge_random_num_1024.length;i++){ 
	    		merge_random_num_1024[i]= r2.nextInt(1024);
		}
		//copy for quick sort
		int[] quick_random_num_1024 = new int[1024];
	    	for(int i=0;i<quick_random_num_1024.length;i++){ 
	    		quick_random_num_1024[i]= merge_random_num_1024[i];
		}
		//copy for quick sort
		int[] heap_random_num_1024 = new int[1024];
	    	for(int i=0;i<heap_random_num_1024.length;i++){ 
	    		heap_random_num_1024[i]= merge_random_num_1024[i];
		}

        
        int[] merge_random_num_32768 = new int[32768];
        for(int i = 0; i < merge_random_num_32768.length; i++) {
            merge_random_num_32768[i] = r2.nextInt(32768);	
        }
        //copy for quick sort
        int[] quick_random_num_32768 = new int[32768];
        for(int i = 0; i < quick_random_num_32768.length; i++) {
            quick_random_num_32768[i] = merge_random_num_32768[i];	
        }
        //copy for heap sort
        int[] heap_random_num_32768 = new int[32768];
        for(int i = 0; i < heap_random_num_32768.length; i++) {
            heap_random_num_32768[i] = merge_random_num_32768[i];	
        }
	    
	    int[] merge_random_num_1048576 = new int[1048576];
	    	for(int i=0;i<merge_random_num_1048576.length;i++){ 
	    		merge_random_num_1048576[i]= r2.nextInt(1048576);
		}
		//copy for quick sort
		int[] quick_random_num_1048576 = new int[1048576];
	    	for(int i=0;i<quick_random_num_1048576.length;i++){ 
	    		quick_random_num_1048576[i]= merge_random_num_1048576[i];
		}
		//copy for heap sort
		int[] heap_random_num_1048576 = new int[1048576];
	    	for(int i=0;i<heap_random_num_1048576.length;i++){ 
	    		heap_random_num_1048576[i]= merge_random_num_1048576[i];
		}

//Data end

//Merge Sort
		comp_counter=0;
		System.out.print("\nUnsorted Array \n");
	    printarr(merge_sorted_num_32);
	    final long startTime_sorted_merge_32 = System.nanoTime(); 
		mergesort(merge_sorted_num_32,0,merge_sorted_num_32.length-1); //default call
		final long endTime_sorted_merge_32 = System.nanoTime(); 
        System.out.print("Merge Sort made " +comp_counter+" Comparisons to sort a Sorted Array with 32 elements ->" + ((endTime_sorted_merge_32 - startTime_sorted_merge_32)/1e6) + "\n");
        System.out.print("Sorted Array \n");
        printarr(merge_sorted_num_32);

        comp_counter=0;
        System.out.print("\nUnsorted Array \n");
        printarr(merge_reverse_sorted_num_32);
        final long startTime_rev_sorted_merge_32 = System.nanoTime(); 
        mergesort(merge_reverse_sorted_num_32,0,merge_reverse_sorted_num_32.length-1); //default call
        final long endTime_rev_sorted_merge_32 = System.nanoTime(); 
        System.out.print("Merge Sort made " +comp_counter+" Comparisons to sort a Reversely Sorted Array with 32 elements ->" + ((endTime_rev_sorted_merge_32 - startTime_rev_sorted_merge_32)/1e6)+ "\n");
        System.out.print("Sorted Array \n");
        printarr(merge_reverse_sorted_num_32);

        comp_counter=0;
        System.out.print("\nUnsorted Array \n");
        printarr(merge_random_num_32);
        final long startTime_random_merge_32 = System.nanoTime(); 
        mergesort(merge_random_num_32,0,merge_random_num_32.length-1); //default call
        final long endTime_random_merge_32 = System.nanoTime(); 
        System.out.print("Merge Sort made " +comp_counter+" Comparisons to sort a Random Array with 32 elements ->" + ((endTime_random_merge_32 - startTime_random_merge_32)/1e6)+ "\n");
        System.out.print("Sorted Array \n");
        printarr(merge_random_num_32);


//Quick sort
        comp_counter=0;
        System.out.print("\nUnsorted Array \n");
        printarr(quick_sorted_num_32);
        final long startTime_sorted_quick_32 = System.nanoTime(); 
        quickSort(quick_sorted_num_32,0,quick_sorted_num_32.length-1); //default call
        final long endTime_sorted_quick_32 = System.nanoTime(); 
        System.out.print("Quick Sort made " +comp_counter+" Comparisons to sort a Sorted Array with 32 elements ->" + ((endTime_sorted_quick_32 - startTime_sorted_quick_32)/1e6)+ "\n");
        System.out.print("Sorted Array \n");
        printarr(quick_sorted_num_32);

        comp_counter=0;
        System.out.print("\nUnsorted Array \n");
        printarr(quick_reverse_sorted_num_32);
        final long startTime_rev_sorted_quick_32 = System.nanoTime(); 
        quickSort(quick_reverse_sorted_num_32,0,quick_reverse_sorted_num_32.length-1); //default call
        final long endTime_rev_sorted_quick_32 = System.nanoTime(); 
        System.out.print("Quick Sort made " +comp_counter+" Comparisons to sort a Reversely Sorted Array with 32 elements ->" + ((endTime_sorted_quick_32 - startTime_sorted_quick_32)/1e6)+ "\n");
		System.out.print("Sorted Array \n");
		printarr(quick_reverse_sorted_num_32);

		comp_counter=0;
		System.out.print("\nUnsorted Array \n");
        printarr(quick_random_num_32);
        final long startTime_random_quick_32 = System.nanoTime(); 
        quickSort(quick_random_num_32,0,quick_random_num_32.length-1); //default call
        final long endTime_random_quick_32 = System.nanoTime(); 
        System.out.print("Quick Sort made " +comp_counter+" Comparisons to sort a Random Array with 32 elements ->" + ((endTime_random_quick_32 - startTime_random_quick_32)/1e6)+ "\n");
        System.out.print("Sorted Array \n");
        printarr(quick_random_num_32);
//heap sort 
		
		comp_counter=0;
		System.out.print("\nUnsorted Array \n");
        printarr(heap_sorted_num_32);
        final long startTime_sorted_heap_32 = System.nanoTime(); 
        buildHeap(heap_sorted_num_32); //default call
        final long endTime_sorted_heap_32 = System.nanoTime(); 
        System.out.print("Heap Sort made " +comp_counter+" Comparisons to sort a Sorted Array with 32 elements ->" + ((endTime_sorted_heap_32 - startTime_sorted_heap_32)/1e6)+ "\n");
        System.out.print("Sorted Array \n");
        printarr(heap_sorted_num_32);

        comp_counter=0;
        System.out.print("\nUnsorted Array \n");
        printarr(heap_reverse_sorted_num_32);
        final long startTime_rev_sorted_heap_32 = System.nanoTime(); 
        buildHeap(heap_reverse_sorted_num_32); //default call
        final long endTime_rev_sorted_heap_32 = System.nanoTime(); 
        System.out.print("Heap Sort made " +comp_counter+" Comparisons to sort a Reversely Sorted Array with 32 elements ->" + ((endTime_rev_sorted_heap_32 - startTime_rev_sorted_heap_32)/1e6)+ "\n");
		System.out.print("Sorted Array \n");
		printarr(heap_reverse_sorted_num_32);
		
		comp_counter=0;
		System.out.print("\nUnsorted Array \n");
        printarr(heap_random_num_32);
        final long startTime_random_heap_32 = System.nanoTime(); 
        buildHeap(heap_random_num_32); //default call
        final long endTime_random_heap_32 = System.nanoTime(); 
        System.out.print("Heap Sort made " +comp_counter+" Comparisons to sort a Random Array with 32 elements ->" + ((endTime_random_heap_32 - startTime_random_heap_32)/1e6)+ "\n");
		System.out.print("Sorted Array \n");
		printarr(heap_random_num_32);

//huge data 2^10
        comp_counter=0;
        final long startTime_random_merge_1024 = System.nanoTime(); 
        mergesort(merge_random_num_1024,0,merge_random_num_1024.length-1); //default call
        final long endTime_random_merge_1024 = System.nanoTime(); 
        System.out.print("\nMerge Sort made " +comp_counter+" Comparisons to sort a Random Array with 1024 elements ->" + ((endTime_random_merge_1024 - startTime_random_merge_1024)/1e6)+ "\n");

        comp_counter=0;
        final long startTime_random_quick_1024 = System.nanoTime(); 
        quickSort(quick_random_num_1024,0,quick_random_num_1024.length-1); //default call
        final long endTime_random_quick_1024 = System.nanoTime(); 
        System.out.print("Quick Sort made " +comp_counter+" Comparisons to sort a Random Array with 1024 elements ->" + ((endTime_random_quick_1024 - startTime_random_quick_1024)/1e6)+ "\n");

        comp_counter=0;
        final long startTime_random_heap_1024 = System.nanoTime(); 
        buildHeap(heap_random_num_1024); //default call
        final long endTime_random_heap_1024 = System.nanoTime(); 
        System.out.print("Heap Sort made " +comp_counter+" Comparisons to sort a Random Array with 1024 elements ->" + ((endTime_random_heap_1024 - startTime_random_heap_1024)/1e6)+ "\n");


//huge data 2^15
        comp_counter=0;
		final long startTime_random_merge_32768 = System.nanoTime(); 
        mergesort(merge_random_num_32768,0,merge_random_num_32768.length-1); //default call
        final long endTime_random_merge_32768 = System.nanoTime(); 
        System.out.print("\nMerge Sort made " +comp_counter+" Comparisons to sort a Random Array with 32768 elements ->" + ((endTime_random_merge_32768 - startTime_random_merge_32768)/1e6)+ "\n");

        comp_counter=0;
        final long startTime_random_quick_32768 = System.nanoTime(); 
        quickSort(quick_random_num_32768,0,quick_random_num_32768.length-1); //default call
        final long endTime_random_quick_32768 = System.nanoTime(); 
        System.out.print("Quick Sort made " +comp_counter+" Comparisons to sort a Random Array with 32768 elements ->" + ((endTime_random_quick_32768 - startTime_random_quick_32768)/1e6)+ "\n");

        comp_counter=0;
        final long startTime_random_heap_32768 = System.nanoTime(); 
        buildHeap(heap_random_num_32768); //default call
        final long endTime_random_heap_32768 = System.nanoTime(); 
        System.out.print("Heap Sort made " +comp_counter+" Comparisons to sort a Random Array with 32768 elements ->" + ((endTime_random_heap_32768 - startTime_random_heap_32768)/1e6)+ "\n");

//huge data 2^20
        comp_counter=0;
		final long startTime_random_merge_1048576 = System.nanoTime(); 
        mergesort(merge_random_num_1048576,0,merge_random_num_1048576.length-1); //default call
        final long endTime_random_merge_1048576 = System.nanoTime(); 
        System.out.print("\nMerge Sort made " +comp_counter+" Comparisons to sort a Random Array with 1048576 elements ->" + ((endTime_random_merge_1048576 - startTime_random_merge_1048576)/1e6)+ "\n");

        comp_counter=0;
        final long startTime_random_quick_1048576 = System.nanoTime(); 
        quickSort(quick_random_num_1048576,0,quick_random_num_1048576.length-1); //default call
        final long endTime_random_quick_1048576 = System.nanoTime(); 
        System.out.print("Quick Sort made " +comp_counter+" Comparisons to sort a Random Array with 1048576 elements ->" + ((endTime_random_quick_1048576 - startTime_random_quick_1048576)/1e6)+ "\n");

        comp_counter=0;
        final long startTime_random_heap_1048576 = System.nanoTime(); 
        buildHeap(heap_random_num_1048576); //default call
        final long endTime_random_heap_1048576 = System.nanoTime(); 
        System.out.print("Heap Sort made " +comp_counter+" Comparisons to sort a Random Array with 1048576 elements ->" + ((endTime_random_heap_1048576 - startTime_random_heap_1048576)/1e6)+ "\n");

	}
	//-------------------- MergeSort - Start------------------------
	public static void mergesort (int[] num,int start, int end){
			int middle;
			
			if(COMPARE_LT(start , end))
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
				if ((j >= n2) || i < n1 && COMPARE_LTE(left[i], right[j])) {
					num[k] = left[i];
					i++;
				}else {
					num[k]=right[j];
					j++;
				}
			}
		}
	
	//-------------------- MergeSort - End  ------------------------
	//-------------------- QuickSort - Start  ------------------------
	
	public static void quickSort(int[] array, int start, int end){
		if(COMPARE_LT(start, end)){
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot - 1);
			quickSort(array, pivot + 1, end);
		}
	}

	public static int partition(int[] array, int start, int end){
		int pivot = array[end];
		int i = start;
		int temp;
		for(int j = start;j<=end - 1; j++){
			if(COMPARE_LTE(array[j], pivot)){
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
			}
		}
		temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		return i;
	}

	//-------------------- QuickSort - End  ------------------------
	//-------------------- HeapSort - Start  ------------------------
	public static void heapSort(int array[],int len)
    {
        int temp;
        for (int var = len; var >= 2; var--)
        {
            temp = array[var];
            array[var] = array[1];
            array[1] = temp;
            heapify(array, 1, var - 1);
        }
    }
    public static void buildHeap(int array[])//Build Heap Recursion
    {
        int len = array.length;
        for (int var = len / 2; var >= 1; var--)
        {
            heapify(array, var, len);
        }
        heapSort(array,len);
        
    }
    public static void heapify(int array[],int r,int len)//Push Down Recursion
    {
        int m, t;
        t = array[r];
        m = 2 * r;
        while (m <= len)
        {
            if (m < len && COMPARE_LT(array[m + 1], array[m]))
                {
                    m = m + 1;
                }
                if (COMPARE_GT(t , array[m]))
                    break;
                else if ( COMPARE_LTE(t , array[m]))
                {
                    array[m / 2] = array[m];
                    m = 2 * m;
                }
        }
    array[m / 2] = t;
    return; 
    }

	//-------------------- HeapSort - End  ------------------------

	public static boolean COMPARE_LT(int X, int Y){
			comp_counter++;
			if(X < Y){
				return true;
			}else{
				return false;
			}

		}
	public static boolean COMPARE_LTE(int X, int Y){
		comp_counter++;
		if(X <= Y){
			return true;
		}else{
			return false;
		}

	}
	public static boolean COMPARE_GT(int X, int Y){
		comp_counter++;
		if(X > Y){
			return true;
		}else{
			return false;
		}

	}
	public static boolean COMPARE_GTE(int X, int Y){
		comp_counter++;
		if(X >= Y){
			return true;
		}else{
			return false;
		}

	}
	public static void printarr(int[] array){
			for(int i = 0; i < array.length; i++){
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
	
}