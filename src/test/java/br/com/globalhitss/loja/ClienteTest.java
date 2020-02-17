package br.com.globalhitss.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Test;

import junit.framework.Assert;

public class ClienteTest {
	
	
	@Test
	public void testaConexao() {
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		String conteudo = target.path("/produtos").request().get(String.class);
		System.out.println(conteudo);
		Assert.assertTrue(conteudo.contains("Sabonete"));
		
		
	}

}
