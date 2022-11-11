package com.teste;

import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;

public class MatcherTest {
    @Test
    public void givenBean_checkToString(){
        Person person=new Person("Barrack", "Obama");
        String str=person.toString();
        assertThat(person, HasToString.hasToString(str));
    }

    @Test
    public void givenBean_checkPropertyExists() {
        Person person=new Person("Barrack", "Obama");
        assertThat(person, HasProperty.hasProperty("name"));
    }

}
