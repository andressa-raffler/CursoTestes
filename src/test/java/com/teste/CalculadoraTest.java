package com.teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+3");
		assertEquals(5,soma);
	}

	@Test
	public void testeSomarComMock(){
		Calculadora calculadora = mock(Calculadora.class); //ao invés de instanciar a calculadora, chamamos o mock
		when(calculadora.somar("1+2")).thenReturn(10); //mock "finge" que bateu na calsse calculadora e retorna o resultado que for imposto
		int somaComMock = calculadora.somar("1+2");
		assertEquals(10,somaComMock);

	}
}
