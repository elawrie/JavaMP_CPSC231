/**
* The Affiliate abstract class contains basic information about a generic Chapman affiliate
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
public abstract class Affiliate implements Comparable<Affiliate>, Printable {
  /** A String representing the affiliate's name */
  protected String m_name;
  /** An int representing the affiliate's age */
  protected int m_age;
  /** A String representing the affiliate's address */
  protected String m_address;
  /** A long representing the affiliate's phone number */
  protected long m_phoneNumber;
  /** An int representing the affiliate's ID */
  protected int m_id;
  /** An int representing the affiliate's starting year at Chapman */
  protected int m_startingYear;
  /** The default constructor for the Affiliate class */
  public Affiliate() {
    m_name = "";
    m_age = 0;
    m_address = "";
    m_phoneNumber = 0l;
    m_id = 0;
    m_startingYear = 0;
  }
  /**
  * Creates an affiliate based their name, age, address, phone number, ID, and starting year at Chapman
  * @param name The affiliate's name
  * @param age The affiliate's age
  * @param address The affiliate's address
  * @param phoneNumber The affiliate's phone number
  * @param id The affiliate's ID
  * @param startingYear The affiliate's starting year at Chapman
  */
  public Affiliate(String name, int age, String address, long phoneNumber, int id, int startingYear) {
    m_name = name;
    m_age = age;
    m_address = address;
    m_phoneNumber = phoneNumber;
    m_id = id;
    m_startingYear = startingYear;
  }
  /**
  * Mutator for name attribute
  * @param name The affiliate's name
  */
  public void setName(String name) {
    m_name = name;
  }
  /**
  * Mutator for age attribute
  * @param age The affiliate's age
  */
  public void setAge(int age) {
    m_age = age;
  }
  /**
  * Mutator for address attribute
  * @param address The affiliate's address
  */
  public void setAddress(String address) {
    m_address = address;
  }
  /**
  * Mutator for phone number attribute
  * @param phoneNumber The affiliate's phone number
  */
  public void setPhoneNumber(long phoneNumber) {
    m_phoneNumber = phoneNumber;
  }
  /**
  * Mutator for ID attribute
  * @param id The affiliate's ID
  */
  public void setID(int id) {
    m_id = id;
  }
  /**
  * Mutator for starting year attribute
  * @param startingYear The affiliate's starting year at Chapman
  */
  public void setStartingYear(int startingYear) {
    m_startingYear = startingYear;
  }
  /**
  * Accessor for name attribute
  * @return A String representing the affiliate's name
  */
  public String getName() {
    return m_name;
  }
  /**
  * Accessor for age attribute
  * @return An int representing the affiliate's age
  */
  public int getAge() {
    return m_age;
  }
  /**
  * Accessor for address attribute
  * @return A String representing the affiliate's address
  */
  public String getAddress() {
    return m_address;
  }
  /**
  * Accessor for phone number attribute
  * @return A long representing the affiliate's phone number
  */
  public long getPhoneNumber() {
    return m_phoneNumber;
  }
  /**
  * Accessor for ID attribute
  * @return An int representing the affiliate's ID
  */
  public int getID() {
    return m_id;
  }
  /**
  * Accessor for starting year attribute
  * @return An int representing the affiliate's starting year at Chapman
  */
  public int getStartingYear() {
    return m_startingYear;
  }
  /**
  * The compareTo method allows us to compare two instances of the Affiliate class
  * @param a An Affiliate object that we are comparing the current Affiliate object to
  * @return an int representing the result of the comparison (-1, 0, or 1)
  */
  public int compareTo(Affiliate a) {
    int r = 0;
    if (this.m_startingYear > a.m_startingYear) {
      r = 1;
    }
    else if (this.m_startingYear < a.m_startingYear) {
      r = -1;
    }
    return r;
  }
  /**
  * The print method prints all information associated with an instance of the Affiliate class
  */
  public void print() {
    System.out.println("Name: " + m_name);
    System.out.println("Age: " + m_age);
    System.out.println("Address: " + m_address);
    System.out.println("Phone Number: " + m_phoneNumber);
    System.out.println("ID: " + m_id);
    System.out.println("Starting Year at Chapman: " + m_startingYear);
  }
  /**
  * The getInput method prompts the user for data to store as class attributes
  * @param sin A Scanner used to retrieve user input
  */
  public void getInput(Scanner sin) {
    System.out.println("Enter the name:");
    this.setName(sin.nextLine());
    System.out.println("Enter the age:");
    this.setAge(sin.nextInt());
    sin.nextLine();
    System.out.println("Enter the address:");
    this.setAddress(sin.nextLine());
    System.out.println("Enter the phone number:");
    this.setPhoneNumber(sin.nextLong());
    sin.nextLine();
    System.out.println("Enter the ID:");
    this.setID(sin.nextInt());
    sin.nextLine();
    System.out.println("Enter the starting year at Chapman: ");
    this.setStartingYear(sin.nextInt());
    sin.nextLine();
  }
  /**
  * The toString method allows for pretty printing of an instance of the Affiliate class
  * @return a String representing all the information held by an instance of the Affiliate class
  */
  public String toString() {
    String s = "";
    s += m_address + ",";
    s += m_age + ",";
    s += m_id + ",";
    s += m_name + ",";
    s += m_phoneNumber + ",";
    s += m_startingYear + ",";
    return s;
  }
}
