package controller;

import model.Filme;
import java.util.List;
import javax.faces.bean.ManagedBean;
import persistence.FilmeDAO;

@ManagedBean (name = "filmes")
public class FilmeController {
    
    private Filme filme = new Filme();
    
    public void cadastraFilme() {
        FilmeDAO fd = new FilmeDAO();         
        fd.insertIntoFilmes(filme);
     }
      
    public List<Filme> getFilmes() {
  
        FilmeDAO fd = new FilmeDAO(); 
        List<Filme> listaFilmes = fd.readFilmes();
        
        return listaFilmes;
        
    }
    
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }  
    
}