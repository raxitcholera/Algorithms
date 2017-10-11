import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class combinations
{
    public static void main(String[] args) {
    	
    	char[] arrayset = {'A','B','C','D'};
    	
    	// int[] arrayset = {1,2,5,6};
    	int length =arrayset.length;
    	// ArrayList<Integer> arr = 
    	System.out.println();
    	System.out.println();
    	for(int j=0;j<length;j++) {
	    	for(int i=0;i<length;i++){
	    		if(i!=j) {
	    			// System.out.println("[NumaritorArrayList.add("+arrayset[i]+")]/[DenominatorArrayList.add("+arrayset[j]+")]");
	    			System.out.println("["+arrayset[i]+","+arrayset[j]+"]");
	    		}
	    	}
    	}

int i=0;
while(length>1){
	System.out.print("[");
	for(i=0;i<length;i++){
    		// System.out.print("NumaritorArrayList.add("+arrayset[i]+") & ");
    		System.out.print(arrayset[i]);
    	}
    	System.out.println(",");
		i=0;
		while (i<length){
		for(int j=0;j<length;j++){
    			if(i!=j)
    				System.out.print(arrayset[j]);
    		}
    		i++;
    		System.out.println();
    	}
    	System.out.print("]");
    	System.out.println();

	length--;
}
System.out.println();
System.out.println();
System.out.println();

// int setsize=arrayset.length;
// int startat=0,endat=arrayset.length;
// int startover = 0;
// while(setsize>1){
// 	for(i=startat;i<setsize;i++){
// 		for(int j=startat;j<endat;j++) {
// 			if(i!=j)
// 				System.out.println("[i = "+arrayset[i]+", j ="+arrayset[j]+"]");
// 			if(setsize<arrayset.length && startover!=0){
// 				startover =1;
// 				j=0;
// 			}
// 		}
// 	}
// 	startat++;
// 	setsize--;
// }



    }

}