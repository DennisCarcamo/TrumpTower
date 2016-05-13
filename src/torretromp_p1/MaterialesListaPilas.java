
package torretromp_p1;

public class MaterialesListaPilas {
    
    private class Nodo
        {
        private String elemento;
        private Nodo siguiente;
        }
    private Nodo primero = null;
    
    
    public boolean estaVacio()
    {
    return (primero == null);
    }
    public void push(String s)
    {
    Nodo nodo= new Nodo();
    nodo.elemento = s;
    nodo.siguiente = primero;
    primero = nodo;
    }
    public String pop(){
    
    if (primero == null )
    
        throw new RuntimeException("pila esta vacia");
    
    String resultado = primero.elemento;
    primero = primero.siguiente;
    return resultado;
    }
    
    public String toSting()
    {
        String resultado = "";
        Nodo este = primero;
        while (este != null)
        {
            resultado += este.elemento + "";
            este = este.siguiente;
            
        } 
        return resultado;
   
    }       
}