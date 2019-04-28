package persistence;

import model.Filme;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilmeDAO {
 
    private ConnectionDatabase c = new ConnectionDatabase();

    private final String INSERT = "INSERT INTO FILMES(titulo, dataLancamento, nota, descricao, quantidade) VALUES (?, ?, ?, ?, ?);";
    
    private final String UPDATE = "UPDATE FILMES SET quantidade=? WHERE id=?;";

    private final String LISTFILMES = "SELECT * FROM FILMES";
    
    public void updateQtd(Filme f){
        c.dbConnection();
        try {
            PreparedStatement pst = c.getConnection().prepareStatement(UPDATE);
            pst.setInt(1, f.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro" + ex);
        }
        c.dbConnectionClose();   
    }
    
    public void insertIntoFilmes(Filme f) {
        c.dbConnection();
        try {
            PreparedStatement pst = c.getConnection().prepareStatement(INSERT);
            pst.setString(1, f.getTitulo());
            pst.setDate(2, new java.sql.Date(new Date().getTime()));
            pst.setInt(3, f.getNota());
            pst.setString(4, f.getDescricao());
            pst.setInt(5, f.getQuantidade());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro" + ex);
        }
        c.dbConnectionClose();
    }

    public List<Filme> readFilmes() {
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        try {
            c.dbConnection();
            PreparedStatement ps;
            ps = c.getConnection().prepareStatement(LISTFILMES);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            	Filme f = new Filme(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getDate("dataLancamento"),
                        rs.getInt("nota"),
                        rs.getString("descricao"),
                        rs.getInt("quantidade")
                );
            	listaFilmes.add(f);
            }
            c.dbConnectionClose();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaFilmes;
    }
       
}
