import models.Estudiante;

public class Bubble {

    public void sort(int[] arreglo) {
        
        int cambios = 0;
        int comparaciones = 0;
        for(int i = 0; i < arreglo.length; i++) {
            System.out.println("Pasadas " + i);
            boolean combinaciones = false;
            //FOR J
            for (int j = 1; j < arreglo.length - i; j++) {
                //COMPARACIOM IF
                comparaciones++;
                if (arreglo [j - 1] > arreglo[j]) {
                    // INTERCAMBIAR ELEMENTOS
                   cambios++;
                   combinaciones = true;
                   int aux = arreglo[j - 1];
                   arreglo [j - 1] = arreglo[j];
                   arreglo[j] = aux;
                }
            }
            if (!combinaciones) {
                break;
            }
        }
        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
    }
    public void sortEstudiantes(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++) {
            boolean cambio = false;
            //FOR J
            for (int j = 0; j < estudiantes.length - i - 1; j++) {
                //COMPARACIOM IF
                if (estudiantes[j].getNota() > estudiantes[j + 1].getNota()) {
                    // INTERCAMBIAR ELEMENTOS
                    Estudiante aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = aux;
                    cambio = true;
                }
            }
            if (!cambio) {
                break;
            }
        }
    }
}
