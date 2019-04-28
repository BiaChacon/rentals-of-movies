package model;

public class ItemCesta {
    
    private Filme filme;
    private int qtd;

    public ItemCesta(Filme filme, int qtd) {
        this.filme = filme;
        this.qtd = qtd;
    }

    public ItemCesta() {
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public void aQtd(){
	this.qtd++;
    }
    
    public void dQtd(){
	this.qtd--;
    }

}
