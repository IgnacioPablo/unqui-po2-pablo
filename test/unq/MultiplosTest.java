package unq;
import ar.edu.unq.po2.tp3.Multiplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplosTest {
     private Multiplos multiplo;
	@BeforeEach
	void setUp() throws Exception {
		multiplo = new Multiplos();
		multiplo.setX(3);
		multiplo.setY(9);
	}

	@Test
	void multiploMasAlto() {
		assertEquals(992,multiplo.maximoMultiploEntre(3,9));
	}

}
