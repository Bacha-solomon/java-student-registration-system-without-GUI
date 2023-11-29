import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String firstName;
    private String secondName;
    private String gender;
    private String id;
    private int age;
    private String country;
    private String region;
    private String birthDate;
    private String phoneNumber;
    private String emailAddress;

    public Student(String firstName, String secondName,String gender, String id, int age, String country, String region, String birthDate,
                   String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.country = country;
        this.region = region;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getfirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getGender(){
        return gender;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

class StudentRegistrationSystem {
    private List<Student> students;

    public StudentRegistrationSystem() {
        students = new ArrayList<>();
    }

    public void registerStudent(Student student) {
        students.add(student);
        System.out.println("  Your information has been registered successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("----------OOPS!---------");
            System.out.println("No students registered.");
            System.out.println("                          ");
        } else {
            System.out.println("Registered students:");
            for (Student student : students) {
                System.out.println("First Name: " + student.getfirstName());
                System.out.println("Second Name: " + student.getSecondName());
                System.out.println("Gender: " + student.getGender());
                System.out.println("ID: " + student.getId());
                System.out.println("Age: " + student.getAge());
                System.out.println("Country: " + student.getCountry());
                System.out.println("Region: " + student.getRegion());
                System.out.println("Birth Date: " + student.getBirthDate());
                System.out.println("Phone Number: " + student.getPhoneNumber());
                System.out.println("Email Address: " + student.getEmailAddress());
                System.out.println("------------------------------------------------");
                System.out.println("_________________________________________________");
            }
        }
    }

    public List<Student> searchStudentsByName(String id) {
        List<Student> searchResults = new ArrayList<>();

        for (Student student : students) {
            if (student.getId().equalsIgnoreCase(id)) {
                searchResults.add(student);
            }
        }

        return searchResults;
    }
}



