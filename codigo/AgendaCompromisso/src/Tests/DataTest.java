package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataTest {
	

	@Test
	public void testFormatoData() {
		Data data = new Data(1,1);
		assertEquals("01/01/2022" , data.dataFormatada());		
	}
	
	@Test 
	public void testDetectaMesInvalido() {
		Data data = new Data(1,13);
		assertFalse(data.dataValida());
	}

}
