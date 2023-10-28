/**
* The Associate class contains information about an associate professor at Chapman University
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
public class Associate extends Faculty {
  /** An int representing the associate professor's years since becoming a tenured faculty member */
  private int m_yearsSinceTenure;
  /** The default constructor for the Associate professor class */
  public Associate() {
    super();
    m_yearsSinceTenure = 0;
  }
  /**
  * Creates an associate professor based their name, age, address, phone number, ID, starting year at Chapman, department, salary, number of papers published, and years since tenure
  * @param name The associate professors's name
  * @param age The associate professor's age
  * @param address The associate professor's address
  * @param phoneNumber The associate professor's phone number
  * @param id The associate professor's ID
  * @param startingYear The associate professor's starting year at Chapman
  * @param department The associate professor's department
  * @param salary The associate professor's yearly salary
  * @param numPapers The number of papers the associate professor has published
  * @param yearsSinceTenure The associate professor's number of years since becoming a tenured faculty member
  */
  public Associate(String name, int age, String address, long phoneNumber, int id, int startingYear, String department, double salary, int numPapers, int yearsSinceTenure) {
    super(name, age, address, phoneNumber, id, startingYear, department, salary, numPapers);
    m_yearsSinceTenure = yearsSinceTenure;
  }
  /**
  * Mutator for number of years since tenure attribute
  * @param yearsSinceTenure The associate professor's years since becoming a tenured faculty member
  */
  public void setYearsSinceTenure(int yearsSinceTenure) {
    m_yearsSinceTenure = yearsSinceTenure;
  }
  /**
  * Accessor for number of years since tenure attribute
  * @return An int representing the associate professor's years since becoming a tenured faculty member
  */
  public int getYearsSinceTenure() {
    return m_yearsSinceTenure;
  }
  /**
  * The print method prints all information associated with an instance of the Associate class
  */
  public void print() {
    super.print();
    System.out.println("Years Since Tenure: " + m_yearsSinceTenure);
  }
  /**
  * The getInput method prompts the user for data to store as class attributes
  * @param sin A Scanner used to retrieve user input
  */
  public void getInput(Scanner sin) {
    super.getInput(sin);
    System.out.println("Enter the amount of years since tenure:");
    this.setYearsSinceTenure(sin.nextInt());
    sin.nextLine();
  }
  /**
  * The toString method allows for pretty printing of an instance of the Associate class
  * @return a String representing all the information held by an instance of the Associate class
  */
  public String toString() {
    String s = "Associate,";
    s += super.toString();
    s += m_yearsSinceTenure + "\n";
    return s;
  }
}
