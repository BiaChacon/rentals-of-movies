package controller;

import model.Filme;
import java.util.List;
import javax.faces.bean.ManagedBean;
import persistence.FilmeDAO;

@ManagedBean (name = "filmes")
public class FilmeController {
    
    private Filme filme = new Filme();
    FilmeDAO fd = new FilmeDAO();

    public FilmeController() {
    }
    
    public void cadastraFilme() {        
        fd.insertIntoFilmes(filme);
     }
      
    public List<Filme> getFilmes() {
  
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