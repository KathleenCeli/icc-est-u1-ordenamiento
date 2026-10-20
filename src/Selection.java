public class Selection {

    public void sort(int[] arreglo) {

        int cambios = 0;
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            if (min != i) {
                cambios++;
                System.out.println("Pasada" + i + "|" + "cambio " + arreglo[i] + "<=>" + arreglo[min]);
                // Intercambiar elementos
                int tem = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = tem;
            }
        }
        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
    }
}

