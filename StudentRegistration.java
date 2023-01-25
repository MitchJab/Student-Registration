//Name: Jabari
//Date: Jan 19th
//App name: student regristration
//App desc: app that registers student info into variables and prints
import java.util.Scanner;

public class StudentRegistration 
{
    //Constants - aka final
    static final String SET_TITLE ="\033]0;%s\007";
    static final String Clear_Terminal ="\033c";
    //DocString
    //Multiline string
    static final String INPUT_BANNER = """
     _____________________________
    - WELCOME TO DURHAM COLLEGE -
    _____________________________
            """;

    static final String Output_Banner ="""
    _____________________________
    - Student Information -
    _____________________________        
    """;
    
    public static void main(String[] args)
    {
    
        //Variables
        String fullName;
        String courseName;
        int courseDuration;
        int currentSemester;
        int semestersToGraduate;
        //scanner needed to read input
        Scanner scanner = new Scanner(System.in);
        
        // Only use this fix if your title doesn't work
         try {
            new ProcessBuilder("cmd", "/c"). inheritIO().start().waitFor();
        } catch (Exception exception) {}
        
        //Set the title
        System.out.printf(SET_TITLE, "Student Registration - Jabari Mitchell");

        //Print banner
        System.out.print(INPUT_BANNER);
        
        //Ask for full name
   System.out.print("Enter your full name: ");
   fullName = scanner.nextLine(); //Get the whole line (get the whole name)

   // Ask for course name
  System.out.print("Enter your course name: ");
   courseName = scanner.nextLine();

   //Ask for course duration
   System.out.print("Enter your course duration: ");
   courseDuration = Integer.parseInt(scanner.nextLine());
    // Ask for current semester
    System.out.print("Enter your current semester: ");
    currentSemester = Integer.parseInt(scanner.nextLine());
    
    //Calculations
    semestersToGraduate = courseDuration - currentSemester;
    //=====================
    //Output screen
    //=====================
    // Clear the terminal and print banner
    System.out.println(Clear_Terminal + Output_Banner);
    //String concatenation
    System.out.println("Name: "+ fullName);
    System.out.println("Course Name: "+ courseName);
    // Formatted string
    System.out.printf("Course duration %s semesters\n", courseDuration);
    // current semester
    System.out.printf("Current semester %d\n", currentSemester);
    // semesters to graduate
    System.out.printf("you've got %s to go!\n", semestersToGraduate);

    //Exit prompt

    System.out.print("Press [enter] to exit: ");
    scanner.nextLine();
    scanner.close(); // This should be always the last thing
    }
}