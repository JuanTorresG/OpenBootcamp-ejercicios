public class Ejercicios_tema_8{
    public static void main(String[] args) {
        //Crear un objeto persona en el main.
        Persona persona1 = new Persona();
        persona1.setEdad(20);
        persona1.setTelefono(456465445);

        System.out.println(persona1.getEdad());
        System.out.println(persona1.getTelefono());
    }
}

//Crear clase Persona.
class Persona{
    //Crear variables las privadas edad, nombre y telefono de la clase Persona.
    private int edad;
    private int telefono;
    
    //Crear gets y sets de cada propiedad.
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
