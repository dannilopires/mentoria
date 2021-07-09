package com.avanade.dio.API.REST.services;

import com.avanade.dio.API.REST.models.Produto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProdutoService {

    public List<Produto> findAll(){
        List<Produto> listaProdutos = new ArrayList<Produto>();
        Produto p1 = new Produto(1,"descricao", new Date(), "1234", true);
        Produto p2 = new Produto(2, "descricao2", new Date(), "4321", false);
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        return listaProdutos;
    }


    public void insert (Produto produto){
        System.out.println("Inserido: " + produto);
    }

    public void update(Produto produto) {
        System.out.println("Atualizado: " + produto);

    }

    public void delete(Long id) {
        System.out.println("Excluído: " + id);
    }


}
