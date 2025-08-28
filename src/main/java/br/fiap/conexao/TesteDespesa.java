package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.Despesa;
import br.fiap.modelo.DespesaDAO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TesteDespesa {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");

//        Despesa despesa = new Despesa();
//        despesa.setId(103L);
//        despesa.setDescricao("Monster para assistir aula de java");
//        despesa.setValor(55.00);
//        despesa.setCategoria(new Categoria(5L,""));
//        despesa.setData(LocalDate.parse("21/08/2025",mascara));
//        dao.inserir(despesa);

//        List<Despesa> lista = dao.listar();
//        for(Despesa despesa : lista){
//            System.out.println(despesa.getId());
//            System.out.println(despesa.getDescricao());
//            System.out.println(despesa.getValor());
//            System.out.println(despesa.getData());
//            System.out.println(despesa.getCategoria().getId());
//            System.out.println("==================================");
//
//        }

        List<Despesa> lista = dao.relatorio();
        for(Despesa despesa : lista){
            System.out.println(despesa.getDescricao());
            System.out.println(despesa.getValor());
            System.out.println(despesa.getData());
            System.out.println(despesa.getCategoria().getCategoria());
            System.out.println("==================================");

        }




    }
}
