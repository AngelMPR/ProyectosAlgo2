
package holamundo;


public class App {

  
    public static void main(String[] args) {
        
        Alumno Juan /*declarando variable de tipo oobjeto*/= new Alumno();/*creando el objeto*/
        System.out.println("Datos del objeto:\n\t" +Juan);
        Juan.setEdad(25);
        Juan.agregarLibro(new Libro("Mate 1"));
        Juan.agregarLibro(new Libro("Calculo 1"));
        Juan.agregarLibro(new Libro("Progra 1"));
       
        System.out.println("Edad : "+Juan.getEdad());
        System.out.println("Datos del objeto:\n" +Juan);
        System.out.println("...");
    }
    
}
