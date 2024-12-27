package com.lojagame.LojaGame.repository;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lojagame.LojaGame.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
    public List<Produto> findAllByQuantidadeLessThan(Long quantidade);
    public List<Produto> findAllByQuantidadeGreaterThan(Long quantidade);
    public List<Produto> findAllByValorLessThan(BigDecimal valor);
    public List<Produto> findAllByValorGreaterThan(BigDecimal valor);

}
