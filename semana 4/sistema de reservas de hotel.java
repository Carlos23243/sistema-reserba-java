//Clase que representa un cliente
public class Cliente {
    String nombre;
    String cedula;

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public void mostrarDatos() {
        System.out.println("Cliente: " + nombre + ", Cédula: " + cedula);
    }
}


//Clase que representa una habitación
public class Habitacion {
    int numero;
    boolean disponible;

    public Habitacion(int numero) {
        this.numero = numero;
        this.disponible = true;
    }

    public void ocupar() {
        disponible = false;
    }

    public boolean estaDisponible() {
        return disponible;
    }
}


//Clase para gestionar reservas
public class Reserva {
    Cliente cliente;
    Habitacion habitacion;

    public Reserva(Cliente cliente, Habitacion habitacion) {
        if (habitacion.estaDisponible()) {
            this.cliente = cliente;
            this.habitacion = habitacion;
            habitacion.ocupar();
            System.out.println("Reserva realizada con éxito.");
        } else {
            System.out.println("La habitación no está disponible.");
        }
    }
}



//Clase principal para probar la interacción entre objetos
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Carlos Arce", "1234567890");
        Habitacion hab101 = new Habitacion(101);

        Reserva reserva1 = new Reserva(cliente1, hab101);
        cliente1.mostrarDatos();
    }
}


