import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.print("physics marks");
	     int phy=sc.nextInt();
	     System.out.print("mathes marks");
	     int mat=sc.nextInt();
	     System.out.print("chemistry marks");
	     int chm=sc.nextInt();
	     int avg=(mat+chm+phy)/3;
	     System.out.print("your avrge is"+avg);
	     if(avg>=94)
	     {
	    	 System.out.print("grade a");
	    	 
	     }
	     else if(avg>=86 && avg<94)
	     {
	    	 System.out.print("grade b");
	     }
	     else if(avg>=66 && avg<86)
	     {
	    	 System.out.print("grade c");
	     }
	     else if(avg>=33&& avg<66)
	     {
	    	 System.out.print("grade d");
	     }
	     else if(avg>=0 && avg<33)
	     {
	    	 System.out.print("grade f");
	     }
	}

}
