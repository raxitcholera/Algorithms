import java.util.*;
import java.text.*;
public class QuickSort {
	public static int COMPCOUNT = 0;

	public static void main(String[] args){
        // int[] num = {5, 8, 24, 15, 200, 192, 86, 35, 78, 4 ,9, 20};


	    Random r2 = new Random();
        int[] random_num_32768 = new int[32768];
        for(int i = 0; i < random_num_32768.length; i++) {
            random_num_32768[i] = r2.nextInt(32768);	
        }
        // printAll(random_num_32768);
        // quickSort(random_num_32768,0,random_num_32768.length-1);
        // printAll(random_num_32768);

        final long startTime_random_quick_32768 = System.nanoTime(); 
        quickSort(random_num_32768,0,random_num_32768.length-1); //default call
        final long endTime_random_quick_32768 = System.nanoTime(); 
        System.out.print("Total time for Quick Sort with Random array with 32 elements \t" + ((endTime_random_quick_32768 - startTime_random_quick_32768)/1e6)+ "\n it went through "+ COMPCOUNT + " coparusions \n");


        
	}
	public static void quickSort(int[] array, int start, int end){
		if(COMPARE(start, end)){
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot - 1);
			quickSort(array, pivot + 1, end);
		}
	}

	public static int partition(int[] array, int start, int end){
		int pivot = array[end];
		int i = start;
		int temp;
		for(int j = start; COMPARE1(j, end - 1); j++){
			if(COMPARE1(array[j], pivot)){
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
	public static boolean COMPARE(int X, int Y){
		COMPCOUNT++;
		if(X < Y){
			return true;
		}else{
			return false;
		}

	}

	public static boolean COMPARE1(int X, int Y){
		COMPCOUNT++;
		if(X <= Y){
			return true;
		}else{
			return false;
		}

	}
	public static void printAll(int[] num) {
		for(int i = 0; i < num.length; i++){
            System.out.print("\t" + num[i]);
        }
        System.out.println();
	}
}