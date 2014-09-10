import java.util.Scanner;
class userInfo {
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]){
	String name;
	int age;
	long phone;
			System.out.print("Enter your name: ");
			name = s.nextLine();
			System.out.print("Enter your age: ");
			age = s.nextInt();
			System.out.print("Enter your contact number: ");
			phone = s.nextLong();
			
			System.out.println("The name of the user is " + name + "\n" + "Age is " + age + " years old." + "\n" + "Contact number is " + phone);
		}
	}
