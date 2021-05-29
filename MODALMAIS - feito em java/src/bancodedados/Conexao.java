package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao{
                
    public static Connection faz_conexao(){

        System.out.println("Conectando ao banco...");
        
        
        try {

            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/desafio", "root", "");
            
        } catch (ClassNotFoundException ex) {

            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);

        }
        return null;
}
}

