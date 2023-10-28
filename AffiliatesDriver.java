/**
* The AffiliatesDriver class creates and runs a simulation of an affiliate record at Chapman University
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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Collections;
import java.io.*;
public class AffiliatesDriver {
  /**
  * The printOptions method prints out all the possible user input options for working with an affiliate record
  */
  public static void printOptions() {
    System.out.println("Enter 1 to create an affiliate record.");
    System.out.println("Enter 2 to print information for an affiliate from their ID.");
    System.out.println("Enter 3 to list all affiliates in order of seniority.");
    System.out.println("Enter 4 to delete a record from their ID.");
    System.out.println("Enter 5 to save the database to a file.");
    System.out.println("Enter 6 to restore the database from a file.");
    System.out.println("Enter 7 to exit.");
  }
  /**
  * The chooseOption method calls methods for functionality of the corresponding user-entered number
  * @param userNum An int representing the number that the user entered as input
  */
  public static void chooseOption(int userNum, HashMap<Integer, Affiliate> database) {
    Scanner sin = new Scanner(System.in);
    switch (userNum) {
      case 1:
        database = createRecord(database, sin);
        break;
      case 2:
        printAffiliate(database, sin);
        break;
      case 3:
        printSorted(database);
        break;
      case 4:
        database = deleteRecord(database, sin);
        break;
      case 5:
        saveToFile(database, sin);
        break;
      case 6:
        database = restoreFile(database, sin);
        break;
      case 7:
        break;
      default:
        System.out.println("That input is not valid.");
    }
  }
  /**
  * The createRecord method creates a record of an affiliate at Chapman
  * @param sin The scanner used to retrieve user input
  * @return an HashMap of Integers and Affiliates representing the database that the new affiliate will get added onto
  */
  public static HashMap<Integer, Affiliate> createRecord(HashMap<Integer, Affiliate> userData, Scanner sin) {
    System.out.println("Enter the type of the affiliate you want to create (Faculty, Student, or Staff):");
    String className = sin.nextLine();
    if (className.toLowerCase().equals("faculty")) {
      System.out.println("Enter the type of the Faculty you want to create (Assistant, Associate, or Full):");
      String facultyType = sin.nextLine();
      if (facultyType.toLowerCase().equals("assistant")) {
        Assistant userAssistant = new Assistant();
        userAssistant.getInput(sin);
        userData.put(userAssistant.getID(), userAssistant);
      }
      else if (facultyType.toLowerCase().equals("associate")) {
        Associate userAssociate = new Associate();
        userAssociate.getInput(sin);
        userData.put(userAssociate.getID(), userAssociate);
      }
      else if (facultyType.toLowerCase().equals("full")) {
        Full userFull = new Full();
        userFull.getInput(sin);
        userData.put(userFull.getID(), userFull);
      }
      else {
        System.out.println("That input is not valid.");
      }
    }
    else if (className.toLowerCase().equals("student")) {
      System.out.println("Enter the type of the Student you want to create (Graduate or Undergrad):");
      String studentType = sin.nextLine();
      if (studentType.toLowerCase().equals("graduate")) {
        Graduate userGraduate = new Graduate();
        userGraduate.getInput(sin);
        userData.put(userGraduate.getID(), userGraduate);
      }
      else if (studentType.toLowerCase().equals("undergrad")) {
        Undergrad userUndergrad = new Undergrad();
        userUndergrad.getInput(sin);
        userData.put(userUndergrad.getID(), userUndergrad);
        }
      else {
        System.out.println("That input is not valid.");
      }
    }
    else if (className.toLowerCase().equals("staff")) {
      System.out.println("Enter the type of the Staff you want to create (FullTime or PartTime):");
      String staffType = sin.nextLine();
      if (staffType.toLowerCase().equals("fulltime")) {
        FullTime userFullTime = new FullTime();
        userFullTime.getInput(sin);
        userData.put(userFullTime.getID(), userFullTime);
      }
      else if (staffType.toLowerCase().equals("parttime")) {
        PartTime userPartTime = new PartTime();
        userPartTime.getInput(sin);
        userData.put(userPartTime.getID(), userPartTime);
        }
      else {
        System.out.println("That input is not valid.");
      }
    }
    else {
      System.out.println("That input is not valid.");
    }
    return userData;
  }
  /**
  * The printAffiliate method prints out information about an affiliate given their ID
  * @param userData A HashMap of Integers and Affiliates representing the database from which the affiliate record to print is accessable
  * @param sin A Scanner used to retrieve user input
  */
  public static void printAffiliate(HashMap<Integer, Affiliate> userData, Scanner sin) {
    System.out.println("Enter the ID of the affiliate you want to print:");
    int userID = sin.nextInt();
    if (userData.containsKey(userID)) {
      userData.get(userID).print();
      System.out.println();
    }
    else {
      System.out.println("That is not a valid ID.");
    }
  }
  /**
  * The printSorted method prints out all the affiliate records in the database sorted by seniority
  * @param userData The database to print affiliates from
  */
  public static void printSorted(HashMap<Integer, Affiliate> userData) {
    LinkedList<Affiliate> affiliates = new LinkedList<Affiliate>();
    for (int key: userData.keySet()) {
      affiliates.add(userData.get(key));
    }
    Collections.sort(affiliates);
    for (Affiliate aff: affiliates) {
      aff.print();
      System.out.println();
    }
  }
  /**
  * The deleteRecord method removes an affiliate record from the database by the given ID
  * @param userData A HashMap of Integers and Affiliates representing the database from which the record will be removed
  * @param sin A Scanner used to retrieve user input
  * @return an HashMap of Integers and Affiliates representing the database that the affiliate will get deleted from
  */
  public static HashMap<Integer, Affiliate> deleteRecord(HashMap<Integer, Affiliate> userData, Scanner sin) {
    System.out.println("Enter the ID of the affiliate you want to remove:");
    int removeID = sin.nextInt();
    if (userData.containsKey(removeID)) {
      userData.remove(removeID);
    }
    else {
      System.out.println("That is not a valid ID.");
    }
    return userData;
  }
  /**
  * The saveToFile method allows the user to save their database to a file with the name of their choice
  * @param userData A HashMap of Integers and Affiliates representing the database that will be written to a file
  * @param sin A Scanner used to retrieve user input
  */
  public static void saveToFile(HashMap<Integer, Affiliate> userData, Scanner sin) {
    System.out.println("Enter the name of the file you want to save the database to:");
    String fileName = sin.next();
    PrintWriter pw = null;
    try {
      pw = new PrintWriter(new FileWriter(fileName));
      for (Integer i: userData.keySet()) {
        pw.print(userData.get(i).toString());
      }
    }
    catch (IOException e) {
      System.err.println("Error outputting to file.");
      }
    finally {
      if (!(pw.equals(null))) {
        pw.close();
      }
    }
  }
  /**
  * The restoreFile method adds affiliate records to the current database given a file holding those records
  * @param userData A HashMap of Integers and Affiliates representing the database that the file's records will be added onto
  * @param sin A Scanner used to retrieve user input
  * @return an HashMap of Integers and Affiliates representing the database that the file's affiliates will get added onto
  */
  public static HashMap<Integer, Affiliate> restoreFile(HashMap<Integer, Affiliate> userData, Scanner sin) {
    System.out.println("Enter the name of a file to restore:");
    String fileName = sin.next();
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(fileName));
      String line = "";
      String[] lineInfo = new String[11];
      while ((line = br.readLine()) != null) {
        lineInfo = line.split(",");
        if (lineInfo[0].equals("Assistant")) {
          Assistant fileAssistant = new Assistant(lineInfo[4], Integer.parseInt(lineInfo[2]), lineInfo[1], Long.parseLong(lineInfo[5]), Integer.parseInt(lineInfo[3]), Integer.parseInt(lineInfo[6]), lineInfo[7], Double.parseDouble(lineInfo[9]), Integer.parseInt(lineInfo[8]), Integer.parseInt(lineInfo[10]));
          userData.put(fileAssistant.getID(), fileAssistant);
        }
        else if (lineInfo[0].equals("Associate")) {
          Associate fileAssociate = new Associate(lineInfo[4], Integer.parseInt(lineInfo[2]), lineInfo[1], Long.parseLong(lineInfo[5]), Integer.parseInt(lineInfo[3]), Integer.parseInt(lineInfo[6]), lineInfo[7], Double.parseDouble(lineInfo[9]), Integer.parseInt(lineInfo[8]), Integer.parseInt(lineInfo[10]));
          userData.put(fileAssociate.getID(), fileAssociate);
        }
        else if (lineInfo[0].equals("Full")) {
          Full fileFull = new Full(lineInfo[4], Integer.parseInt(lineInfo[2]), lineInfo[1], Long.parseLong(lineInfo[5]), Integer.parseInt(lineInfo[3]), Integer.parseInt(lineInfo[6]), lineInfo[7], Double.parseDouble(lineInfo[9]), Integer.parseInt(lineInfo[8]), Integer.parseInt(lineInfo[10]));
          userData.put(fileFull.getID(), fileFull);
        }
        else if (lineInfo[0].equals("Graduate")) {
          Graduate fileGraduate = new Graduate(lineInfo[4], Integer.parseInt(lineInfo[2]), lineInfo[1], Long.parseLong(lineInfo[5]), Integer.parseInt(lineInfo[3]), Integer.parseInt(lineInfo[6]), lineInfo[8], lineInfo[9], lineInfo[7], Integer.parseInt(lineInfo[11]), Integer.parseInt(lineInfo[10]));
          userData.put(fileGraduate.getID(), fileGraduate);
        }
        else if (lineInfo[0].equals("Undergrad")) {
        Undergrad fileUndergrad = new Undergrad(lineInfo[4], Integer.parseInt(lineInfo[2]), lineInfo[1], Long.parseLong(lineInfo[5]), Integer.parseInt(lineInfo[3]), Integer.parseInt(lineInfo[6]), lineInfo[8], lineInfo[9], lineInfo[7], Integer.parseInt(lineInfo[10]), Double.parseDouble(lineInfo[11]));
        userData.put(fileUndergrad.getID(), fileUndergrad);
        }
        else if (lineInfo[0].equals("FullTime")) {
          FullTime fileFullTime = new FullTime(lineInfo[4], Integer.parseInt(lineInfo[2]), lineInfo[1], Long.parseLong(lineInfo[5]), Integer.parseInt(lineInfo[3]), Integer.parseInt(lineInfo[6]), lineInfo[8], lineInfo[7], Double.parseDouble(lineInfo[9]));
          userData.put(fileFullTime.getID(), fileFullTime);
        }
        else if (lineInfo[0].equals("PartTime")) {
          PartTime filePartTime = new PartTime(lineInfo[4], Integer.parseInt(lineInfo[2]), lineInfo[1], Long.parseLong(lineInfo[5]), Integer.parseInt(lineInfo[3]), Integer.parseInt(lineInfo[6]), lineInfo[8], lineInfo[7], Double.parseDouble(lineInfo[9]));
          userData.put(filePartTime.getID(), filePartTime);
        }
        else {
          System.out.println("Invalid Affiliate in file.");
        }
      }
    }
    catch (IOException e) {
      System.out.println("Error reading from file.");
    }
    finally {
      try {
        if (!(br.equals(null))) {
          br.close();
        }
      }
      catch (IOException e) {
        System.out.println("Error closing file.");
      }
    }
    return userData;
  }
  /**
  * The main method holds information to create a database of Chapman affiliates and calls methods for the user to interact with that database
  * @param args A string array representing command line parameters
  */
  public static void main(String[] args) {
    HashMap<Integer, Affiliate> userDatabase = new HashMap<Integer, Affiliate>();
    Scanner sin = new Scanner(System.in);
    printOptions();
    int userNum = sin.nextInt();
    while (userNum != 7) {
      chooseOption(userNum, userDatabase);
      printOptions();
      userNum = sin.nextInt();
    }
  }
}
