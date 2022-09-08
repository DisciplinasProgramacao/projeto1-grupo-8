

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class CompromissoTest {
	
	@Test
	public void testNomeCompromissoVazio(){
		Compromisso compromisso = new Compromisso();
		assertNull(compromisso.getNome());
	}
	
	@Test
	public void testDataCompromissoVazio(){
		Compromisso compromisso = new Compromisso();
		assertNull(compromisso.getData());
	}
	
	@Test
	public void testNomeCompromisso(){
	Data data = new Data(1 , 1 , 2022);
	Compromisso compromisso = new Compromisso("reuniao" , data);
	assertEquals("reuniao" , compromisso.getNome());
	}
	
	@Test
	public void testDataCompromisso(){
	Data data = new Data(1 , 1 , 2022);
	Compromisso compromisso = new Compromisso("reuniao" , data);
	assertEquals(data , compromisso.getData());
	}
}
