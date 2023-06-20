/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ítalo Nunes
 */
public class Poupanca {
private Double valor;
private int tempo;
    public Poupanca(Double valor, int tempo) {
    this.valor = valor;
    this.tempo = tempo;
    
    }
    public Double simulador(){
        Double total = valor;
        for(int i=0; i<tempo;i++){
        total = total/100*0.5+total;
        
    }
    return total;
            }
    }
    


