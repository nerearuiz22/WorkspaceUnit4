package iesjandulaunit4project.arraydeobjetos.agregacion;

public class AppCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente ("Jesus", "Soto","444444");
		Cliente c2 = new Cliente ("Pablo", "Martinez","555555");
		
		Tienda t1 = new Tienda ("Software JGP"," C. San Vicente Paul, 32, 23740 Andújar, Jaén");
		
		t1.addCliente(c1);
		t1.addCliente(c2);
		t1.borrarCliente(c2); 
		
		System.out.println(t1);

		t1.addCliente(c2);
	}

}
