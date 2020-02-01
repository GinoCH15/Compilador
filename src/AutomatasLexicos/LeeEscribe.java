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
public class LeeEscribe {
    int cont;
    char[] caracter;
    boolean reconocido;
    
    public LeeEscribe(String cadena){
        this.caracter = cadena.toCharArray();
        reconocerESCR();
        if(!reconocido){
            reconocerLEE();   
        }
    }
    
    private void reconocerESCR(){
        cont = 0;
        q0();
    }
    
    private void q0(){
        if(cont<caracter.length){
            if(caracter[cont]=='E'){
                cont++;
                q1();
            }else{
                error();
            }
        }
    }
    private void q1(){
        if(cont<caracter.length){
            if(caracter[cont]=='S'){
                cont++;
                q2();
            }else{
                error();
            }
        }
    }
    private void q2(){
        if(cont<caracter.length){
            if(caracter[cont]=='C'){
                cont++;
                q3();
            }else{
                error();
            }
        }
    }
    private void q3(){
        if(cont<caracter.length){
            if(caracter[cont]=='R'){
                cont++;
                error();
            }else{
                error();
            }
        }
    }
    
    private void reconocerLEE(){
        cont = 0;
        q4();
    }
    
    private void q4(){
        if(cont<caracter.length){
            if(caracter[cont]=='L'){
                cont++;
                q5();
            }else{
                error();
            }
        }
    }
    private void q5(){
        if(cont<caracter.length){
            if(caracter[cont]=='E'){
                cont++;
                q6();
            }else{
                error();
            }
        }
    }
    private void q6(){
        if(cont<caracter.length){
            if(caracter[cont]=='E'){
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