/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analisis;
import java.util.LinkedList;
import java.util.StringTokenizer;
/**
 *
 * @author Predator
 */
public class Scanner {
    String texto;
    public String setTexto(String txtBox){
        texto =txtBox;
        return texto;
    }
    public LinkedList <String> getLista(){
        StringTokenizer tokens= new StringTokenizer(texto," \n\t:;",true);
        LinkedList <String> cadena= new LinkedList();
            while(tokens.hasMoreTokens())
            {
                cadena.add(tokens.nextToken());
            }
        return cadena;
    }
    
    
}
