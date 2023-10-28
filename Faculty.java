/**
* The Faculty abstract class contains basic information about a generic Chapman faculty member
* @author Evelyn Lawrie
* Student ID: 2364909
* lawrie@chapman.edu
* CPSC 231-04
* MP4: Inheritance, Interfaces, & Abstract Classes - Oh My!
* @version 1.0
* @see Printable
* @see Affiliate
* @see Faculty
* @see Student
* @see Staff
* @see Assistant
* @see Associate
* @see Full
* @see Graduate
* @see Undergrad
* @see FullTime
* @see PartTime
* @see AffiliatesDriver
*/
import java.util.Scanner;
public abstract class Faculty extends Affiliate {
  /** A String representing the faculty member's department */
  protected String m_department;
  /** A double representing the faculty member's yearly salary */
  protected double m_salary;
  /** An int representing the number of papers that the faculty member has published */
  protected int m_numPapers;
  /** The default constructor for the Faculty Classes */
  public Faculty() {
    super();
    m_department = "";
    m_salary = 0.0;
    m_numPapers = 0;
  }
  /**
  * Creates a faculty member based their name, age, address, phone number, ID, starting year at Chapman, department, salary, and number of papers published
  * @param name The faculty members's name
  * @param age The faculty member's age
  * @param address The faculty member's address
  * @param phoneNumber The faculty member's phone number
  * @param id The faculty member's ID
  * @param startingYear The faculty member's starting year at Chapman
  * @param department The faculty member's department
  * @param salary The faculty member's yearly salary
  * @param numPapers The number of papers the faculty member has published
  */
  public Faculty(String name, int age, String address, long phoneNumber, int id, int startingYear, String department, double salary, int numPapers) {
    super(name, age, address, phoneNumber, id, startingYear);
    m_department = department;
    m_salary = salary;
    m_numPapers = numPapers;
  }
  /**
  * Mutator for department attribute
  * @param department The faculty member's department
  */
  public void setDepartment(String department) {
    m_department = department;
  }
  /**
  * Mutator for salary attribute
  * @param salary The faculty member's yearly salary
  */
  public void setSalary(double salary) {
    m_salary = salary;
  }
  /**
  * Mutator for number of papers published attribute
  * @param numPapers The number of papers that the faculty member has published
  */
  public void setNumPapers(int numPapers) {
    m_numPapers = numPapers;
  }
  /**
  * Accessor for department attribute
  * @return A String representing the faculty member's department
  */
  public String getDepartment() {
    return m_department;
  }
  /**
  * Accessor for salary attribute
  * @return A double representing the faculty member's yearly salary
  */
  public double getSalary() {
    return m_salary;
  }
  /**
  * Accessor for number of papers published attribute
  * @return An int representing the number of papers that the faculty member has published
  */
  public int getNumPapers() {
    return m_numPapers;
  }
  /**
  * The print method prints all information associated with an instance of the Faculty class
  */
  public void print() {
    super.print();
    System.out.println("Department: " + m_department);
    System.out.println("Salary: $" + m_salary);
    System.out.println("Number of Papers Published: " + m_numPapers);
  }
  /**
  * The getInput method prompts the user for data to store as class attributes
  * @param sin A Scanner used to retrieve user input
  */
  public void getInput(Scanner sin) {
    super.getInput(sin);
    System.out.println("Enter the department:");
    this.setDepartment(sin.nextLine());
    System.out.println("Enter the salary:");
    this.setSalary(sin.nextDouble());
    sin.nextLine();
    System.out.println("Enter the number of papers published:");
    this.setNumPapers(sin.nextInt());
    sin.nextLine();
  }
  /**
  * The toString method allows for pretty printing of an instance of the Faculty class
  * @return a String representing all the information held by an instance of the Faculty class
  */
  public String toString() {
    String s = super.toString();
    s += m_department + ",";
    s += m_numPapers + ",";
    s += m_salary + ",";
    return s;
  }
}
