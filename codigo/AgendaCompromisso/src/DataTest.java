

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataTest {
	
	@Test
	public void testCriaData() {
		Data data = new Data(1,2);
		assertEquals(1 , data.obterDia());
		assertEquals(2 , data.obterMes());
	}
	
	@Test
	public void testCriaData2() {
		Data data = new Data(1,2,2010);
		assertEquals(1 , data.obterDia());
		assertEquals(2 , data.obterMes());
		assertEquals(2010 , data.getAno());
	}
	
	@Test
	public void testFormatoData() {
		Data data = new Data(1,1,2022);
		assertEquals("01/01/2022" , data.dataFormatada());		
	}
	
	@Test 
	public void testDetectaMesInvalido() {
		Data data = new Data(1,13,2022);
		assertFalse(data.dataValida());
	}
	
	@Test
	public void testDetectaAnoInvalido() {
		Data data = new Data(1,2,1870);
		assertFalse(data.dataValida());
		
		
	}
	
	@Test
	public void testAnoAtual() {
		Data data = new Data(1,1);
		assertEquals(2022 , data.getAno());
	}
	
	@Test
	public void testDetectaBissexto() {
		Data data = new Data(1,1,2000);
		assertTrue(data.anoBissexto());
	}

}
