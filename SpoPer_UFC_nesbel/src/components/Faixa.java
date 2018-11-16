/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

/**
 *
 * @author Belchior
 */
public class Faixa {
    private int faixa_id;
    private String duracao;
    private String descr;
    private String tipo_gravacao;
    private Interprete[] interpretes = new Interprete[5];
    private Compositor compositor;
    public void setFaixaId(int id){
        faixa_id = id;
    }
    public int getFaixaId(){
        return faixa_id;
    }
    public void setDuracao(String durac){
        duracao = durac;
    }
    public String getDuracao(){
        return duracao;
    }
    public void setDescr(String descricao){
        descr = descricao;
    }
    public String getDescr(){
        return descr;
    }
    public void setTipoGravacao(String tipogravacao){
        tipo_gravacao = tipogravacao;
    }
    public String getTipoGravacao(){
        return tipo_gravacao;
    }
    public void setCompositor(Compositor comp){
        compositor = comp;
    }
    public Compositor getCompositor(){
        return compositor;
    }
  
}
