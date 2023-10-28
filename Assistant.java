/**
* The Assistant class contains information about an assistant professor at Chapman University
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
public class Assistant extends Faculty {
  /** An int representing the assistant professor's years until becoming a tenured faculty member */
  private int m_yearsUntilTenure;
  /** The default constructor for the Assistant professor class */
  public Assistant() {
    super();
    m_yearsUntilTenure = 0;
  }
  /**
  * Creates an assistant professor based their name, age, address, phone number, ID, starting year at Chapman, department, salary, number of papers published, and years until tenure
  * @param name The assistant professors's name
  * @param age The assistant professor's age
  * @param address The assistant professor's address
  * @param phoneNumber The assistant professor's phone number
  * @param id The assistant professor's ID
  * @param startingYear The assistant professor's starting year at Chapman
  * @param department The assistant professor's department
  * @param salary The assistant professor's yearly salary
  * @param numPapers The number of papers the assistant professor has published
  * @param yearsUntilTenure The assistant professor's number of years until becoming a tenured faculty member
  */
  public Assistant(String name, int age, String address, long phoneNumber, int id, int startingYear, String department, double salary, int numPapers, int yearsUntilTenure) {
    super(name, age, address, phoneNumber, id, startingYear, department, salary, numPapers);
    m_yearsUntilTenure = yearsUntilTenure;
  }
  /**
  * Mutator for number of years until tenure attribute
  * @param yearsUntilTenure The assistant professor's years until becoming a tenured faculty member
  */
  public void setYearsUntilTenure(int yearsUntilTenure) {
    m_yearsUntilTenure = yearsUntilTenure;
  }
  /**
  * Accessor for number of years until tenure attribute
  * @return An int representing the assistant professor's years until becoming a tenured faculty member
  */
  public int getYearsUntilTenure() {
    return m_yearsUntilTenure;
  }
  /**
  * The print method prints all information associated with an instance of the Assistant class
  */
  public void print() {
    super.print();
    System.out.println("Years Until Tenure: " + m_yearsUntilTenure);
  }
  /**
  * The getInput method prompts the user for data to store as class attributes
  * @param sin A Scanner used to retrieve user input
  */
  public void getInput(Scanner sin) {
    super.getInput(sin);
    System.out.println("Enter the amount of years until tenure:");
    this.setYearsUntilTenure(sin.nextInt());
    sin.nextLine();
  }
  /**
  * The toString method allows for pretty printing of an instance of the Assistant class
  * @return a String representing all the information held by an instance of the Assistant class
  */
  public String toString() {
    String s = "Assistant,";
    s += super.toString();
    s += m_yearsUntilTenure + "\n";
    return s;
  }
}
