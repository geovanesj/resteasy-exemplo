package br.com.geovanesj.resteasyexemplo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import br.com.geovanesj.resteasyexemplo.domain.Produto;

@Path("/produto")
public class ProdutoREST {

	@GET
	@Path("/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public String obterProduto(@PathParam("codigo") Long codigo) {
		Gson gson = new Gson();
		Produto produto = new Produto();
		produto.setCodigo(codigo);
		return gson.toJson(produto);
	}
	
}
