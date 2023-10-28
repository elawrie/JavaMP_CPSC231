/**
* The Student abstract class contains basic information about a generic Chapman student
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
public abstract class Student extends Affiliate {
  /** A String representing the student's major */
  protected String m_major;
  /** A String representing the student's minor */
  protected String m_minor;
  /** A String representing the student's class standing */
  protected String m_classStanding;
  /** The default constructor for the Student class */
  public Student() {
    super();
    m_major = "";
    m_minor = "";
    m_classStanding = "";
  }
  /**
  * Creates a student based their name, age, address, phone number, ID, starting year at Chapman, major, minor, and class standing
  * @param name The students's name
  * @param age The student's age
  * @param address The student's address
  * @param phoneNumber The student's phone number
  * @param id The student's ID
  * @param startingYear The student's starting year at Chapman
  * @param major The student's major
  * @param minor The student's minor
  * @param classStanding The student's class standing
  */
  public Student(String name, int age, String address, long phoneNumber, int id, int startingYear, String major, String minor, String classStanding) {
    super(name, age, address, phoneNumber, id, startingYear);
    m_major = major;
    m_minor = minor;
    m_classStanding = classStanding;
  }
  /**
  * Mutator for major attribute
  * @param major The student's major
  */
  public void setMajor(String major) {
    m_major = major;
  }
  /**
  * Mutator for minor attribute
  * @param minor The student's minor
  */
  public void setMinor(String minor) {
    m_minor = minor;
  }
  /**
  * Mutator for class standing attribute
  * @param classStanding The student's class standing
  */
  public void setClassStanding(String classStanding) {
    m_classStanding = classStanding;
  }
  /**
  * Accessor for major attribute
  * @return A String representing the student's major
  */
  public String getMajor() {
    return m_major;
  }
  /**
  * Accessor for minor attribute
  * @return A String representing the student's minor
  */
  public String getMinor() {
    return m_minor;
  }
  /**
  * Accessor for class standing attribute
  * @return A String representing the student's class standing
  */
  public String getClassStanding() {
    return m_classStanding;
  }
  /**
  * The print method prints all information associated with an instance of the Student class
  */
  public void print() {
    super.print();
    System.out.println("Major: " + m_major);
    System.out.println("Minor: " + m_minor);
    System.out.println("Class Standing: " + m_classStanding);
  }
  /**
  * The getInput method prompts the user for data to store as class attributes
  * @param sin A Scanner used to retrieve user input
  */
  public void getInput(Scanner sin) {
    super.getInput(sin);
    System.out.println("Enter the major:");
    this.setMajor(sin.nextLine());
    System.out.println("Enter the minor:");
    this.setMinor(sin.nextLine());
    System.out.println("Enter the class standing:");
    this.setClassStanding(sin.nextLine());
  }
  /**
  * The toString method allows for pretty printing of an instance of the Student class
  * @return a String representing all the information held by an instance of the Student class
  */
  public String toString() {
    String s = super.toString();
    s += m_classStanding + ",";
    s += m_major + ",";
    s += m_minor + ",";
    return s;
  }
}
