package controller;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import model.Filme;

@ManagedBean (name = "cc")
public class CestaController {
    
	private ArrayList <Filme> listaFilmes ;
	
	public CestaController() {
		this.listaFilmes = new ArrayList<Filme>();
	}

	public CestaController(ArrayList<Filme> filmes) {
		super();
		this.listaFilmes = filmes;
	}
	
	public ArrayList<Filme> getListaFilmes() {
		return listaFilmes;
	}

	public void setListaFilmes(ArrayList<Filme> listaFilmes) {
		this.listaFilmes = listaFilmes;
	}
        
	public Filme getFilmes(int id){
		Filme mp = null;
		for (Filme f : listaFilmes) {
			if(f.getId()==id){
				return f;
			}
			
		}
		return mp;
	}
        
	public void removeFilme(int id){
	
	}
        
	public void addFilme(Filme f){
	
	}

}
