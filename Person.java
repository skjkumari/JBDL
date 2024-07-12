package org.example;
    public class Person implements Comparable<Person> {
        private int id;
        private String name;
        private double salary;
        private int age;

        public Person(int id, String name, double salary, int age) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.age = age;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // Implementing compareTo method for Comparable interface
        @Override
        public int compareTo(Person other) {
            // First compare by name
            int nameComparison = this.name.compareTo(other.name);
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                // If names are the same, compare by salary
                return Double.compare(this.salary, other.salary);
            }
        }

        // toString method for easy printing
        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    '}';
        }
    }
