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
public class TipoVariables {
    int cont;
    char[] caracter;
    boolean reconocido;
    
    public TipoVariables(String cadena){
        this.caracter = cadena.toCharArray();
        reconocerENT();
        if(!reconocido){
            reconocerDEC();  
        }
        if(!reconocido){
            reconocerCAD();   
        }
    }
    
    private void reconocerENT(){
        reconocer();
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
            if(caracter[cont]=='N'){
                cont++;
                q2();
            }else{
                error();
            }
        }
    }
    private void q2(){
        if(cont<caracter.length){
            if(caracter[cont]=='T'){
                cont++;
                error();
            }else{
                error();
            }
        }
    }
    
    private void reconocerDEC(){
        reconocer();
        q3();
    }
    
    private void q3(){
        if(cont<caracter.length){
            if(caracter[cont]=='D'){
                cont++;
                q4();
            }else{
                error();
            }
        }
    }
    private void q4(){
        if(cont<caracter.length){
            if(caracter[cont]=='E'){
                cont++;
                q5();
            }else{
                error();
            }
        }
    }
    private void q5(){
        if(cont<caracter.length){
            if(caracter[cont]=='C'){
                cont++;
                error();
            }else{
                error();
            }
        }
    }
    
    private void reconocerCAD(){
        reconocer();
        q6();
    }
    
    private void q6(){
        if(cont<caracter.length){
            if(caracter[cont]=='C'){
                cont++;
                q7();
            }else{
                error();
            }
        }
    }
    private void q7(){
        if(cont<caracter.length){
            if(caracter[cont]=='A'){
                cont++;
                q8();
            }else{
                error();
            }
        }
    } 
    private void q8(){
        if(cont<caracter.length){
            if(caracter[cont]=='D'){
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
