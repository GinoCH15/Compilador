
package Objetos;

public class TablaCodigo {
    private String lineaError;
    private int numeroLinea;

    public TablaCodigo(String lineaError, int numeroLinea) {
        this.lineaError = lineaError;
        this.numeroLinea = numeroLinea;
    }

    public String getLineaError() {
        return lineaError;
    }

    public void setLineaError(String lineaError) {
        this.lineaError = lineaError;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    @Override
    public String toString() {
        return "TablaCodigo{" + "lineaError=" + lineaError + ", numeroLinea=" + numeroLinea + '}';
    }
    
    
}
