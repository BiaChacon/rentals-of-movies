package controller;

import javax.faces.bean.ManagedBean;

@ManagedBean (name = "tela")
public class TelasController {
    
    public String home(){
        return "home";
    }

    public String cestaAluguel(){
        return "cestaAluguel";
    }
    
    public String cadastrarFilmes(){
        return "cadastrarFilmes";
    }
    
    public String aluguelFilmes(){
        return "aluguelFilmes";
    }
}
