package controller;


import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Filme;
import persistence.FilmeDAO;

@SessionScoped
@ManagedBean (name = "cesta")
public class CestaController {
  
    private ArrayList<Filme> cestaFilmes = new ArrayList<Filme>();
    private FilmeDAO dao = new FilmeDAO();
    int total=0;
    
    public CestaController() {}

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
            f.aumentaCesta();
            f.diminuiQtd();
            dao.updateQtd(f);
	}else{
            f.setQtdCesta(1);
            cestaFilmes.add(f);
            f.diminuiQtd();
            dao.updateQtd(f);
        }
        
    }
    
    public void removeFilme(Filme f){
        
        if(f.getQtdCesta() == 1){
            cestaFilmes.remove(f);
            f.incrementaQtd();
            dao.updateQtd(f);
        }else{
            f.diminuiCesta();
            f.incrementaQtd();
            dao.updateQtd(f);
        }
        
    }
    
    public void limpar(){
        this.cestaFilmes.clear();
    }
    
    public String confirmarAluguel(){
        
        int i=0;
        total=0;
        for(Filme f : cestaFilmes){
            i = f.getQtdCesta();
            total = total+(i*5);
        }
        this.cestaFilmes.clear();
        return "totalPagar";
        
    }

    public FilmeDAO getDao() {
        return dao;
    }

    public void setDao(FilmeDAO dao) {
        this.dao = dao;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
