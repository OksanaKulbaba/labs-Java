package SimpelTastLab2;

import com.google.gson.Gson;

import java.util.Objects;

public class Person {
    private Sex sex;
    private  String name;
    private int age;

    public Person(Sex sex, String name, int age) {
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                sex == person.sex &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sex, name, age);
    }

    public  String toJSON(){
        Gson gson  = new Gson();
        return  gson.toJson(this);

    }

}
