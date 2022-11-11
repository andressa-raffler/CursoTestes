package com.teste;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertJTest {


    @Test
    public void checkEquality() {
        Person person= new Person("Barrack", "Obama");
        Person personClone = new Person("Barrack", "Obama");
        assertThat(person).isEqualTo(personClone);
    }
}
