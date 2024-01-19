import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Employee ernar = new Employee("Ernar", "Khanapin", "Python Developer", 27045.78);
        Employee dima = new Employee("Dmitry", "Kairgeldin", "front-end Developer", 50000.00);

        Student danik = new Student("Daniyal", "Ibrayev", 3.5);
        Student mirok = new Student("Mirzhan", "Sayat", 4.0);

        Person ayanat = new Person("Ayanat", "Zhunis");

        people.add(ayanat);
        people.add(ernar);
        people.add(dima);
        people.add(mirok);
        people.add(danik);

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.getPosition() + ": " + person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}