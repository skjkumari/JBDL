package org.example;
import java.util.ArrayList;
import java.util.Collections;
public class Test {
        public static void main(String[] args) {
            ArrayList<Person> persons = new ArrayList<>();
            persons.add(new Person(101, "Rahul", 50000.0, 30));
            persons.add(new Person(202, "Tarun", 60000.0, 28));
            persons.add(new Person(303, "Bhagat", 55000.0, 35));
            persons.add(new Person(404, "Alice", 45000.0, 32));
            Collections.sort(persons);
            for (int i = 0; i < persons.size(); i++) {
                System.out.println(persons.get(i));
            }
        }
    }
}
