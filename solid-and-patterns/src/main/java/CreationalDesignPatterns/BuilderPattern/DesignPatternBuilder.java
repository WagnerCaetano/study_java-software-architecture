package DesignPatterns.BuilderPattern;


public class DesignPatternBuilder {

    public static void main(String[] args) {

        Person person = new Person.Builder("John", "john@mail.com").setAddress("123 Main St").setAge(25).build();
        System.out.println(person);
    }
}