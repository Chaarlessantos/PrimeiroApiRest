package com.produtos.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;





@RestController
@RequestMapping(value="/api")
@Tag(name = "API REST Produtos", description = "Gerenciamento de produtos")
//qualquer dominio pode acessar esse dominio origins="*" se não colocaria o dominio http
@CrossOrigin(origins="*")
public class ProdutoResource {

		@Autowired
		ProdutoRepository produtoRepository;
		
		@GetMapping("/produtos")
		@Operation(summary = "Retorna uma lista de produtos")
		public List<Produto> listaProdutos(){
			return produtoRepository.findAll();
		}
			
		@GetMapping("/produto/{id}")
		@Operation(summary = "Retorna produtos unico")
		public Produto listaProdutoUnico(@PathVariable(value="id") long id){
			return produtoRepository.findById(id);
		}
		
		@PostMapping("/produto")
		@Operation(summary = "Usa método salvar um produto")
		public Produto salvaProduto(@RequestBody Produto produto) {
			return produtoRepository.save(produto);
			
		}
		
		@DeleteMapping("/produto")
		@Operation(summary = "Esse método retorna um produto")
		public void deletaProduto(@RequestBody Produto produto) {
			produtoRepository.delete(produto);
			
		}
		
		@PutMapping("/produto")
		@Operation(summary = "Retorna uma lista de produtos")
		public Produto atualizaProduto(@RequestBody Produto produto) {
			return produtoRepository.save(produto);
			
		}
		
}
