public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person: " + name + " Age: " + age + " Years";
    }

    public boolean compareIgnoreCase(String anotherString) {
        return name.equalsIgnoreCase(anotherString);
    }

    public static void main(String[] args) {
        Human personObject = new Human("William", 17);
        System.out.println(personObject.toString());

        String comparisonString = "William";
        boolean isEqual = personObject.compareIgnoreCase(comparisonString);

        if (isEqual) {
            System.out.println("Name of the Person is equal to the comparison string (case-insensitive).");
        } else {
            System.out.println("Name of the Person is not equal to the comparison string (case-insensitive).");
        }
    }
}