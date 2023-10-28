/**
* The FullTime class contains information about a full time staff member at Chapman University
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
public class FullTime extends Staff {
  /** A double representing the full time staff member's yearly salary */
  private double m_yearlySalary;
  /** Default constructor for FullTime class */
  public FullTime() {
    super();
    m_yearlySalary = 0.0;
  }
  /**
  * Creates a full time staff member based their name, age, address, phone number, ID, starting year at Chapman, title, building, and yearly salary
  * @param name The full time staff members's name
  * @param age The full time staff member's age
  * @param address The full time staff member's address
  * @param phoneNumber The full time staff member's phone number
  * @param id The full time staff member's ID
  * @param startingYear The full time staff member's starting year at Chapman
  * @param title The full time staff member's title
  * @param building The full time staff member's building
  * @param yearlySalary The full time staff member's yearly salary
  */
  public FullTime(String name, int age, String address, long phoneNumber, int id, int startingYear, String title, String building, double yearlySalary) {
    super(name, age, address, phoneNumber, id, startingYear, title, building);
    m_yearlySalary = yearlySalary;
  }
  /**
  * Mutator for yearly salary attribute
  * @param yearlySalary The full time staff member's yearly salary
  */
  public void setYearlySalary(double yearlySalary) {
    m_yearlySalary = yearlySalary;
  }
  /**
  * Accessor for yearly salary attribute
  * @return A double representing the full time staff member's yearly salary
  */
  public double getYearlySalary() {
    return m_yearlySalary;
  }
  /**
  * The print method prints all information associated with an instance of the FullTime class
  */
  public void print() {
    super.print();
    System.out.println("Yearly Salary: $" + m_yearlySalary);
  }
  /**
  * The getInput method prompts the user for data to store as class attributes
  * @param sin A Scanner used to retrieve user input
  */
  public void getInput(Scanner sin) {
    super.getInput(sin);
    System.out.println("Enter the yearly salary:");
    this.setYearlySalary(sin.nextInt());
    sin.nextLine();
  }
  /**
  * The toString method allows for pretty printing of an instance of the FullTime class
  * @return a String representing all the information held by an instance of the FullTime class
  */
  public String toString() {
    String s = "FullTime,";
    s += super.toString();
    s += m_yearlySalary + "\n";
    return s;
  }
}
