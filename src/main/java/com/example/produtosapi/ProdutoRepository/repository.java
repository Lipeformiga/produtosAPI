package com.example.produtosapi.ProdutoRepository;

import com.example.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Produto, String> {

    
}
