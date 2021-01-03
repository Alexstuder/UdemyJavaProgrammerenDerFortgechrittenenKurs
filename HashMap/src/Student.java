public class Student {

    private String firstName;
    private String LastName;
    private int matrikelNr;

    public Student(String firstName, String lsstName, int matrikelNr) {
        this.firstName = firstName;
        LastName = lsstName;
        this.matrikelNr = matrikelNr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", matrikelNr=" + matrikelNr +
                '}' +"\n";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(int matrikelNr) {
        this.matrikelNr = matrikelNr;
    }
}
