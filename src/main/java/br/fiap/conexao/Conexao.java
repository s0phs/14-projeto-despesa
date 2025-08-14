package br.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private final static String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private final static String USER = "rm558267";
    private final static String PASSWORD = "190705";

    //Construtor privado para que o usuário não possa criar um objeto do tipo Conexao livremente
    private Conexao(){}

    public static Connection conectar() {
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (SQLException e){
            System.out.println("Erro ao conectar no banco\n" + e);
        }
        return null;
    }

}
