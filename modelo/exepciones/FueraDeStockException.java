package modelo.exepciones;

public class FueraDeStockException extends Exception {
    
    public FueraDeStockException(String mensaje){
        super(mensaje);
    }
}
