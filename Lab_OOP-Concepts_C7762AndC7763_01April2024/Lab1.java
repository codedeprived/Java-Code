//LAB_1

/*
1. Create a Bank class and declare an instance variable named amount of type double.

Create parameterized constructor to initialize variable “amount” with value 10000.

Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).

Calculate withdrawal based on some condition  like

If amount is sufficient then “withdraw successful” message will be printed on the console

and amount should be updated after withdraw. Later on, deposit 5000 in the account balance.

At the end display total balance on the console.

2. Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator.

*/

/*
Author: Manmohan
*/

import java.util.Scanner;

/*
Bank class to manage user's bank account
*/
class Bank {

	/*
	 * instance variable to store the amount in the account
	 */
	private double amount;

	/*
	 * Parameterized constructor to initialize the amount with 10000
	 */
	public Bank(double amount) {
		this.amount = amount;
	}

	/*
	 * Getter method for amount
	 */
	public double getAmount() {
		return amount;
	}

	/*
	 * Setter method for amount
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/*
	 * Method to withdraw amount from the account Returns a message indicating if
	 * the withdrawal was successful or not Updates the amount in the account if the
	 * withdrawal was successful
	 */
	public String withdrawalAmount(double amount) {
		if (amount > this.getAmount()) {
			return "Withdrawal is unsuccessful";
		} else {
			setAmount(this.getAmount() - amount);
			return "Withdrawal is successful";
		}

	}

	/*
	 * Method to deposit amount to the account Updates the amount in the account
	 */
	public String deposit(double amount) {
		setAmount(this.getAmount() + amount);
		return "Amount Deposited Successfully";
	}

}

public class Lab1 {
	public static void main(String[] args) {
		// Initializing amount to 10000 as per task requirement
		Bank user1 = new Bank(10000);
		System.out.println("---------------Welcome to Bank----------------");
		System.out.println(user1.withdrawalAmount(10001));

		System.out.println(user1.withdrawalAmount(1000) + "\nAvailable balance : " + user1.getAmount());
		System.out.println(user1.deposit(5000) + "\nAvailable balance : " + user1.getAmount());

		System.out.println("\n\n");
		System.out.println("question 2");
		findMaximum();

	}

	// Method to find the maximum between two numbers using ternary operator
	static void findMaximum() {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Number 1 = " + num1 + ", Number 2 = " + num2);
		int ans = num1 > num2 ? num1 : num2;
		System.out.println("Maximum number = " + ans);
	}
}

//OUTPUT:
/*
---------------Welcome to Bank---------------- // balance initialized to 10000 on object creation;
Withdrawal is unsuccessful // when 10001 is withdrawn
Withdrawal is successful   // when 1000 is withdrawn
Available balance : 9000.0
Amount Deposited Successfully
Available balance : 14000.0

question 2
Enter two numbers: 
50 60
Number 1 = 50, Number 2 = 60
Maximum number = 60
*/

