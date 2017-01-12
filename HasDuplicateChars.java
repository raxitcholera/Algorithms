public class HasDuplicateChars {

	public static void main(String[] args){
		HasDuplicateChars check = new HasDuplicateChars();
        if( check.hasDuplicateChars("Raxit") )
        {
        	System.out.println("\t Raxit Has Duplicate Charcters");
        } else {
        	System.out.println("\t Raxit Does not have Duplicate Charcters");
        }
        if( check.hasDuplicateChars("Apple") ){
        	System.out.println("\t Apple Has Duplicate Charcters");
        } else {
        	System.out.println("\t Apple Does not have Duplicate Charcters");
        }

	}
	public boolean hasDuplicateChars(String s)
	{
		for(int i=0;i<s.length()-1;i++){
			for (int j=i+1;j<s.length()-1;j++) {
				if(s.charAt(i) == s.charAt(j)){
					return true;
				}
			}
		}
		return false;
	}
}