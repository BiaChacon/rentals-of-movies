package persistence;

import java.sql.Connection;
import javax.faces.bean.ManagedBean;

@ManagedBean (name = "t")
public class TesteDatabase {
    
    ConnectionDatabase cd  = new ConnectionDatabase();
    
    public String teste(){
        cd.dbConnection();
        Connection c = cd.getConnection();
        if(c == null){
            return "conexão falhou";
        }
        return "Conexão deu certo";
    }   
    
}
