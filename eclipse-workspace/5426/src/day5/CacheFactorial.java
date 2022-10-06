package day5;

import java.util.ArrayList;
import java.util.List;

public class CacheFactorial {
		
		List<Long>cache=new ArrayList<>();
	  	public long factorial(int n) {
	  	//check size of list
	  		//size is > nthen return elemnt
	  		if(cache.size()>=n) {
	  			System.out.println("RETURNING FROM CACHE.......");
	  			return cache.get(n-1);
	  		}
	  		//size is less
	  		//compute factorial from size to n
	  		if(n==1) {
	  			cache.add(1L);
	  			return 1;
	  			}
	  		long fact=factorial(n-1);
	  		long factn=n*fact;
	  		cache.add(factn);
	  		return factn;
	  		
	  		
	  		
	  		
	  	
	  		//store all factorials between size to n
	  		//return factorial from list
	  		
	  	}
	  
}

