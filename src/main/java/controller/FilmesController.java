package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import persistence.FilmesDAO;

@ManagedBean (name = "filme")
public class FilmesController {
    
    private Filmes f = new Filmes();
    private List<Filmes> listaFilmes;

    public List<Filmes> getListaFilmes() {
        return listaFilmes;
    }

    public void setListaFilmes(List<Filmes> listaFilmes) {
        this.listaFilmes = listaFilmes;
    }

    public Filmes getF() {
        return f;
    }

    public void setF(Filmes f) {
        this.f = f;
    }
    
    public void addFilme(){
        FilmesDAO fd = new FilmesDAO();
        fd.insertIntoFilmes(f);
        f = new Filmes();
    }

    public void listarFilmes() {
        FilmesDAO fd = new FilmesDAO();
        listaFilmes = fd.readFilmes();
    }
    
    public String verCestaAluguel(){
        return "cestaAluguel";
    }
    
    public String cancelar(){
        return "aluguelFilmes";
    }
    
}
