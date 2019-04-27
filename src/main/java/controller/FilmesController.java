package controller;

import model.Filmes;
import java.util.List;
import javax.faces.bean.ManagedBean;
import persistence.FilmesDAO;

@ManagedBean (name = "filmes")
public class FilmesController {
    
    private Filmes filme = new Filmes();
    
    public void cadastraFilme() {
        FilmesDAO fd = new FilmesDAO();         
        fd.insertIntoFilmes(filme);
     }
      
    public List<Filmes> getFilmes() {
  
        FilmesDAO fd = new FilmesDAO(); 
        List<Filmes> listaFilmes = fd.readFilmes();
        
        return listaFilmes;
        
    }
    
    public Filmes getFilme() {
        return filme;
    }

    public void setFilme(Filmes filme) {
        this.filme = filme;
    }  
    
}