/**
* The Graduate class contains information about a graduate student at Chapman University
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
public class Graduate extends Student {
  /** An int representing the number of papers the graduate student has published */
  private int m_numPapers;
  /** An int representing the graduate student's thesis advisor */
  private int m_advisor;
  /** The default constructor for the Graduate class */
  public Graduate() {
    super();
    m_numPapers = 0;
    m_advisor = 0;
  }
  /**
  * Creates a graduate student based their name, age, address, phone number, ID, starting year at Chapman, major, minor, class standing, number of papers published, and thesis advisor
  * @param name The graduate students's name
  * @param age The graduate student's age
  * @param address The graduate student's address
  * @param phoneNumber The graduate student's phone number
  * @param id The graduate student's ID
  * @param startingYear The graduate student's starting year at Chapman
  * @param major The graduate student's major
  * @param minor The graduate student's minor
  * @param classStanding The graduate student's class standing
  * @param numPapers The number of papers that the graduate student has published
  * @param advisor The graduate student's thesis advisor
  */
  public Graduate(String name, int age, String address, long phoneNumber, int id, int startingYear, String major, String minor, String classStanding, int numPapers, int advisor) {
    super(name, age, address, phoneNumber, id, startingYear, major, minor, classStanding);
    m_numPapers = numPapers;
    m_advisor = advisor;
  }
  /**
  * Mutator for number of papers published attribute
  * @param numPapers The number of papers that the graduate student has published
  */
  public void setNumPapers(int numPapers) {
    m_numPapers = numPapers;
  }
  /**
  * Mutator for advisor attribute
  * @param advisor The graduate student's thesis advisor
  */
  public void setAdvisor(int advisor) {
    m_advisor = advisor;
  }
  /**
  * Accessor for number of papers published attribute
  * @return An int representing the number of papers that the graduate student has published
  */
  public int getNumPapers() {
    return m_numPapers;
  }
  /**
  * Accessor for advisor attribute
  * @return An int representing the graduate student's thesis advisor
  */
  public int getAdvisor() {
    return m_advisor;
  }
  /**
  * The print method prints all information associated with an instance of the Graduate class
  */
  public void print() {
    super.print();
    System.out.println("Number of Papers Published: " + m_numPapers);
    System.out.println("Advisor: " + m_advisor);
  }
  /**
  * The getInput method prompts the user for data to store as class attributes
  * @param sin A Scanner used to retrieve user input
  */
  public void getInput(Scanner sin) {
    super.getInput(sin);
    System.out.println("Enter the number of papers published:");
    this.setNumPapers(sin.nextInt());
    sin.nextLine();
    System.out.println("Enter the ID of the thesis advisor:");
    this.setAdvisor(sin.nextInt());
    sin.nextLine();
  }
  /**
  * The toString method allows for pretty printing of an instance of the Graduate class
  * @return a String representing all the information held by an instance of the Graduate class
  */
  public String toString() {
    String s = "Graduate,";
    s += super.toString();
    s += m_advisor + ",";
    s += m_numPapers + "\n";
    return s;
  }
}
