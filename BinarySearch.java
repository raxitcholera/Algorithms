public class BinarySearch {

	public static void main(String[] args){
        int[] num = {4,5,8,9,15,20,24,35,78,86,192,200};
        printAll(num);
        binarySearch(num);
        printAll(num);
	}
	public static void binarySearch (int[] num){
		int i,j,temp,index;
		for(i=0;i<num.length-1;i++) {
			index=i;
			for(j=i+1;j<num.length;j++) {
				if(num[j]<num[index]){
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
