package controller;


import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Filme;
import model.ItemCesta;
import persistence.FilmeDAO;

@SessionScoped
@ManagedBean (name = "cesta")
public class CestaController {
  
    private ArrayList<ItemCesta> cestaFilmes;
    private FilmeDAO dao = new FilmeDAO();
    private ItemCesta item;

    public CestaController() {
    }

    public ArrayList<ItemCesta> getCestaFilmes() {
        return cestaFilmes;
    }

    public void setCestaFilmes(ArrayList<ItemCesta> cestaFilmes) {
        this.cestaFilmes = cestaFilmes;
    }
    
    public CestaController(ArrayList cestaFilmes) {
        this.cestaFilmes = cestaFilmes;
    }
    
    public Filme verificar(Filme f){
        for (ItemCesta i : cestaFilmes) {
            if(i.getFilme().getId() == f.getId()){
                return null;
            }
        }
        return f;
    }
    
    public void addFilme(Filme f){
        
        if(verificar(f) == null){
            item.aQtd();
            f.diminuiQtd();
            dao.updateQtd(f);
        }else{
            ItemCesta ic = new ItemCesta(f, 1);
            f.diminuiQtd();
            dao.updateQtd(f);
            this.cestaFilmes.add(ic);
        }  
        
    }
    
    public void removeFilme(ItemCesta item){
        
        if(item.getQtd() == 1){
            this.cestaFilmes.remove(item);
        }else{
            item.dQtd();
        }
        
    }
    
    public void limpar(){
        this.cestaFilmes.clear();
    }
    
}
