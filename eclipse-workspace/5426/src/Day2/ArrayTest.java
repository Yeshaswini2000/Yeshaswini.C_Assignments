package Day2;

public class ArrayTest {
	public static void print(String[] s) {
		//System.out.println(arr.getClass().getName());
		for (int i = 0; i < s.length; i++) {
			System.out.println("element at i "+i + " is "+s[i]);
			
		}
	}
	
	public static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("element at "+i+","+j+" is "+a[i][j]);
				
			}
		}
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a =new int[3];
		//System.out.println(a);
		int [] a=new int [] {2,3,5};  //initialise an array without the size as compiler only fixes the size of array
		//print(a);
		String [] s=new String[] {"hello","valtech"};
		print(s);     //string aarray
		int [][] i=new int [3][];
		i[0]=new int[] {2,4};
		i[1]=new int[] {3,4,5,6,7};
		i[2]=new int[0];
		print(i);
		
	}

}
