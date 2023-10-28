/**
* The Staff abstract class contains basic information about a generic Chapman staff member
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
public abstract class Staff extends Affiliate {
  /** A String representing the staff member's title */
  protected String m_title;
  /** A String representing the staff member's building */
  protected String m_building;
  /** Default constructor for Staff class */
  public Staff() {
    super();
    m_title = "";
    m_building = "";
  }
  /**
  * Creates a staff member based their name, age, address, phone number, ID, starting year at Chapman, title, and building
  * @param name The staff members's name
  * @param age The staff member's age
  * @param address The staff member's address
  * @param phoneNumber The staff member's phone number
  * @param id The staff member's ID
  * @param startingYear The staff member's starting year at Chapman
  * @param title The staff member's title
  * @param building The staff member's building
  */
  public Staff(String name, int age, String address, long phoneNumber, int id, int startingYear, String title, String building) {
    super(name, age, address, phoneNumber, id, startingYear);
    m_title = title;
    m_building = building;
  }
  /**
  * Mutator for title attribute
  * @param title The staff member's title
  */
  public void setTitle(String title) {
    m_title = title;
  }
  /**
  * Mutator for building attribute
  * @param building The staff member's building
  */
  public void setBuilding(String building) {
    m_building = building;
  }
  /**
  * Accessor for title attribute
  * @return A String representing the staff member's title
  */
  public String getTitle() {
    return m_title;
  }
  /**
  * Accessor for building attribute
  * @return A String representing the staff member's building
  */
  public String getBuilding() {
    return m_building;
  }
  /**
  * The print method prints all information associated with an instance of the Staff class
  */
  public void print() {
    super.print();
    System.out.println("Title: " + m_title);
    System.out.println("Building: " + m_building);
  }
  /**
  * The getInput method prompts the user for data to store as class attributes
  * @param sin A Scanner used to retrieve user input
  */
  public void getInput(Scanner sin) {
    super.getInput(sin);
    System.out.println("Enter the title:");
    this.setTitle(sin.nextLine());
    System.out.println("Enter the building:");
    this.setBuilding(sin.nextLine());
  }
  /**
  * The toString method allows for pretty printing of an instance of the Staff class
  * @return a String representing all the information held by an instance of the Staff class
  */
  public String toString() {
    String s = super.toString();
    s += m_building + ",";
    s += m_title + ",";
    return s;
  }
}
