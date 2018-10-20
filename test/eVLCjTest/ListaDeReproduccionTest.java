package eVLCjTest;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.junit.*;

import eVLCj.ListaDeReproduccion;

public class ListaDeReproduccionTest {

	private ListaDeReproduccion lr1;
	private ListaDeReproduccion lr2;
	int hola;
	private final File FIC_TEST1 = new File ("test\\res\\No del grupo.mp4");
	
	@Before
	public void setUp() throws Exception {
		
		lr1 = new ListaDeReproduccion();
		lr2 = new ListaDeReproduccion();
		lr2.add(FIC_TEST1);
		
		
	}
	@After 
	public void tearDown() {
		
		lr2.clear();
		
	}
	
	@Test
	public void testGet_carga() { //este es mi test para la carga de ficheros de una carpeta haciendo uso de un filtro
		hola = lr1.add("test\\res", "Pentatonix.mp4");
		
		System.out.println(lr1.getSize());
		
	}
	
	
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testGet_Exc1() {
		lr1.getFic(0);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testGet_Exc2() {
		lr2.getFic(-1);
	}
	
	@Test public void testGet() {
		
		assertEquals(FIC_TEST1, lr2.getFic(0));
		
		
	}
	
	
}
