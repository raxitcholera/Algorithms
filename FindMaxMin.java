import java.util.*;
public class FindMaxMin {

	public static void main(String[] args){
        int[] num = {4,5,8,9,15,20,24,35,78,86,192,200};
        int max = num[0];int min = num[0];
        findMaxMin(num,max,min,1,num.length-1);
        System.out.print("\t Max = "+max+"\t Min = "+min);
	}
	public static void findMaxMin (int[] num, int max, int min, int start, int end){
		int mid = (int)Math.floor(end/2);
		if(start==1||start==2) {
			if(num[start]>max)
			{
				max = num[start];
				System.out.print("\t Max = "+max);
			}else if (num[start]<min){
				min = num[start];
				System.out.print("\t Min = "+min);
			}
			return;
		}
		findMaxMin(num,max,min,start,mid);
		findMaxMin(num,max,min,mid,end);
	}
	public static void printAll(int[] num) {
		for(int i = 0; i < num.length; i++){
            System.out.print("\t" + num[i]);
        }
        System.out.println();
	}
}
