/**
 * ================================= MINI EXERCISE 2
 * In the `jsp-mini-exercises`, add the following:
 * 1. Create a Person class with private properties for id, firstName, lastName, and age (add constructor / getters and setters) - done
 * 2. Create a jsp, `person-list.jsp` that defines a list of 3 people and displays them in a table of information using JSTL
 * 3. Create an external stylesheet and change the background color of the page
 * 4. Create a separate fragment, `display-extra-person.jsp` that defines a single person object and displays the information in an unordered list
 * 5. Include the `display-extra-person.jsp` under the table of person objects
 * BONUS: when a query string value of hide is present, the table of person objects should not be rendered
 * */

public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private int age;

    public Person(String id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
