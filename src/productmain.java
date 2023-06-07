
public class productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1=new product("product 1",10.89,50);
		product p2=new product("product 2",17.99,40);
		product p3=new product("product 3",6.19,20);
		
		p1.sell(20);
		p2.sell(34);
		p3.sell(34);
		 System.out.println("total product sold"+product.gettotalsold());

	}

}
