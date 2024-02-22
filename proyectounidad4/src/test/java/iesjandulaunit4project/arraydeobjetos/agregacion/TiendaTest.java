package iesjandulaunit4project.arraydeobjetos.agregacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {
	
	private Cliente nockClient;
	private Tienda nockTienda;

	@BeforeEach
	void setup() {
		nockClient = new Cliente ("Jesus", "Soto","444444");
		
		nockTienda = new Tienda ("Software JGP"," C. San Vicente Paul, 32, 23740 Andújar, Jaén");
	}
	
	@Test
	void addClienteTest() {
		nockTienda.addCliente(nockClient);
		
		Cliente[] array=nockTienda.getClientes();
		
		Arrays.sort(array);
		//Arrays.parallelSort(array, (cl1,cl2) -> cl1.getNombre().compareTo(cl2.getNombre()));
		
		assertTrue(Arrays.binarySearch(array, nockClient)>=0);
		//assertTrue(buscarElenArrays(array,nockClient));
		
	}
	
	@Test
	void borrarClienteTest() {
		nockTienda.addCliente(nockClient);
		nockTienda.borrarCliente(nockClient);
		
		
		for (Cliente cliente: nockTienda.getClientes()) {
			assertNotEquals(cliente,nockClient);
		}
		
	}
	
	@Test
	void hayClientesTest() {
		assertFalse(nockTienda.hayClientes());
		nockTienda.addCliente(nockClient);
		assertTrue(nockTienda.hayClientes());
	}
	
	@Test
	void hayClientesIntegracionTest() {
		assertFalse(nockTienda.hayClientes());
		nockTienda.addCliente(nockClient);
		assertTrue(nockTienda.hayClientes());
		nockTienda.borrarCliente(nockClient);
		assertFalse(nockTienda.hayClientes());
		
	}
	
	/*private boolean buscarElenArrays(Cliente[] clientes, Cliente cliente ) {
		boolean encontrado=false;
		
		for (int i; i<cliente.length && !encontrado; i++) {
			if(cliente.equals(clientes[i])){
				encontrado=true;
			}
		}
		
		return encontrado;
	}
	*/

}
