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
public class While {
int cont;
    char[] caracter;
    boolean reconocido;
    
    public While(String cadena){
        this.caracter = cadena.toCharArray();
        reconocerSEA();
        if(!reconocido){
            reconocerFINS();
        }
    }
    
    private void reconocerSEA(){
        cont = 0;
        q0();
    }
    
    private void q0(){
        if(cont<caracter.length){
            if(caracter[cont]=='S'){
                cont++;
                q1();
            }else{
                error();
            }
        }
    }
    private void q1(){
        if(cont<caracter.length){
            if(caracter[cont]=='E'){
                cont++;
                q2();
            }else{
                error();
            }
        }
    }
    private void q2(){
        if(cont<caracter.length){
            if(caracter[cont]=='A'){
                cont++;
                error();
            }else{
                error();
            }
        }
    }
    
    private void reconocerFINS(){
        cont = 0;
        q3();
    }
    
    private void q3(){
        if(cont<caracter.length){
            if(caracter[cont]=='F'){
                cont++;
                q4();
            }else{
                error();
            }
        }
    }
    private void q4(){
        if(cont<caracter.length){
            if(caracter[cont]=='I'){
                cont++;
                q5();
            }else{
                error();
            }
        }
    }
    private void q5(){
        if(cont<caracter.length){
            if(caracter[cont]=='N'){
                cont++;
                q6();
            }else{
                error();
            }
        }
    }
    private void q6(){
        if(cont<caracter.length){
            if(caracter[cont]=='S'){
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
