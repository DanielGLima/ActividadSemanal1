package InventarioProductos;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("P1","Laptop",12000);
        System.out.println(producto1);

        producto1.setPrecio(8000);

        System.out.println(producto1);;




    }
}
