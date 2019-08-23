package br.com.fiap.teste_h2_agora_vai.repositoy;

import br.com.fiap.teste_h2_agora_vai.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository
        extends JpaRepository<Produto,Integer> {
}
