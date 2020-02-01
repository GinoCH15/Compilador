/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analisis;

import AutomatasLexicos.For;
import AutomatasLexicos.If;
import AutomatasLexicos.LeeEscribe;
import AutomatasLexicos.MetodoPrincipal;
import AutomatasLexicos.TipoVariables;
import AutomatasLexicos.VariablesNumeros;
import AutomatasLexicos.While;

/**
 *
 * @author José
 */

public class AnalisisLexico {
    int cont;
    char[] caracter;
    boolean hayError;
    int lineaError;
    Scanner cadena = new Scanner();
    
    public AnalisisLexico(String lista){
        
        // Guardas la lista bidimensional cada lista es una linea
        
        
//        reconocer();
    }
    
//    private void reconocer(){
//        cont = 0;
//        int indlista=0;
//        int tamlista= cadena.getLista().size();
//        int indcadena=0;
//        int indcaracter=0;
//        
//        while(tamlista>=0){
//            if(cadena.getLista().get(indlista).length()>0){                
//                int tamcadena = cadena.getLista().get(indlista).length();
//                if(tamcadena>0){
//                    caracter[indcaracter]=cadena.getLista().get(indlista).charAt(indcadena);
//                    indcaracter++;
//                    indcadena++;
//                    tamcadena--;
//                }               
//                indlista++;
//            }
//            tamlista--;
//        } 
//    }    
    
    private void analisis(String cadena){
        // aca separas por palabras
        int cont = 0;
        do{
//            If analisisIF = new If(cadena);
//            if(!analisisIF.reconocer() && !this.hayError){
//                hayError = true;
//            }
//            For analisisFor = new For(cadena);
//            if(!analisisFor.reconocer() && !this.hayError){
//                hayError = true;
//            }
//            LeeEscribe analisisLeeEscribe = new LeeEscribe(cadena);
//            if(!analisisLeeEscribe.reconocer() && !this.hayError){
//                hayError = true;
//            }
//            MetodoPrincipal analisisMetodoPrincipal = new MetodoPrincipal(cadena);
//            if(!analisisMetodoPrincipal.reconocer()&& !this.hayError){
//                hayError = true;
//            }
//            TipoVariables analisisTipoVariables = new TipoVariables(cadena);
//            if(!analisisTipoVariables.reconocer() && !this.hayError){
//                hayError = true;
//            }
//            VariablesNumeros analisisVariablesNumeros = new VariablesNumeros(cadena);
//            if(!analisisVariablesNumeros.reconocer() && !this.hayError){
//                hayError = true;
//            }
//            While analisisWhile = new While(cadena);
//            if(!analisisWhile.reconocer() && !this.hayError){
//                hayError = true;
//            }
            If analisisIF = new If(cadena);
            For analisisFor = new For(cadena);
            LeeEscribe analisisLeeEscribe = new LeeEscribe(cadena);
            MetodoPrincipal analisisMetodoPrincipal = new MetodoPrincipal(cadena);
            TipoVariables analisisTipoVariables = new TipoVariables(cadena);
            VariablesNumeros analisisVariablesNumeros = new VariablesNumeros(cadena);
            While analisisWhile = new While(cadena);
            if(analisisIF.reconocer()){
                hayError = false;
            }           
            else if(analisisFor.reconocer()){
                hayError = false;
            }
            else if(analisisLeeEscribe.reconocer()){
                hayError = true;
            }
            else if(analisisMetodoPrincipal.reconocer()){
                hayError = false;
            }
            
            else if(analisisTipoVariables.reconocer()){
                hayError = false;
            }
            
            else if(analisisVariablesNumeros.reconocer()){
                hayError = false;
            }
            
            else if(analisisWhile.reconocer()){
                hayError = false;
            }
            cont++;
        }while(hayError && cont < 2); 
    }
    
    public boolean hayError(){
        // aca envias texto por lineas  
        int linea = 0;
        cont = 0;
        this.hayError = true;
        do{
            analisis("8AASR");
            linea++;
            cont++;
        }while(hayError && cont<2);
        System.out.println(hayError);
        lineaError = linea;
        
        return hayError;
    }
    
    public int lineaError(){
        return lineaError;
    }
    
}
