package controller;


import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.ItemCesta;
import persistence.FilmeDAO;

@SessionScoped
@ManagedBean (name = "cesta")
public class CestaController {
  
    private ArrayList<ItemCesta> cestaFilmes;
    private FilmeDAO dao = new FilmeDAO();

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

    public void addFilme(ItemCesta item){
        for (ItemCesta f : cestaFilmes) {
            if(f.getFilme().getId() == item.getFilme().getId()){
               item.getFilme().diminuiQtd();
               dao.updateQtd(item.getFilme().getQuantidade());
               this.cestaFilmes.add(item);
                return;
            }else{
               item.aQtd();
               item.getFilme().diminuiQtd();
               dao.updateQtd(item.getFilme().getQuantidade()); 
            }
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
