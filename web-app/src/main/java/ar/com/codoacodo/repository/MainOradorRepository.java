package ar.com.codoacodo.repository;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {
	
	public static void main(String[]args) {
		
		OradorRepository repository = new MySQLOradorRepository();
		
		Orador orador = repository.getById(1L);
		
		orador.setId(null);
		orador.setMail("otroemail@mail.com");
		
		repository.save(orador);
		
		System.out.println(orador);
	}

}
