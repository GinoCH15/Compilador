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
public class VariablesNumeros {
    int cont;
    char[] caracter;
    boolean reconocido;
    
    public VariablesNumeros(String cadena){
        this.caracter = cadena.toCharArray();
        reconocerVAR();
        if(!reconocido){
            reconocerNUM();
        }
    }
    
    private void reconocerVAR(){
        cont = 0;
        q0();
    }
    
    private void q0(){
        if(cont<caracter.length){
            if(Character.isLetter(caracter[cont])){
                cont++;
                q1();
            }else{
                error();
            }
        }
    }
    private void q1(){
        if(cont<caracter.length){
            if(Character.isLetter(caracter[cont]) || Character.isDigit(caracter[cont])){
                cont++;
                q1();
            }else{
                error();
            }
        }
        if(cont==caracter.length){
            error();
        }
    }
    
    private void reconocerNUM(){
        cont = 0;
        q2();
    }
    
    private void q2(){
        if(cont<caracter.length){
            if(Character.isDigit(caracter[cont])){
                cont++;
                q2();
            }else{
                error();
            }
        }
        if(cont==caracter.length){
            error();
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