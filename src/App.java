public class App {
    public static void main(String[] args) throws Exception {
        int [] original = { 5, 3, 4, 1, 2, 6};
        int [] b = original.clone();
        int [] c = original;

        // USAR EL METODO DEL ARCHIVO(clase) BUBBLE
        // INSTANCIAR el archivo BUBBLE
        // INTANCIA la clase BUBBLE
        Bubble buuble = new Bubble();
        // EJECUTAR CODIGO DEL ARCHIVO BUBBLE USO LA INSTANCIA buuble
        printArreglo(b);
        buuble.sort(b);
        printArreglo(b);

        // INSTANCIAR Seleccion
        System.out.println("Selection sort");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);
    }
    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
        }
    }

