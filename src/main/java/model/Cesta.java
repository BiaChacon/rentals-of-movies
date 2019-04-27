package model;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.SessionScoped;

@SessionScoped
public class Cesta {
    
    private List<Item> itens = new ArrayList<Item>();

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
   
}
