package tst;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Parser;
import exc.DelimitadorInvalidoException;

@RunWith(Parameterized.class)
public class DefinirDelimitadorDeCampoParameterizedTest {

	private String delimiter;
	private char expectedDelimiter;
	
	public DefinirDelimitadorDeCampoParameterizedTest(String delimiter, char expectedDelimiter) {
		this.delimiter = delimiter;
		this.expectedDelimiter = expectedDelimiter;
	}
	
	@Parameters
	public static Iterable<Object[]> getParameters() {
		Object[][] dados = new Object[][] {
			{"\n", '\n'},
			{"\r", '\r'},
			{"\t", '\t'},
			{";" , ';'},
			{"," , ','},
			{"-" , '-'}
		};
		return Arrays.asList(dados);
	}
	
	@Test
	public void testDefinirDelimitadorDeCampo() throws DelimitadorInvalidoException {
		Parser parser = new Parser();
		parser.setDelimiter(delimiter);
		assertEquals(expectedDelimiter, parser.getDelimiter());
	}

}
