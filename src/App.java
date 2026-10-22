import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        runEjemplosPrimitivos();
        runEjemplosObjetos();
        runComparators();
    } 
    private static void runComparators() {
       Integer[] original = { 5, 6, 4, 1, 2, 3};
       //Array.sort -> Ordena arreglos por su orden natural, de menor a mayor
       Arrays.sort(original);
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " - ");
       }
       System.out.println("---------");
    
       Arrays.sort(original, Comparator.reverseOrder());
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " - ");
       }

    }
    private static void runEjemplosObjetos() {

        Estudiante e1 = new Estudiante ("Juan", 10);

        Estudiante[] estudiantes ={e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8),
        };
        Bubble b = new Bubble();
        b.sortEstudiantes(estudiantes);
        printArreglo(estudiantes);
    }

    public static void printArreglo(Estudiante[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Estudiante e = arr[i];
        System.out.println(e.getNombre() + " - " + e.getNota());
        }
    }


    public static void runEjemplosPrimitivos() {
        int [] original = { 5, 3, 4, 1, 2, 6};
        int [] b = original.clone();
        int [] c = original;
        int [] d = original.clone();

        // USAR EL METODO DEL ARCHIVO(clase) BUBBLE
        // INSTANCIAR el archivo BUBBLE
        // INTANCIA la clase BUBBLE
        Bubble buuble = new Bubble();
        // EJECUTAR CODIGO DEL ARCHIVO BUBBLE USO LA INSTANCIA buuble
        System.out.println("----Bubble sort----");
        printArreglo(b);
        buuble.sort(b);
        printArreglo(b);

        // INSTANCIAR Seleccion
        System.out.println("----Selection sort----");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        // INSTANCIAR Insertion
        System.out.println("----Insertion sort----");
        System.out.println("Original");
        printArreglo(d);

        Insertion insertion = new Insertion();
        insertion.sort(d);
        System.out.println("Ordenado");
        printArreglo(d);
    }
    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
        }
        
}

