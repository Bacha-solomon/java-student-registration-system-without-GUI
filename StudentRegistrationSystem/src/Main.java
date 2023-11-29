import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentRegistrationSystem registrationSystem = new StudentRegistrationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("                                                                     ");
            System.out.println("          WEL COME TO HARAMAYA UNIVERSITY                           " );
            System.out.println("           STUDENT REGISTERATION SYSTEM                               ");
            System.out.println("******                                                        *******");
            System.out.println("*********************************************************************");
            System.out.println("Please Enter the following key option: ");
            System.out.println("1. Register Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Students by ID number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter Your Frist name: ");
                        String firstName = scanner.nextLine();
                        System.out.print("Enter Your Second name: ");
                        String secondName = scanner.nextLine();
                        System.out.println("Enter your gender: ");
                        String gender = scanner.nextLine();
                        System.out.print("Enter your  ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter your age: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter student country: ");
                        String country = scanner.nextLine();
                        System.out.print("Enter student region: ");
                        String region = scanner.nextLine();
                        System.out.print("Enter student birth date: ");
                        String birthDate = scanner.nextLine();
                        System.out.print("Enter student phone number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("Enter student email address: ");
                        String emailAddress = scanner.nextLine();

                        Student student = new Student(firstName, secondName,gender,id, age, country, region, birthDate,
                                phoneNumber, emailAddress);
                        registrationSystem.registerStudent(student);
                        break;
                    case 2:
                        registrationSystem.displayStudents();
                        break;
                    case 3:
                        System.out.print("Enter student ID to search: ");
                        String searchId = scanner.nextLine();
                        List<Student> searchResults = registrationSystem.searchStudentsByName(searchId);
                        if (searchResults.isEmpty()) {
                            System.out.println("No students found with the given name.");
                        } else {
                            System.out.println("Search results for students with ID '" + searchId + "':");
                            for (Student result : searchResults) {
                                System.out.println("First Name: " + result.getfirstName());
                                System.out.println("Second Name: " + result.getSecondName());
                                System.out.println("ID: " + result.getId());
                                System.out.println("Age: " + result.getAge());
                                System.out.println("Country: " + result.getCountry());
                                System.out.println("Region: " + result.getRegion());
                                System.out.println("Birth Date: " + result.getBirthDate());
                                System.out.println("Phone Number: " + result.getPhoneNumber());
                                System.out.println("Email Address: " + result.getEmailAddress());
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("______________________________________________________________");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}

