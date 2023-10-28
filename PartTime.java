/**
* The PartTime class contains information about a part time staff member at Chapman University
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
public class PartTime extends Staff {
  /** A double representing the part time staff member's hourly salary */
  private double m_hourlySalary;
  /** Default constructor for PartTime class */
  public PartTime() {
    super();
    m_hourlySalary = 0.0;
  }
  /**
  * Creates a part time staff member based their name, age, address, phone number, ID, starting year at Chapman, title, building, and hourly salary
  * @param name The part time staff members's name
  * @param age The part time staff member's age
  * @param address The part time staff member's address
  * @param phoneNumber The part time staff member's phone number
  * @param id The part time staff member's ID
  * @param startingYear The part time staff member's starting year at Chapman
  * @param title The part time staff member's title
  * @param building The part time staff member's building
  * @param hourlySalary The part time staff member's hourly salary
  */
  public PartTime(String name, int age, String address, long phoneNumber, int id, int startingYear, String title, String building, double hourlySalary) {
    super(name, age, address, phoneNumber, id, startingYear, title, building);
    m_hourlySalary = hourlySalary;
  }
  /**
  * Mutator for hourly salary attribute
  * @param hourlySalary The part time staff member's hourly salary
  */
  public void setHourlySalary(double hourlySalary) {
    m_hourlySalary = hourlySalary;
  }
  /**
  * Accessor for hourly salary attribute
  * @return A double representing the part time staff member's hourly salary
  */
  public double getHourlySalary() {
    return m_hourlySalary;
  }
  /**
  * The print method prints all information associated with an instance of the PartTime class
  */
  public void print() {
    super.print();
    System.out.println("Hourly Salary: $" + m_hourlySalary);
  }
  /**
  * The getInput method prompts the user for data to store as class attributes
  * @param sin A Scanner used to retrieve user input
  */
  public void getInput(Scanner sin) {
    super.getInput(sin);
    System.out.println("Enter the hourly salary:");
    this.setHourlySalary(sin.nextDouble());
    sin.nextLine();
  }
  /**
  * The toString method allows for pretty printing of an instance of the PartTime class
  * @return a String representing all the information held by an instance of the PartTime class
  */
  public String toString() {
    String s = "PartTime,";
    s += super.toString();
    s += m_hourlySalary + "\n";
    return s;
  }
}
