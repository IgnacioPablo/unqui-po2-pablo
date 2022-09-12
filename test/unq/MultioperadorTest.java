package unq;
import ar.edu.unq.po2.tp3.Multioperador;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {
   private Multioperador multi;
	@BeforeEach
	void setUp() throws Exception {
		multi = new Multioperador();
		multi.addNum(3);
		multi.addNum(7);
		multi.addNum(9);
	}

	@Test
	void testSuma() {
		int suma = multi.sumarNums();
		assertEquals(19,suma);
	}
	@Test
	void testResta() {
		int resta = multi.restarNums();
		assertEquals(-19,resta);
	}
	@Test
	void testMulti() {
		int mult = multi.multiplicarNums();
		assertEquals(189, mult);
	}

}
