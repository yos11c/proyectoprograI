
package proyectop;

/**
 *
 * @author Yosmeri C. Cruz
 */
public class Grado {
    protected String [] registroCodigoGrado;
    protected String [] vectorDescripcion;
    private int indiceVector;

    public Grado(){
        registroCodigoGrado=new String[100];
        vectorDescripcion=new String[100];
        indiceVector=0;
    }
    public void registrogrado (String tipo){
        indiceVector= indiceVector+1;
        registroCodigoGrado[indiceVector]= " * "+ "codigo del Grado -->"+ tipo;
    }
    public void registro (String tipo ){
        indiceVector= indiceVector+1;
        vectorDescripcion[indiceVector]= " * "+ "Descripcion -->"+ tipo;
    }
}
