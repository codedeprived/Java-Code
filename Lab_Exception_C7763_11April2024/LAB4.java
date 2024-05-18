/*
Problem Statement 

1: Develop a simple java application to calculate the tax for a particular
employee based on his salary. Develop a class named “TaxCalculator“ with a 
method named calculateTax with the following method parameters, Variable Name
Data Type empName String isIndian boolean empSal double This method should return 
a double taxAmount. The business logic for calculating the tax is as follows, 
this has to be implemented inside the method, If the employee is not a Indian 
The calculator should throw a CountryNotValidException If the employee name is 
null or empty The calculator should throw a EmployeeNameInvalidException If empSal
is greater than one lakh and isIndian true taxAmount =empSal *8/100 Otherwise If
empSal is between 50K and 1lakh and isIndian true taxAmount =empSal *6/100 Otherwise
If empSal is between 30 and 50 Thousand and isIndian true taxAmount =empSal *5/100 Otherwise
If empSal is between 10 and 30 Thousand and isIndian true taxAmount =empSal *4/100 Otherwise 
The calculator should throw a TaxNotEligibleException. Develop a main class 
CalculatorSimulator , implement the following logic in main method 

. Execute the calculateTax Method and print the tax amount as “Tax amount is “ 
2. In case the calculateTaxMethod throws exceptions, this method needs to catch
    the appropriate exception print the stack trace and display the following messages, 
a. Country not valid: “The employee should be an Indian citizen for calculating tax” 
b. Employee name not valid: “The employee name cannot be empty” 
c. Not eligible for Tax calculation: “The employee does not need to pay tax”
    The following test cases to be executed, change the data in main method and run
    it and verify the output messages Test Cases Employee 
    Name Employee Salary Is Indian Message Expected 
    
Test Case 1 Ron 34000 False The employee should be an Indian citizen for calculating tax. 
Test Case 2 Tim 1000 True The employee does not need to pay tax 
Test Case 3 Jack 55000 True Tax amount is 3300 Test Case 4 30000 True The employee name cannot be empty.


2. . Create a program with a logic that throws the ArrayIndexOutOfBoundsException 
while accessing elements in an array.[Hint: Use array and loop and try to access the element beyond the last index]

*/


/* Author : Manmohan

*/

// Custom exception for country not valid
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

// Custom exception for employee name invalid
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

// Custom exception for not eligible for tax
class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

// TaxCalculator class
class TaxCalculator {
    // Method to calculate tax
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }

        double taxAmount;

        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal > 50000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal > 30000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal > 10000) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }

        return taxAmount;
    }
}

// CalculatorSimulator class
public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();

        // Test Cases
        try {
            System.out.println("Test Case 1:");
            System.out.println("Ron 34000 False");
            System.out.println("Expected Output:");
            System.out.println("The employee should be an Indian citizen for calculating tax.");
            System.out.println("Actual Output:");
            calculator.calculateTax("Ron", false, 34000);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nTest Case 2:");
            System.out.println("Tim 1000 True");
            System.out.println("Expected Output:");
            System.out.println("The employee does not need to pay tax");
            System.out.println("Actual Output:");
            calculator.calculateTax("Tim", true, 1000);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nTest Case 3:");
            System.out.println("Jack 55000 True");
            System.out.println("Expected Output:");
            System.out.println("Tax amount is 3300");
            System.out.print("Actual Output:");
            System.out.println(calculator.calculateTax("Jack", true, 55000));
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nTest Case 4:");
            System.out.println("30000 True");
            System.out.println("Expected Output:");
            System.out.println("The employee name cannot be empty.");
            System.out.print("Actual Output:");
            calculator.calculateTax("", true, 30000);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }

        // Program  to demonstrate ArrayIndexOutOfBoundsException
        System.out.println("===================================================");
        System.out.println("2nd Program ");
        int arr[] = { 1, 2, 3, 4 };

        try {
            // Accessing element at index 5, which is out of bounds
            System.out.println(arr[5]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}

/*OUTPUT*/

/*
Test Case 1:
Ron 34000 False
Expected Output:
The employee should be an Indian citizen for calculating tax.
Actual Output:
The employee should be an Indian citizen for calculating tax

Test Case 2:
Tim 1000 True
Expected Output:
The employee does not need to pay tax
Actual Output:
The employee does not need to pay tax

Test Case 3:
Jack 55000 True
Expected Output:
Tax amount is 3300
Actual Output:3300.0

Test Case 4:
30000 True
Expected Output:
The employee name cannot be empty.
Actual Output:The employee name cannot be empty
===================================================
2nd Program 
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
	at Lab1q2.CalculatorSimulator.main(CalculatorSimulator.java:110)

*/


