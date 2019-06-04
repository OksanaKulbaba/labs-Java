package SimpelTastLab2;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void toJSON() {
        Person person = new Person(Sex.MALE, "AAA", 4);

        Person person2 = new Person(Sex.MALE, "AAA", 2 );


        Gson gson = new Gson();
        Person person1 =gson.fromJson(person.toJSON(), Person.class);
        //Person person3 =gson.fromJson(person2.toJSON(), Person.class);

        assertEquals(person,person1);
        //assertEquals(person,person3);
        assertNotEquals(person,person2);



    }
    @Test
    void equals(){

        Person person = new Person(Sex.MALE, "AAA", 4);
        Person person1 = new Person(Sex.MALE, "AAA", 4);
        Person person2 = new Person(Sex.MALE, "AAA", 2 );

        assertEquals(person, person1);
        assertNotEquals(person1, person2);


    }



}