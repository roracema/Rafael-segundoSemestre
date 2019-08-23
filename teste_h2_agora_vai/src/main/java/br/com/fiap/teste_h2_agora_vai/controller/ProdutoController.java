package br.com.fiap.teste_h2_agora_vai.controller;

import br.com.fiap.teste_h2_agora_vai.entity.Produto;
import br.com.fiap.teste_h2_agora_vai.repositoy.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/cadastrar")
    public String exibirHome(){
        return "produto/form";
    }

    @PostMapping("/cadastrar")
    public String processarForm(Produto produto, Model model){
        repository.save(produto);
        model.addAttribute("prod",produto);
        return "produto/sucesso";
    }

    @GetMapping("/buscar")
    public String exibirBusca(){
        return "produto/busca";
    }
    @PostMapping("/buscar")
    public String processarBusca(int codigo,Model model){
        Optional<Produto> produto = repository.findById(codigo);
        model.addAttribute("produt",produto);
        return "produto/resultado";
    }


}
