package employeeEnumIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
    List<Person> people;

    public Employee() {
        this.people = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.people.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> iterator = this.people.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        while(iterator.hasNext()) {
            Person employee = iterator.next();
            if (employee.getEducation() == Education.PHD) {
                System.out.println(employee);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        while(iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}


//Make a method public void fire(Education education) for the Employees class.
//The method removes all employees whose education matches the education
//given as parameter from the employees list.
//        NB: Implement the method using an iterator!