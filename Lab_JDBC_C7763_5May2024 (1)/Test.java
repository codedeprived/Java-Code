/*
QUESIONS:-
Q1) Write a code and make a connection with mysql and oracle database Using JDBC steps?

Q2) After making connection create a table and insert few records in the table.

*/

//AUTHOR: Manmohan 

package com.basicDataStructure;
//Step 1 : Import neccesary utilities from java.sql package.
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 

public class Test {
    public static void main(String[] args) {
        connectToOracleDB(); // Initiates connection to Oracle database.
        // connectToMySqlDb(); //Initiates connection to  MySQL database.
    }

    // Method to connect to a MySQL database.
    private static void connectToMySqlDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 2. Load MySQL JDBC driver.
            System.out.println("Driver loaded");

            Connection dataBaseConnection = DriverManager.getConnection("jdbc:sqlserver://<dbhost>:<dbport>;databaseName=<dbname>");
            // 3. Establish connection to the MySQL database.
            if (dataBaseConnection != null) {
                System.out.println("Connected to MySQL server...");
            } else {
                System.out.println("Connection not established. Please try again.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to connect to an Oracle database.
    public static void connectToOracleDB() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // 2. Load Oracle JDBC driver.
            System.out.println("Driver loaded");

            Connection dataBaseConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "self", "admin");
            // 3. Establish connection to the Oracle database.
            if (dataBaseConnection != null) {
                System.out.println("Connected to Oracle Database....");
                
                // 4. Prepare statements for database operations.
                
                PreparedStatement query = dataBaseConnection.prepareStatement("create table Student (roll_id int primary key, name varchar(20) not null)");
                PreparedStatement query2 = dataBaseConnection.prepareStatement("insert into  Student values(1 , 'Student')");
                PreparedStatement query3 = dataBaseConnection.prepareStatement("insert into  Student values(2 , 'Student2')");

                // Step 5. Execute the Prepared Queries.
                
                // query.execute();
                // query2.execute();
                query3.execute(); // 5. Execute the prepared statements.
            } else {
                System.out.println("Connection not established. Please try again.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//OUTPUT
/*
Driver loaded
connected to Oracle Database....
----------------------------------
Database 
select * form Student; // result

ROLL_ID	NAME
1	Student
2	Student2

*/

