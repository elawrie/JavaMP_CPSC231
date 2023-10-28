/**
* The Full class contains information about a full professor at Chapman University
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
public class Full extends Faculty {
  /** An int representing the full professor's years until retirement */
  private int m_yearsUntilRetire;
  /** The default constructor for the Full professor class */
  public Full() {
    super();
    m_yearsUntilRetire = 0;
  }
  /**
  * Creates a full professor based their name, age, address, phone number, ID, starting year at Chapman, department, salary, number of papers published, and years until retirement
  * @param name The full professors's name
  * @param age The full professor's age
  * @param address The full professor's address
  * @param phoneNumber The full professor's phone number
  * @param id The full professor's ID
  * @param startingYear The full professor's starting year at Chapman
  * @param department The full professor's department
  * @param salary The full professor's yearly salary
  * @param numPapers The number of papers the full professor has published
  * @param yearsUntilRetire The full professor's number of years until retirement
  */
  public Full(String name, int age, String address, long phoneNumber, int id, int startingYear, String department, double salary, int numPapers, int yearsUntilRetire) {
    super(name, age, address, phoneNumber, id, startingYear, department, salary, numPapers);
    m_yearsUntilRetire = yearsUntilRetire;
  }
  /**
  * Mutator for number of years until retirement attribute
  * @param yearsUntilRetire The full professor's years until retiring
  */
  public void setYearsUntilRetire(int yearsUntilRetire) {
    m_yearsUntilRetire = yearsUntilRetire;
  }
  /**
  * Accessor for number of years until retirement attribute
  * @return An int representing the full professor's years until retiring
  */
  public int getYearsUntilRetire() {
    return m_yearsUntilRetire;
  }
  /**
  * The print method prints all information associated with an instance of the Full class
  */
  public void print() {
    super.print();
    System.out.println("Years Until Retirement: " + m_yearsUntilRetire);
  }
  /**
  * The getInput method prompts the user for data to store as class attributes
  * @param sin A Scanner used to retrieve user input
  */
  public void getInput(Scanner sin) {
    super.getInput(sin);
    System.out.println("Enter the amount of years until retirement:");
    this.setYearsUntilRetire(sin.nextInt());
    sin.nextLine();
  }
  /**
  * The toString method allows for pretty printing of an instance of the Full class
  * @return a String representing all the information held by an instance of the Full class
  */
  public String toString() {
    String s = "Full,";
    s += super.toString();
    s += m_yearsUntilRetire + "\n";
    return s;
  }
}
