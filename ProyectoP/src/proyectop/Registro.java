
package proyectop;

public class Registro extends vector {
    private String[] vectorTransaccion;
    private int indiceVector;
    private String[] vectorNombre;
    private String[] vectorAlias;
    private String[] vectorCorreo;
    private String[] vectorCodigo;

    public Registro() {
        vectorAlias = new String[100];
        vectorCorreo = new String[100];
        vectorCodigo = new String[100];
        vectorNombre = new String[100];
        vectorTransaccion = new String[100];
        this.indiceVector = 0;
    }

    public void alias(String nombre) {
        this.registrarnombre(nombre);
    }

    public void nombre(String nombre) {
        this.registrarnombre(nombre);
    }

    public void registroalias(String tipo) {
        indiceVector = indiceVector + 1;
        vectorAlias[indiceVector] = " * " + "Alias -->" + tipo;
    }

    public void registrarnombre(String tipo) {
        indiceVector = indiceVector + 1;
        System.out.println("----------------------------------------");
        vectorNombre[indiceVector] = " * " + " Nombre--> " + tipo;

    }

    public void registrocodigo(String tipo) {
        indiceVector = indiceVector + 1;

        vectorCodigo[indiceVector] = " * " + " codigo-->" + tipo;

    }

    public void registrocorreo(String tipo) {
        indiceVector = indiceVector + 1;
        vectorCorreo[indiceVector] = " * " + " correo--> " + tipo;

    }

    public void registrotelefono(String tipo) {
        indiceVector = indiceVector + 1;
        vectorTransaccion[indiceVector] = " * " + " telefono--> " + tipo;


    }

    public void mostrarDes() {

        for (int i = 1; i < vectorDescripcion.length; i++) {
            if (vectorDescripcion[i] != null) {

                System.out.println("Regitro = " + vectorDescripcion[i]);

            }
        }
        System.out.println("");
        for (String transaccion : vectorDescripcion) {
            if (transaccion != null) {

            }
        }
    }

    public void mostrarTransaccion() {
        for (int i = 1; i < vectorTransaccion.length; i++) {
            if (vectorTransaccion[i] != null) {
                System.out.println("Registro = " + vectorTransaccion[i]);
            }
        }
        System.out.println(" ");
        for (String transaccion : vectorTransaccion) {
            if (transaccion != null) ;{

            }
        }
    }
    public void mostrarnombre(){

        for (int i=1; i<vectorNombre.length;i++){
            if(vectorNombre[i] != null){

                System.out.println("Regitro ="+ vectorNombre[i]);

            }
        }
        System.out.println("");
        for(String transaccion : vectorNombre){
            if(transaccion != null){

            }
        }
    }
    public void mostraralias(){

        for (int i=1; i<vectorAlias.length;i++){
            if(vectorAlias[i] != null){

                System.out.println("Regitro ="+ vectorAlias[i]);

            }
        }
        System.out.println("");
        for(String transaccion : vectorAlias){
            if(transaccion != null){

            }
        }
    }
    public void mostrarcorreo(){

        for (int i=1; i<vectorCorreo.length;i++){
            if(vectorCorreo[i] != null){

                System.out.println("Regitro ="+ vectorCorreo[i]);

            }
        }
        System.out.println("");
        for(String transaccion : vectorCorreo){
            if(transaccion != null){

            }
        }
    }

    public void mostrarcodigo(){

        for (int i=1; i<vectorCodigo.length;i++){
            if(vectorCodigo[i] != null){

                System.out.println("Regitro= "+ vectorCodigo[i]);

            }
        }
        System.out.println("");
        for(String transaccion : vectorCodigo){
            if(transaccion != null){

            }
        }
    }

    public void mostrarcurso(){

        for (int i=1; i<vectorNombreCurso.length;i++){
            if(vectorNombreCurso[i] != null){

                System.out.println("Regitro ="+ vectorNombreCurso[i]);

            }
        }
        System.out.println("");
        for(String transaccion : vectorNombreCurso){
            if(transaccion != null){

            }
        }
    }


    public void mostrarcursocodigo(){

        for (int i=1; i<vectorCodigoCurso.length;i++){
            if(vectorCodigoCurso[i] != null){

                System.out.println("Regitro ="+ vectorCodigoCurso[i]);

            }
        }
        System.out.println("");
        for(String transaccion : vectorCodigoCurso){
            if(transaccion != null){

            }
        }
    }

    public void mostrarCodigoGrado(){

        for (int i=1; i<registroCodigoGrado.length;i++){
            if(registroCodigoGrado[i] != null){

                System.out.println("Regitro ="+ registroCodigoGrado[i]);

            }
        }
        System.out.println("");
        for(String transaccion : registroCodigoGrado){
            if(transaccion != null){

            }
        }
    }
}