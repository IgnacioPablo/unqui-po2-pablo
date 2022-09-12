package unq;
import ar.edu.unq.po2.tp3.Counter;




import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	 private Counter counter;

	@BeforeEach
	void setUp() throws Exception {
		 counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	@Test
	public void numerosPares() {
	    int pares = counter.cantPares();
	    assertEquals(1,pares);
	}
	
	@Test
	public void numerosImpares() {
		int impares = counter.cantImpares();
		assertEquals(9,impares);
	}
    
	@Test
	public void multiplosDe() {
		int multiplos = counter.cantMultiplos(3);
		assertEquals(2,multiplos);
	}
}
