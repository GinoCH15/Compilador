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
public class For {
    int cont;
    char[] caracter;
    boolean reconocido;
    
    public For(String cadena){
        this.caracter = cadena.toCharArray();
        reconocerCOMEN();
        if(!reconocido){
            reconocerDESDE();    
        }
        if(!reconocido){
            reconocerHASTA();    
        }
        if(!reconocido){
            reconocerDET();    
        }
    }
    
    private void reconocerCOMEN(){
        reconocer();
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
            if(caracter[cont]=='M'){
                cont++;
                q3();
            }else{
                error();
            }
        }
    }
    private void q3(){
        if(cont<caracter.length){
            if(caracter[cont]=='E'){
                cont++;
                q4();
            }else{
                error();
            }
        }
    }
    private void q4(){
        if(cont<caracter.length){
            if(caracter[cont]=='N'){
                cont++;
                error();
            }else{
                error();
            }
        }
    }
    
    private void reconocerDESDE(){
        reconocer();
        q5();
    }
    
    private void q5(){
        if(cont<caracter.length){
            if(caracter[cont]=='D'){
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
                q7();
            }else{
                error();
            }
        }
    }
    private void q7(){
        if(cont<caracter.length){
            if(caracter[cont]=='S'){
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
                q9();
            }else{
                error();
            }
        }
    }
    private void q9(){
        if(cont<caracter.length){
            if(caracter[cont]=='E'){
                cont++;
                error();
            }else{
                error();
            }
        }
    }
    
    private void reconocerHASTA(){
        reconocer();
        q10();
    }
    
    private void q10(){
        if(cont<caracter.length){
            if(caracter[cont]=='H'){
                cont++;
                q11();
            }else{
                error();
            }
        }
    }
    private void q11(){
        if(cont<caracter.length){
            if(caracter[cont]=='A'){
                cont++;
                q12();
            }else{
                error();
            }
        }
    } 
    private void q12(){
        if(cont<caracter.length){
            if(caracter[cont]=='S'){
                cont++;
                q13();
            }else{
                error();
            }
        }
    }
    private void q13(){
        if(cont<caracter.length){
            if(caracter[cont]=='T'){
                cont++;
                q14();
            }else{
                error();
            }
        }
    }
    private void q14(){
        if(cont<caracter.length){
            if(caracter[cont]=='A'){
                cont++;
                error();
            }else{
                error();
            }
        }
    }
    
    private void reconocerDET(){
        cont = 0;
        q15();
    }
    
    private void q15(){
        if(cont<caracter.length){
            if(caracter[cont]=='D'){
                cont++;
                q16();
            }else{
                error();
            }
        }
    }
    private void q16(){
        if(cont<caracter.length){
            if(caracter[cont]=='E'){
                cont++;
                q17();
            }else{
                error();
            }
        }
    }
    private void q17(){
        if(cont<caracter.length){
            if(caracter[cont]=='T'){
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
