package InventarioProductos;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        if (precio >= 0) {
            this.precio = precio;
        }else{
            System.out.println("el precio es negativo");
        }
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    @Override
    public String toString(){
        return "Codigo: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio;
    }
}
