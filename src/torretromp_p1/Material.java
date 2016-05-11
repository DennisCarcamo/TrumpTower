
package torretromp_p1;

public class Material {
    String nombre,descripcion, marca;
     int numeroDeSerie;
   
    public Material() {
    }

    public Material(String nombre, String descripcion, String marca, int numeroDeSerie) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.numeroDeSerie = numeroDeSerie;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String direccion) {
        this.descripcion = direccion;
    }

    public int getnumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setnumeroDeSerieId(int id) {
        this.numeroDeSerie = numeroDeSerie;
    }

 

   
     
}
