package holamundo;


public class Alumno {
    private String codigo;
    private String nombre;
    private String apellidos;
    private String estado;
    private int edad;
    private Libro libros[];
    
    public Alumno(){
        this.edad = 18;
        this.estado= "Regular";
        this.libros = new Libro[2];
        this.libros[0] = new Libro("EG-I");
        this.libros[1] = new Libro("EG-II");
        
    }
    public void agregarLibro(Libro libro){
        Libro nuevosLibros[] = new Libro[this.libros.length + 1];
        nuevosLibros[this.libros.length] = libro;
        for(int i=0; i<this.libros.length;i++){
            nuevosLibros[i]=this.libros[i];
        }
        this.libros=nuevosLibros;
    }
    
    
    

    @Override
    public String toString() {
        String libros="\t";
        for(int i=0; i<this.libros.length;i++){
            libros = libros + this.libros[i].getNombre()+",\n\t";
        }
        return "codigo=" + codigo + 
                "\t nombre=" + nombre + 
                "\t apellidos=" + apellidos + 
                "\t edad=" + edad+
                "\nLibros "+ libros;
    }
    
    
    public void setEdad(int edad){
        this.edad=edad; 
    }
    public int getEdad(){
        return this.edad;
    }
    
    
    
}
