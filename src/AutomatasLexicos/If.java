/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutomatasLexicos;

/**
 *
 * @author José
 */
public class If {
    
    int cont;
    char[] caracter;
    boolean reconocido=false;
    
    public If(String cadena){
        this.caracter = cadena.toCharArray();
        reconocerCOND();
        if(!reconocido){
            reconocerFINC();    
        }
    }
    
    private void reconocerCOND(){
        cont = 0;
        q0();
    }
    
    private void q0(){
        if(cont<caracter.length){
            if(caracter[cont]=='C'){
                cont++;
                q1();
            }else{
                error();
            }
        }
    }
    private void q1(){
        if(cont<caracter.length){
            if(caracter[cont]=='O'){
                cont++;
                q2();
            }else{
                error();
            }
        }
    }
    private void q2(){
        if(cont<caracter.length){
            if(caracter[cont]=='N'){
                cont++;
                q3();
            }else{
                error();
            }
        }
    }
    private void q3(){
        if(cont<caracter.length){
            if(caracter[cont]=='D'){
                cont++;
                error();
            }else{
                error();
            }
        }
    }
    
    private void reconocerFINC(){
        cont = 0;
        q4();
    }
    
    private void q4(){
        if(cont<caracter.length){
            if(caracter[cont]=='F'){
                cont++;
                q5();
            }else{
                error();
            }
        }
    }
    private void q5(){
        if(cont<caracter.length){
            if(caracter[cont]=='I'){
                cont++;
                q6();
            }else{
                error();
            }
        }
    }
    private void q6(){
        if(cont<caracter.length){
            if(caracter[cont]=='N'){
                cont++;
                q7();
            }else{
                error();
            }
        }
    }
    private void q7(){
        if(cont<caracter.length){
            if(caracter[cont]=='C'){
                cont++;
                error();
            }else{
                error();
            }
        }
    }
    
    
    private void error(){
        if(cont == caracter.length){
            this.reconocido = true;
        }else{
            this.reconocido = false;
        }
    }
    
    public boolean reconocer(){
        return this.reconocido;
    }
}
