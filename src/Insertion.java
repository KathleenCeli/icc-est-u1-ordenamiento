public class Insertion {
    public void sort(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] <aux) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;

            System.out.println("El aux = " + aux + " se inserta en la pos " + (j + 1));
        }
    }
}
