package torretromp_p1;

public class Empleado {
    String nombre,direccion;
     int id,edad;
     double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String direccion, int id, int edad, double salario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     
}
