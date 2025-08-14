package br.fiap.modelo;

import br.fiap.conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql; //usada só para deixar o código mais limpo

    public void inserir(Categoria categoria){
        sql = "insert into java_categoria values (?, ?)";

        try(Connection connection = Conexao.conectar()) {

            ps = connection.prepareStatement(sql);
            ps.setLong(1,categoria.getId());
            ps.setString(2,categoria.getCategoria());
            ps.execute();

        }
        catch (SQLException e){
            System.out.println("Erro ao inserir no banco de dados\n" + e);
        }
    }

    public List<Categoria> listar(){
        List<Categoria> lista = new ArrayList<>();

        sql = "select * from java_categoria";
        try(Connection connection = Conexao.conectar()) {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                lista.add(new Categoria(rs.getLong("id_categoria"),rs.getString("categoria")));
            }
        }
        catch(SQLException e) {
            System.out.println("Erro ao listar categorias\n" + e);
        }
        return lista;
    }

}
