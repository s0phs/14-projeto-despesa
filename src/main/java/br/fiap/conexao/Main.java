package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.CategoriaDAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Conexao.conectar());
        CategoriaDAO dao = new CategoriaDAO();
        //Categoria categoria = new Categoria(4L,"moradia");//"L" para transformar em long
        //dao.inserir(categoria);

        List<Categoria> lista = dao.listar();
        for(Categoria categoria : lista){
            System.out.println(categoria.getId() + " --> " + categoria.getCategoria());
        }

    }
}
