/**
* The Undergrad class contains information about an undergraduate student at Chapman University
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
public class Undergrad extends Student {
  /** An int representing the number of courses the undergraduate student has taken */
  private int m_numCourses;
  /** A double representing the undergraduate student's scholarship amount */
  private double m_scholarship;
  /** The default constructor for the Undergrad class */
  public Undergrad() {
    super();
    m_numCourses = 0;
    m_scholarship = 0.0;
  }
  /**
  * Creates an undergraduate student based their name, age, address, phone number, ID, starting year at Chapman, major, minor, class standing, number of courses taken, and amount of scholarship money received
  * @param age The undergraduate student's age
  * @param address The undergraduate student's address
  * @param phoneNumber The undergraduate student's phone number
  * @param id The undergraduate student's ID
  * @param startingYear The undergraduate student's starting year at Chapman
  * @param major The undergraduate student's major
  * @param minor The undergraduate student's minor
  * @param classStanding The undergraduate student's class standing
  * @param numCourses The number of courses the undergraduate student has taken
  * @param scholarship The undergraduate student's scholarship amount
  */
  public Undergrad(String name, int age, String address, long phoneNumber, int id, int startingYear, String major, String minor, String classStanding, int numCourses, double scholarship) {
    super(name, age, address, phoneNumber, id, startingYear, major, minor, classStanding);
    m_numCourses = numCourses;
    m_scholarship = scholarship;
  }
  /**
  * Mutator for number of courses taken attribute
  * @param numCourses The number of courses the undergraduate student has taken
  */
  public void setNumCourses(int numCourses) {
    m_numCourses = numCourses;
  }
  /**
  * Mutator for scholarship attribute
  * @param scholarship The undergraduate student's scholarship amount
  */
  public void setScholarship(double scholarship) {
    m_scholarship = scholarship;
  }
  /**
  * Accessor for number of courses taken attribute
  * @return An int representing the number of courses that the undergraduate student has taken
  */
  public int getNumCourses() {
    return m_numCourses;
  }
  /**
  * Accessor for scholarship attribute
  * @return A double representing the undergraduate student's scholarship amount
  */
  public double getScholarship() {
    return m_scholarship;
  }
  /**
  * The print method prints all information associated with an instance of the Undergrad class
  */
  public void print() {
    super.print();
    System.out.println("Number of Courses Taken: " + m_numCourses);
    System.out.println("Scholarship Amount: $" + m_scholarship);
  }
  /**
  * The getInput method prompts the user for data to store as class attributes
  * @param sin A Scanner used to retrieve user input
  */
  public void getInput(Scanner sin) {
    super.getInput(sin);
    System.out.println("Enter the number of courses taken:");
    this.setNumCourses(sin.nextInt());
    sin.nextLine();
    System.out.println("Enter the amount of scholarship money received:");
    this.setScholarship(sin.nextDouble());
    sin.nextLine();
  }
  /**
  * The toString method allows for pretty printing of an instance of the Undergrad class
  * @return a String representing all the information held by an instance of the Undergrad class
  */
  public String toString() {
    String s = "Undergrad,";
    s += super.toString();
    s += m_numCourses + ",";
    s += m_scholarship + "\n";
    return s;
  }
}
