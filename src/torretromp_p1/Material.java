
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getnumeroDeSerie() {
        return numeroDeSerie;   
    }

    public void setnumeroDeSerieId(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   
     
}
