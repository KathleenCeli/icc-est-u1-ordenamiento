#PC 1.1.3

Metodo insertion
![alt text](image-4.png)

En la clase principal (App.java): en el método main, antes de invocar el algoritmo de ordenamiento, agregué System.out.println("--- Selection Insertion ---"); y System.out.println("Original"); para mostrar los encabezados antes de ser ordenados. En el algoritmo (Insertion.java): agregué System.out.println("El aux= " + aux + " se inserta en pos " + (j + 1)); justo después de colocar la variable auxiliar en su posición correcta (arr[j + 1] = aux), para que imprima solo los cambios realizados.   

Resultado
![alt text](image-5.png)
