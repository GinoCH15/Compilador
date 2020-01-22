
package Objetos;

import java.util.List;

public class TablaSimbolos {
    private String token;
    private int cantidad;
    private String tipo;
    
    public TablaSimbolos(String token, int cantidad, String tipo){
        this.token = token;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }    

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    
    @Override
    public String toString() {
        return "TablaSimbolos{" + "token=" + token + ", cantidad=" + cantidad + ", tipo=" + tipo + '}';
    }
    
    
}
