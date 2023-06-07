
public class product {
	  private String name;
	  private double price;
	  private int quantity;
	  private static int totalsold;
	  public product(String name,double price,int quantity)
	  {
		  this.name=name;
		  this.price=price;
		  this.quantity=quantity;
	  }

	   public void sell(int quantity)
	   {
		   if(quantity<=this.quantity)
		   {
			   this.quantity -=quantity;
			   totalsold += quantity;
			   System.out.println(quantity+" "+name+"(s)sold.");
		   }
		   else
		   {
			   
			   System.out.println("quantity of "+name+"to sell");
		   }
		   
	   }
	   public static int gettotalsold()
	   {
		   return totalsold;
	   }
	   
}
