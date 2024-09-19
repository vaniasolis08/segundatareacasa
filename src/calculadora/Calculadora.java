
package calculadora;


public class Calculadora {

   
    public static void main(String[] args) {
         clase inicio = new clase();
        inicio.setTitle("calculadora basica");
        inicio.setBounds(500, 100, 500, 480);
        inicio.setResizable(false);
        inicio.insertarPanel();
        inicio.insertarEtiquetas();
        inicio.insertarTexto();
        inicio.insertarBotones();
    }
    
}
