package employeeEnumIterator;

public class Main {
    public static void main(String[] args) {
        Person anna = new Person("Anna", Education.PHD);
        System.out.println(anna);

        Employee employee = new Employee();
        employee.add(new Person("Anna", Education.PHD));
        employee.add(new Person("Charles", Education.MA));
        employee.add(new Person("Anita", Education.HS));
        employee.add(new Person("Charlotte", Education.PHD));

        System.out.println("Printing all employees");
        employee.print();

        System.out.println("Printing all employees with a given level of education");
        employee.print(Education.PHD);

        System.out.println("Removing all employees of a given education level");
        employee.fire(Education.PHD);
        employee.print();
    }

}
