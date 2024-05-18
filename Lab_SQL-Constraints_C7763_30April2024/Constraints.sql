/*
Questions :
Create the following tables using the appropriate constraint and insert the relevant records.

country

-----------

country_id  pk

country_name  not null



state

------

state_id   pk

state_name  not null

country_id  fk



city

-----

city_id  pk

city_name  not null

country_id fk

state_id  fk



employee

---------

eid  pk

ename not null

salary 

contact_no unique

country_id fk

state_id  fk

city_id  fk
*/


-- Author : ManMohan 

-- Create the 'country' table to store countries
CREATE TABLE country (
    country_id NUMBER PRIMARY KEY,    -- Unique ID for each country
    country_name VARCHAR2(50) NOT NULL    -- Name of the country, cannot be NULL
);

-- Create the 'state' table to store states/provinces within countries
CREATE TABLE state (
    state_id NUMBER PRIMARY KEY,    -- Unique ID for each state
    state_name VARCHAR2(50) NOT NULL,    -- Name of the state, cannot be NULL
    country_id NUMBER,    -- Foreign key referencing the 'country' table
    FOREIGN KEY (country_id) REFERENCES country(country_id)    -- Constraint to ensure the country_id exists in 'country' table
);

-- Create the 'city' table to store cities within states
CREATE TABLE city (
    city_id NUMBER PRIMARY KEY,    -- Unique ID for each city
    city_name VARCHAR2(50) NOT NULL,    -- Name of the city, cannot be NULL
    country_id NUMBER,    -- Foreign key referencing the 'country' table
    state_id NUMBER,    -- Foreign key referencing the 'state' table
    FOREIGN KEY (country_id) REFERENCES country(country_id),    -- Constraint to ensure the country_id exists in 'country' table
    FOREIGN KEY (state_id) REFERENCES state(state_id)    -- Constraint to ensure the state_id exists in 'state' table
);

-- Create the 'employee' table to store employee information
CREATE TABLE employee (
    eid NUMBER PRIMARY KEY,    -- Unique ID for each employee
    ename VARCHAR2(50) NOT NULL,    -- Name of the employee, cannot be NULL
    salary NUMBER,    -- Salary of the employee
    contact_no VARCHAR2(20) UNIQUE,    -- Contact number of the employee, must be unique
    country_id NUMBER,    -- Foreign key referencing the 'country' table
    state_id NUMBER,    -- Foreign key referencing the 'state' table
    city_id NUMBER,    -- Foreign key referencing the 'city' table
    FOREIGN KEY (country_id) REFERENCES country(country_id),    -- Constraint to ensure the country_id exists in 'country' table
    FOREIGN KEY (state_id) REFERENCES state(state_id),    -- Constraint to ensure the state_id exists in 'state' table
    FOREIGN KEY (city_id) REFERENCES city(city_id)    -- Constraint to ensure the city_id exists in 'city' table
);

-- Insert data into the 'country' table
INSERT INTO country (country_id, country_name) VALUES (1, 'USA');
INSERT INTO country (country_id, country_name) VALUES (2, 'India');
INSERT INTO country (country_id, country_name) VALUES (3, 'China');

-- Insert data into the 'state' table
INSERT INTO state (state_id, state_name, country_id) VALUES (1, 'California', 1);
INSERT INTO state (state_id, state_name, country_id) VALUES (2, 'Texas', 1);
INSERT INTO state (state_id, state_name, country_id) VALUES (3, 'New York', 1);
INSERT INTO state (state_id, state_name, country_id) VALUES (4, 'Karnataka', 2);
INSERT INTO state (state_id, state_name, country_id) VALUES (5, 'Tamil Nadu', 2);
INSERT INTO state (state_id, state_name, country_id) VALUES (6, 'Beijing', 3);
INSERT INTO state (state_id, state_name, country_id) VALUES (7, 'Shanghai', 3);


-- Insert data into the 'city' table
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (1, 'Los Angeles', 1, 1);
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (2, 'San Francisco', 1, 1);
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (3, 'Dallas', 1, 2);
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (4, 'Houston', 1, 2);
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (5, 'New York City', 1, 3);
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (6, 'Albany', 1, 3);
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (7, 'Bangalore', 2, 4);
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (8, 'Mysore', 2, 4);
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (9, 'Chennai', 2, 5);
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (10, 'Coimbatore', 2, 5);
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (11, 'Beijing', 3, 6);
INSERT INTO city (city_id, city_name, country_id, state_id) VALUES (12, 'Shanghai', 3, 7);



-- Insert data into the 'employee' table
INSERT INTO employee (eid, ename, salary, contact_no, country_id, state_id, city_id) VALUES (1, 'Amit', 46000, '4567890123', 2, 4, 7);
INSERT INTO employee (eid, ename, salary, contact_no, country_id, state_id, city_id) VALUES (2, 'Rajesh', 48000, '5678901234', 2, 4, 7)
INSERT INTO employee (eid, ename, salary, contact_no, country_id, state_id, city_id) VALUES (3, 'Neha', 47000, '6789012345', 2, 5, 9)
INSERT INTO employee (eid, ename, salary, contact_no, country_id, state_id, city_id) VALUES (4, 'Pooja', 49000, '7890123456', 2, 5, 9)
INSERT INTO employee (eid, ename, salary, contact_no, country_id, state_id, city_id) VALUES (5, 'Ankit', 45000, '8901234567', 2, 4, 7)
INSERT INTO employee (eid, ename, salary, contact_no, country_id, state_id, city_id) VALUES (6, 'Divya', 47000, '9012345678', 2, 5, 9)
INSERT INTO employee (eid, ename, salary, contact_no, country_id, state_id, city_id) VALUES (7, 'Suresh', 48000, '0123456789', 2, 4, 7)
INSERT INTO employee (eid, ename, salary, contact_no, country_id, state_id, city_id) VALUES (8, 'Ramesh', 49000, '1234567890', 2, 5, 9)
INSERT INTO employee (eid, ename, salary, contact_no, country_id, state_id, city_id) VALUES (9, 'Manoj', 46000, '2345678901', 2, 4, 7)
INSERT INTO employee (eid, ename, salary, contact_no, country_id, state_id, city_id) VALUES (10, 'Anjali', 47000, '3456789012', 2, 5, 9);


-- Select all records from the 'city' table
SELECT * FROM CITY;

-- Select all records from the 'country' table
SELECT * FROM COUNTRY;

-- Select all records from the 'employee' table
SELECT * FROM EMPLOYEE;

-- Select all records from the 'state' table
SELECT * FROM STATE;

-- Delete a record from the 'city' table
DELETE FROM CITY WHERE CITY_ID = 10;

-- Select all records from the 'city' table after deletion
SELECT * FROM CITY;
