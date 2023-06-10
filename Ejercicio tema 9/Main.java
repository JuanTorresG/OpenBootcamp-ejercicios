public class Main{
    public static void main(String[] args) {
        //Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        Cliente cliente = new Cliente();
        cliente.edad = 36;
        cliente.telefono = 9498797;
        cliente.nombre = "Carlos";       
        cliente.credito = 6454.50;

        System.out.println("Edad del cliente: " + cliente.edad);
        System.out.println("Teléfono del cliente: " + cliente.telefono);
        System.out.println("Nombre del cliente: " + cliente.nombre);
        System.out.println("Credito del cliente: " + cliente.credito);
    
        //Trabajador 
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 18;
        trabajador.telefono = 8929254;
        trabajador.nombre = "Pedro";       
        trabajador.salario = 1500.50;

        System.out.println("\nEdad del trabajador: " + trabajador.edad);
        System.out.println("Teléfono del trabajador: " + trabajador.telefono);
        System.out.println("Nombre del trabajador: " + trabajador.nombre);
        System.out.println("Salario del trabajador: " + trabajador.salario);
    }
}

// Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
class Persona {
    int edad;
    String nombre;
    int telefono;
}

//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
class Cliente extends Persona{
    double credito;
}

//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
class Trabajador extends Persona{
    double salario;
}
