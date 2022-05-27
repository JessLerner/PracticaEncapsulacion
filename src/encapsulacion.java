public class encapsulacion {
    public static void main(String[] args)  {
        Persona persona = new Persona();
        persona.setEdad(34);
        persona.setNombre("Jesica");
        persona.setTelefono("1138046841");
        System.out.println("El nombre es: " +persona.getNombre()+", su edad es: "+persona.getEdad()+" años y su telefono es: "+persona.getTelefono());
        

    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
        
    public void setNombre(String nombre){
        this.nombre=nombre;

    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;

    }
    public String getTelefono(){
        return this.telefono;
    }
}

