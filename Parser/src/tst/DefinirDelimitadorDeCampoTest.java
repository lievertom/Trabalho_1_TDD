package tst;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import app.Parser;
import exc.DelimitadorInvalidoException;

public class DefinirDelimitadorDeCampoTest {

	private Parser parser;

	@Before
	public void setup() {
		parser = new Parser();
	}
	
	
	@Test
	public void testDefinirDelimitadorDeCampo() throws DelimitadorInvalidoException {
		parser.setDelimiter(";");
		assertEquals(';', parser.getDelimiter());
	}
	
	@Test(expected=DelimitadorInvalidoException.class)
	public void testDelimitadorInvalidoException() throws DelimitadorInvalidoException {
		parser.setDelimiter("test");
	}
}
