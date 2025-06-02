/*En una nueva clase que implemente el método main, se deberá hacer el
registro de productos solicitando los datos al usuario, los productos serán
almacenados en una colección de tipo ArrayList. El programa deberá seguir
solicitando datos de productos hasta que el usuario decida detener el
registro de datos. */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;  


public class main {
    public static void main(String[] args) {
        ArrayList<Pruducto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el ID del producto: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la marca del producto: ");
            String marca = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer

            Pruducto producto = new Pruducto(id, nombre, marca, precio);
            productos.add(producto);

            System.out.print("¿Desea registrar otro producto? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println("\nProductos registrados:");
       Iterator<Pruducto> it = productos.iterator();
        while (it.hasNext()) {
            Pruducto p = it.next();
            System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre() +
                               ", Marca: " + p.getMarca() + ", Precio: " + p.getPrecio());
        }
        scanner.close();
    }
}