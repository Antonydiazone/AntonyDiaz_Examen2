/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antob
 */
public class JavaApplication28 { private static final int contadorIds = 1;

    private final int id = 0;
    private int cantidad;
    private String nombre;
    private final double precioUnitario = 0;
    private String estado;

   

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> agregarProducto();
                case 2 -> buscarProducto();
                case 3 -> listarProductos();
                case 4 -> modificarProducto();
                case 5 -> venderProducto();
                case 6 -> System.out.println("Saliendo del programa. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 6);
    }

    

    /**
     * @param args the command line arguments
     */
   
  private static final ArrayList<Producto> inventario = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
 private static void mostrarMenu() {
        System.out.println("\n----- Sistema de Inventario -----");
        System.out.println("1. Agregar producto");
        System.out.println("2. Buscar producto");
        System.out.println("3. Listar productos");
        System.out.println("4. Modificar producto");
        System.out.println("5. Vender producto");
        System.out.println("6. Salir");
        System.out.print("Ingrese su opción: ");
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la cantidad en el almacén: ");
        int cantidad = scanner.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();
    Producto nuevoProducto = null;

        
        inventario.add(nuevoProducto);

        System.out.println("Producto agregado con éxito. ID del producto: " + nuevoProducto.getId());
    }

    private static void buscarProducto() {
        System.out.print("Ingrese el nombre o el ID del producto: ");
        String consulta = scanner.nextLine();

        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(consulta) || String.valueOf(producto.getId()).equals(consulta)) {
                System.out.println("Producto encontrado:");
                imprimirDetallesProducto(producto);
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    private static void listarProductos() {
        System.out.println("----- Lista de Productos -----");
        for (Producto producto : inventario) {
            imprimirDetallesProducto(producto);
        }
    }

    private static void imprimirDetallesProducto(Producto producto) {
        System.out.println("ID: " + producto.getId());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Cantidad en el almacén: " + producto.getCantidad());
        System.out.println("Precio Unitario: $" + producto.getPrecioUnitario());
        System.out.println("Estado: " + producto.getEstado());
        System.out.println("-----------------------------");
    }

    private static void modificarProducto() {
        System.out.print("Ingrese el ID del producto que desea modificar: ");
        int idProducto = scanner.nextInt();

        for (Producto producto : inventario) {
            if (producto.getId() == idProducto) {
                System.out.println("Seleccione el atributo que desea modificar:");
                System.out.println("1. Nombre");
                System.out.println("2. Cantidad en el almacén");
                System.out.println("3. Precio Unitario");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea pendiente

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el nuevo nombre: ");
                        String nuevoNombre = scanner.nextLine();
                        producto = modificarAtributo(producto, nuevoNombre);
                    }
                    case 2 -> {
                        System.out.print("Ingrese la nueva cantidad en el almacén: ");
                        int nuevaCantidad = scanner.nextInt();
                        scanner.nextLine(); // Consumir la nueva línea pendiente
                        producto = modificarAtributo(producto, nuevaCantidad);
                    }
                    case 3 -> {
                        System.out.print("Ingrese el nuevo precio unitario: ");
                        double nuevoPrecio = scanner.nextDouble();
                        scanner.nextLine(); // Consumir la nueva línea pendiente
                        producto = modificarAtributo(producto, nuevoPrecio);
                    }
                    default -> System.out.println("Opción no válida.");
                }

                System.out.println("Producto modificado con éxito.");
                imprimirDetallesProducto(producto);
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    private static <T> Producto modificarAtributo(Producto producto, T nuevoValor) {
    switch (nuevoValor) {
        case String string -> producto.setNombre(string);
        case Integer integer -> producto.setCantidad(integer);
        case Double aDouble -> producto.setPrecioUnitario(aDouble);
        default -> {
        }
    }

        return producto;
    }

    private static void venderProducto() {
        System.out.println("----- Productos Disponibles -----");
        for (Producto producto : inventario) {
            if (producto.getEstado().equalsIgnoreCase("Disponible"){
                imprimirDetallesProducto(producto);
            } else {
            }
        }

        System.out.print("Ingrese el ID del producto que desea vender: ");
        int idProducto = scanner.nextInt();

        for (Producto producto : inventario) {
            if (producto.getId() == idProducto) {
                if (producto.getEstado().equalsIgnoreCase("Disponible")){
                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantidadVenta = scanner.nextInt();
                    
                    if (cantidadVenta > 0 && cantidadVenta <= producto.getCantidad()) {    
                        
                        
                    }
                } else {
                }
            }
        }
    }
}

    

        

        