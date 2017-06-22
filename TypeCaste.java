package typecaste.assignment34;

public class TypeCaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here the values are initialize the values of short and byte\\	
		short s = 5;
		byte b = 2;
		int I = (int)s + (int)b;
		// here the value of short and byte are converted into int by using casting and these values are added,
		//then value is assigned to I
				
		System.out.println("value of int    I is   "+ I);
		long L = (long)I + (long)s;
		//here the values of int and short are converted into long by using casting and these values are added ,
		//then the value is assigned to the variable of long that is L. 
		
		System.out.print("value of long   L is   "+L);
		float F = (float)I + (float)L; 
		//Here the values of long  and int are converted into float by using casting and these values are added ,
		//then the value is assigned to the variable of float  that is F. 
		
		System.out.print("\nvalue of float  F is   "+F);
		double D =(double)F + (double)L;
		//here the values of float  and long are converted into long by using casting and these values are added ,
		//then the value is assigned to the variable of double that is D. 
		
		System.out.print("\nvalue of double D is   "+D);
		

	}

}
