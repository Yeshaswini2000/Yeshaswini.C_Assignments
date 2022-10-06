package day5;

import java.util.Comparator;

public class StringSorter implements Comparator<String> {
	private int isLength(String s2) {
        return  s2.length();
    }
	
    
	public int vowelCount(String str) {
		   String vowels="AaEeIiOoUu";
		   int count=0;
		    for(int i =0 ;i<str.length(); i++) {
	            char s3 = str.charAt(i);
	            if(vowels.contains(""+s3)) {
	                count++;
	            }
	        }
	        return count;
	}

   @Override
   public int compare(String o1, String o2) {
       int si1 = isLength(o1);
       int si2 = isLength(o2);
       
       int v1 = vowelCount(o1);
       int v2 = vowelCount(o2);
       
       if(si1==si2) {
           if(v1<v2) return -1;
           if(v1==v2)
               {
                  return (o1.compareTo(o2)) ;
               }
           return +1;
       }
       if(si1<si2) {
           return -1;
       }
       
       
       return +1;
   }
   
   
   
	   
  
}
