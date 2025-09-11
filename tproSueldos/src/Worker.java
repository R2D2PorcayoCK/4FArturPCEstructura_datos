public class Worker {
    private int id; 
    private String nombre;
    private float sueldo;
    

    public class Empleado {
    private int id;
    private String nombre;
    private double sueldo;


    // Constructor vacío
    public Empleado() {
    }


    // Constructor lleno
    public Empleado(int id, String nombre, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }


    // Getter y Setter para id
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // Getter y Setter para sueldo
    public double getSueldo() {
        return sueldo;
    }


    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    }


}