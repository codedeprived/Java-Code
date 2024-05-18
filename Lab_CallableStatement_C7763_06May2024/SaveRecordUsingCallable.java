/*

Q1) WAP to insert record in a table using CallableStatement in java?

*/



//Author : Manmohan

package Session5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class SaveRecordUsingCallable {
    public static void main(String[] args) {
        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "self", "admin");

            // Prepare a CallableStatement to call the stored procedure
            CallableStatement cs = con.prepareCall("{call Save_customer_record(?,?,?,?)}");

            // Register the OUT parameter for the stored procedure
            cs.registerOutParameter(4, java.sql.Types.VARCHAR);
            
            // Create a Scanner object to read user input
            Scanner sc = new Scanner(System.in);
            
            // Read and set the id parameter
            System.out.println("Enter the id: ");
            int id = sc.nextInt();
            cs.setInt(1, id);

            // Read and set the name parameter
            System.out.println("Enter the name: ");
            String name = sc.next();
            cs.setString(2, name);

            // Read and set the city parameter
            System.out.println("Enter the city: ");
            String city = sc.next();
            cs.setString(3, city);

            // Execute the stored procedure
            cs.execute();

            // Retrieve the result message from the stored procedure
            String result = cs.getString(4);

            // Display the result message
            System.out.println("Result: " + result);

            // Close the resources
            cs.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            // Handle any exceptions that occur
            e.printStackTrace();
        }
    }
}

//OUTPUT

/*
    Enter the id ; 
    103
    Enter the name ; 
    rohan
    Enter the city ; 
    shimla
    result Data has been saved successfully
*/

// Oracle DB

/*
ID	NAME	CITY
102	defualt	xyz
103	rohan	shimla
101	-	manmohan
*/