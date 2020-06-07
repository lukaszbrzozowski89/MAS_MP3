/*
 * Copyright (c) Łukasz Brzozowski s17174 @ PJATK
 */

public abstract class Person extends ObjectPlusPlus {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract double getSalary();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }


}
