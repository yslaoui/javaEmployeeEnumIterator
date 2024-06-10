package employeeEnumIterator;

public class Person {
    String name;
    Education education;

    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    public Education getEducation() {
        return this.education;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.education;
    }
}
