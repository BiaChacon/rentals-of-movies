package controller;


import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Filme;
import persistence.FilmeDAO;

@SessionScoped
@ManagedBean (name = "cesta")
public class CestaController {
  
    private ArrayList<Filme> cestaFilmes;
    private FilmeDAO dao = new FilmeDAO();

    public CestaController() {
    }

    public ArrayList<Filme> getCestaFilmes() {
        return cestaFilmes;
    }

    public void setCestaFilmes(ArrayList<Filme> cestaFilmes) {
        this.cestaFilmes = cestaFilmes;
    }
    
    public CestaController(ArrayList cestaFilmes) {
        this.cestaFilmes = cestaFilmes;
    }
   
    public Filme verificar(int id){
        
	Filme ff = null;
        
	for (Filme f : cestaFilmes) {
            if(f.getId() == id){
		return f;
            }
	}
	return ff;
        
    }
    
    public void addFilme(Filme f){
        
	if(verificar(f.getId()) != null){
            f.setQtdCesta(f.getQtdCesta()+1);
            f.diminuiQtd();
	}else{
            f.setQtdCesta(1);
            cestaFilmes.add(f);
            f.diminuiQtd();
        }
        
    }
    
    public void removeFilme(Filme f){
        
        if(f.getQtdCesta() == 1){
            cestaFilmes.remove(f);
        }else{
            f.setQtdCesta(f.getQtdCesta()+1);
        }
        
    }
    
    public void limpar(){
        this.cestaFilmes.clear();
    }
    
    public void confirmarAluguel(){
    
    }
    
}
