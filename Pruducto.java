/*Crear la clase Producto con los siguientes atributos: id, nombre, marca y
precio (se debe aplicar el encapsulamiento de las propiedades). */

public class Pruducto {
    private int id;
    private String nombre;
    private String marca;
    private double precio;

    

    public Pruducto() {
    }

    
    public Pruducto(int id, String nombre, String marca, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}