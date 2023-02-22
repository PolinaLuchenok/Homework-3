package collections;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;

import parser.XMLParser;

public class ParserTest {
	
	private XMLParser parser;
	
	@Test
	public void testCheck0() {
		parser = new XMLParser("src/test/resources/xml/xml.xml");
		parser.parseDocument();
	    assertTrue(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck1() {
		parser = new XMLParser("src/test/resources/xml/xml1.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Document should start from root tag or instruction. ");
	}
	
	@Test
	public void testCheck2() {
		parser = new XMLParser("src/test/resources/xml/xml2.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Instruction tag is not closed");
	}
	
	@Test
	public void testCheck3() {
		parser = new XMLParser("src/test/resources/xml/xml3.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Document should start from root tag or instruction. ");
	}
	
	@Test
	public void testCheck4() { //bag report ID 1
		parser = new XMLParser("src/test/resources/xml/xml4.xml");
		parser.parseDocument();
	    assertFalse(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck5() {
		parser = new XMLParser("src/test/resources/xml/xml5.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Instruction tag is not closed");
	}
	
	@Test
	public void testCheck6() { //bag report ID 2
		parser = new XMLParser("src/test/resources/xml/xml6.xml");
		parser.parseDocument();
	    assertFalse(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck7() {
		parser = new XMLParser("src/test/resources/xml/xml7.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Instruction tag is not closed");
	}
	
	@Test
	public void testCheck8() {
		parser = new XMLParser("src/test/resources/xml/xml8.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Document should start from root tag or instruction. ");
	}
	
	@Test
	public void testCheck9() {
		parser = new XMLParser("src/test/resources/xml/xml9.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Document should start from root tag or instruction. ");
	}
	
	@Test
	public void testCheck10() { //bag report ID 3
		parser = new XMLParser("src/test/resources/xml/xml10.xml");
		parser.parseDocument();
	    assertFalse(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck11() { //bag report ID 4
		parser = new XMLParser("src/test/resources/xml/xml11.xml");
		parser.parseDocument();
	    assertFalse(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck12() {
		parser = new XMLParser("src/test/resources/xml/xml12.xml");
		parser.parseDocument();
	    assertTrue(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck13() { //bag report ID 5
		parser = new XMLParser("src/test/resources/xml/xml13.xml");
		parser.parseDocument();
	    assertFalse(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck14() { //bag report ID 6
		parser = new XMLParser("src/test/resources/xml/xml14.xml");
		parser.parseDocument();
	    assertFalse(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck15() { //bag report ID 7
		parser = new XMLParser("src/test/resources/xml/xml15.xml");
		parser.parseDocument();
	    assertFalse(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck16() { //bag report ID 8
		parser = new XMLParser("src/test/resources/xml/xml16.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Unexpected closing tag Address");
	}
	
	@Test
	public void testCheck17() { //bag report ID 9
		parser = new XMLParser("src/test/resources/xml/xml17.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Unexpected closing tag Name");
	}
	
	@Test
	public void testCheck18() { //bag report ID 10
		parser = new XMLParser("src/test/resources/xml/xml18.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Unexpected closing tag Name");
	}
	
	@Test
	public void testCheck19() { //bag report ID 11
		parser = new XMLParser("src/test/resources/xml/xml19.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Unexpected closing tag PurchaseOrder");
	}
	
	@Test
	public void testCheck20() { //bag report ID 12
		parser = new XMLParser("src/test/resources/xml/xml20.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Unexpected opening tag DeliveryNotes");
	}
	
	@Test
	public void testCheck21() { //bag report ID 13
		parser = new XMLParser("src/test/resources/xml/xml21.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Unexpected closing tag PurchaseOrder");
	}
	
	@Test
	public void testCheck22() { //bag report ID 14
		parser = new XMLParser("src/test/resources/xml/xml22.xml");
		parser.parseDocument();
	    assertFalse(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck23() { //bag report ID 15
		parser = new XMLParser("src/test/resources/xml/xml23.xml");
		parser.parseDocument();
	    assertFalse(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck24() { //bag report ID 16
		parser = new XMLParser("src/test/resources/xml/xml24.xml");
		parser.parseDocument();
	    assertFalse(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck25() {
		parser = new XMLParser("src/test/resources/xml/xml25.xml");
		parser.parseDocument();
	    assertTrue(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck26() { //bag report ID 17
		parser = new XMLParser("src/test/resources/xml/xml26.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Missing space in self-closing tag");
	}
	
	@Test
	public void testCheck27() { //bag report ID 18
		parser = new XMLParser("src/test/resources/xml/xml27.xml");
		parser.parseDocument();
	    assertFalse(parser.getErrors().isEmpty());
	}
	
	@Test
	public void testCheck28() { //bag report ID 19
		assertThrows(FileNotFoundException.class, () -> new XMLParser("xml/xm.xml"));
	}
	
	@Test
	public void testCheck29() { //bag report ID 20
		parser = new XMLParser("src/test/resources/xml/xml29.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "All data should be inside of the root tag");
	}
	
	@Test
	public void testCheck30() {
		parser = new XMLParser("src/test/resources/xml/xml30.xml");
		parser.parseDocument();
		assertEquals(parser.getErrors().iterator().next(), "Tag PurchaseOrder name never closed. Tag names must have format <name>.");
	}
}
