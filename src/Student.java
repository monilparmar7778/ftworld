import java.util.Scanner;

public class   Student {


		// TODO Auto-generated method stub
	    String name;
	    int id;
	    int age;
	    String mobileNo;

	    // this function is used to get the data from user
	    void getData() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter name: ");
	        name = scanner.nextLine();

	        System.out.print("Enter ID: ");
	        id = scanner.nextInt();

	        System.out.print("Enter age: ");
	        age = scanner.nextInt();

	        System.out.print("Enter mobile number: ");
	        scanner.nextLine(); // Consume the newline character
	        mobileNo = scanner.nextLine();
	    }
	    
	 // this function is used display the data
	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Age: " + age);
	        System.out.println("Mobile Number: " + mobileNo);

	}

}
