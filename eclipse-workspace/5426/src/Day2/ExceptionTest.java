package Day2;

public class ExceptionTest {
	public int div(int a,int b) throws Exception {      //delegate an exception
		if (b==100) throw new Exception("B IS 100 INVALID VALUE");     //birth of an exception
			return a/b;
	}
	public int calSI(int p,int r,int t) {
		try{
			return div(p*r*t,100);
			}
		catch(Exception e) {
		//	e.printStackTrace();
			//System.out.println("Exception occurred");
		}finally {
			System.out.println("This code will always to be executed......... ");
		}
		return 0;
		
	}
public static void main(String[] args) {
	ExceptionTest test=new ExceptionTest();
	int interest=test.calSI(100,30, 40);
	System.out.println(interest);
}
}
