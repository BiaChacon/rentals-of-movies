package controller;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import model.Filmes;

@ManagedBean
public class Cesta {
    
	private ArrayList <Filmes> listaFilmes ;
	
	public Cesta() {
		this.listaFilmes = new ArrayList<Filmes>();
	}

	public Cesta(ArrayList<Filmes> filmes) {
		super();
		this.listaFilmes = filmes;
	}
	
	public ArrayList<Filmes> getListaFilmes() {
		return listaFilmes;
	}

	public void setListaFilmes(ArrayList<Filmes> listaFilmes) {
		this.listaFilmes = listaFilmes;
	}
        
	public Filmes getFilmes(int id){
		Filmes mp = null;
		for (Filmes f : listaFilmes) {
			if(f.getId()==id){
				return f;
			}
			
		}
		return mp;
	}
        
	public void removeFilme(int id){
	
	}
        
	public void addFilme(Filmes f){
	
	}

}
