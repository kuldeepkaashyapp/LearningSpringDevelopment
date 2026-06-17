it is enhance version of JDBC api where much of the code already written in the jdbc.

!image.png

# why we use  spring jdbc ?

### Problems With JDBC

1. we need write  a lot of repeated code.

   ex: connection —> statement —> execute —> re right

2. Exception handling problem   because SQlExection is a checked exception we have too handle it
3. Repeating of all these codes from one to another database logic is a  time consuming task

## Solution Spring JDBC

1. Spring JDBC provide class jdbc Template which has all the important methods to perform operation  with database .

!image.png

it provides some method

1. update()→ insert update delete… alll
2. execute () → select queries

it have much more

1. If you want to load an entity (object) from the database, you do not need to write the complete SQL query manually. You only need to create an Entity class and a Repository interface. Spring Data JDBC automatically generates and executes the required SQL queries for common CRUD operations such as find, save, update, and delete.
2. **Spring Data JDBC does not support dirty tracking or session management. Any changes made to an entity are persisted to the database only when `save()` is explicitly called.**
- **Dirty Tracking:** Automatic detection of changes made to an entity and updating the database automatically.
- **Session Management:** A mechanism that tracks entities, manages their lifecycle, and maintains their state during database operations.

1. **here is a simple model of how to map entities to tables. It probably only works for rather simple cases. If you do not like that, you should code your own strategy. Spring Data JDBC offers only very limited support for customizing the strategy with annotations.**
- **Entity-to-Table Mapping:** Connecting a Java entity class to a database table.
- **Simple Model:** Spring Data JDBC follows simple default mapping rules.
- **Custom Strategy:** Developers can create their own mapping logic for complex cases.
- **Limited Annotation Support:** Only a small number of annotations are available for customization.

# JDBCTemplate Interface

#### Introduction:

Spring module has spring Framework that simplifies database operation in the java application

before spring JDBC , Developers had to write a  lot of boilerplate code for :

lording driver , creating connection , creating statements handling expectation this was a very though to handle each and every time in the checked exceptions

hence JDBC reduce this complexity using JDBCTemplate

# What is JDBCTemplate ?

it simplifies the jdbc that provide centralize the jdbc function in the handle all the exception and connection and all the things.

it is responsible for :

Establish database connections

- Establish database connections
- Executing SQL queries
- Handling exceptions
- Managing resource automatically
- Converting SQL exceptions into Spring exceptions

### JDBCTemplate Architecture:

!image.png

## Operation For Database

## Insert Operations:

First inserting operation is used to add a new record the database in the table

SQL Query :

INSERT INTO student(name, age, city) VALUES (?, ?, ?);

#### JdbcTemplate function used:

update(): it used to insert the data into the database

!image.png

### Update Operation Using JdbcTemplate/Changing Any Data in DB :

The Update operation is used to modify exiting records in a database Tabe.

SQL Querry : Update talename set colom=? , colomn2=? colom=3 where id=?

in side update set where query is very important .

DAO Method:

public int update(DTO object){

“SQL Querry”

return jdbcTemplate.update(student);

}

!image.png

## Delete Operation Using JdbcTemplate:

The delete operation is used to remove an existing record from a  database table.

SQL Query:

Delete from student where id=?

!image.png

## Select Query :

it is used to get the data from the DB

if you want the single object from database. you can use a function from the JdbcTemplate classes .

**Function:  public T queryForObject(String sql, RowMapper<T> rowmapper,object Args)**

!image.png

### #Row Mapper Interface :

It is a very use full  Functional interface  which have functionality to convert result set into objects

it implement the class which is able to map the Colom to the fields of the classes.

!image.png

### Multiple Objects Using Spring:

it gives n number of object in the  returning the objects

function used : query()

!image.png

how it works :

!image.png

1. jdbcTemplate execute the sql Query
2. the data base returns resultset contianing multiple rows
3. Rowmapper maps each row to student object
4. JDbcTemplate stores  all objects in a list
5. The List is return to the caller

## How it flow the Data for the Realtime User:

!image.png

@Configuration Annotation in Spring Framework

#### Introduction:

@configuration is a spring annotation used to indicate that a class contain spring Bean definitions.

it removes the xml configuration. when spring execution of spring starts it scan first @ configuration marked classes and annotated with @ Bean , and register  objects inside the ioc container

Syntax :

@Configuration
public class SpringConfig {

}

how i t works

!image.png


//notion link
https://www.notion.so/Spring-JDBC-24c6765e2aa68078b6fdec6579764781?source=copy_link