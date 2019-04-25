package model;

import java.sql.Connection;
import persistence.ConnectionDatabase;

public class TesteBanco {
    
    Connection connection = null;
    ConnectionDatabase c = new ConnectionDatabase();
    c.dbConnection();
    connection = c.getConnection();
			    
    if(connection!= null){
        System.out.println("A conexao com o banco foi realizada!");
    }else{
            System.out.println("A conexao com o banco falhou!");
    }
}
