package homeworkweek7;

public class Program14Person {

    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Program14Person program14Person = new Program14Person();
        program14Person.setFirstName("");   // firstName is set to empty string
        program14Person.setLastName("");    // lastName is set to empty string
        program14Person.setAge(10);
        System.out.println("fullName= " + program14Person.getFullName());
        System.out.println("teen= " + program14Person.isTeen());
        program14Person.setFirstName("John");    // firstName is set to John
        program14Person.setAge(18);
        System.out.println("fullName= " + program14Person.getFullName());
        System.out.println("teen= " + program14Person.isTeen());
        program14Person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + program14Person.getFullName());
    }
}
