package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    protected int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException, IllegalArgumentException {
        if (surname == null) {
            throw new IllegalStateException("Необходимо заполнить обязательные поля для объекта: имя, фамилия");
        }
        if (age < 0 || age > 123) {
            throw new IllegalArgumentException("Возраст указан некорректно");
        }
        return new Person(name, surname, age, address);
    }
}