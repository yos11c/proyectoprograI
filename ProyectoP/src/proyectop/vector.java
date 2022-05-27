
package proyectop;

/**
 *
 * @author Yosmeri C. Cruz
 */
public class vector extends Grado {
    protected String [] vectorNombreCurso;
    protected String [] vectorCodigoCurso;
    private int indiceVector;

    vector(){
        vectorNombreCurso=new String[100];
        vectorCodigoCurso=new String[100];
        indiceVector=0;
    }

    public void registroCurso (String tipo ){
        indiceVector= indiceVector+1;
        vectorNombreCurso[indiceVector]= " * "+ "Codigo del curso --> " + tipo;
    }
}
