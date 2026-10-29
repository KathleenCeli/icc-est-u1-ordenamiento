import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import models.Estudiante;
public class Comparators {

    private List<Estudiante>estList;
    private Estudiante[] estArray;
    
    
    public Comparators() {
        Estudiante e1 = new Estudiante ("Juan", 10);

        estArray = new Estudiante[] {e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 7 ),
            new Estudiante("Pedro", 6.8),
        };
        estList = new ArrayList<>(List.of(estArray));

        //Llamada a los ejemplos
        ejemplo1();
        ejemplo2();
        ejemplo3();
        ejemplo4();
        ejemplo5();
        ejemplo6();
        ejemplo7();
        ejemplo8();
        ejemplo9();
        ejemplo10();
        ejemplo11();
    }
    private void print(List<Estudiante> list) {
        for(Estudiante est : list) {
            System.out.println(est);
        }
    }
    /**
     * Comparator -> por Valor
     * Lamba extractora directa: nota ascendente
     */
    public void ejemplo1() {
        //Copiar el arreglo global
        System.out.println("Ejemplo 1");
        List<Estudiante> lista = new ArrayList<>(estList);
        //comparator -> objeto que no es envolvente de primitivo ni String
        Comparator<Estudiante> comparador = Comparator.comparingDouble(x -> x.getNota());
        lista.sort(comparador);
        //imprimir
        print(lista);

    }
    /**
     * Ordenar por nota ascendentemente
     * Comparator -> por Valor
     * Por referencia
     */
    public void ejemplo2() {
        System.out.println("Ejemplo 2");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante::getNota);
        lista.sort(comparator);
        //imprimir
        print(lista);
    }

    public void ejemplo3() {
        System.out.println("Ejemplo 3");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante::getNota).reversed();
        lista.sort(comparator);
        //imprimir
        print(lista);
    }
    /**
     * Ordenar por nombre
     * Comparator -> por Valor
     * Por referencia
     */

    public void ejemplo4() {
        System.out.println("Ejemplo 4");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparing(Estudiante::getNombre);
        lista.sort(comparator);
        //imprimir
        print(lista);
    }
    /**
     *  Ordenar por nota ascendentemente
     * Comparator -> por dos items
     *  
     */
    public void ejemplo5() {
        System.out.println("Ejemplo 5");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2) -> Double.compare(e1.getNota(), e2.getNota());
        lista.sort(comparator);
        //imprimir
        print(lista);
    }
    /**
     *  Ordenar por nombre ascendentemente
     * Comparator -> compara dos items
     * lamba
     */
    public void ejemplo6() {
        System.out.println("Ejemplo 6");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2) -> e1.getNombre().compareTo(e2.getNombre());
        lista.sort(comparator);
        //imprimir
        print(lista);
    }
    /**
     *  Ordenar por nota descendente
     * Comparator -> compara dos items
     * lamba
     */
    public void ejemplo7() {
        System.out.println("Ejemplo 7");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2) -> Double.compare(e2.getNota(), e1.getNota());
        lista.sort(comparator);
        //imprimir
        print(lista);
    }

    /**
     *  Ordenar por nota asendente y nombre Descendente
     * Comparator -> compara dos items
     * lamba
     */
    public void ejemplo8() {
        System.out.println("Ejemplo 8");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2) -> {
            int notaComparacion = Double.compare(e1.getNota(), e2.getNota());
            if (notaComparacion != 0) {
                return notaComparacion;
            }
            return e2.getNombre().compareTo(e1.getNombre());
        };
        lista.sort(comparator);
        //imprimir
        print(lista);
    }

    /**
     *  Ordenar por nota ascendente y nombre Ascendente
     * Comparator -> por valor
     * referencias 2 comparadores
     */
    public void ejemplo9() {
        System.out.println("Ejemplo 9");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator
                .comparingDouble(Estudiante::getNota)
                .thenComparing(Estudiante::getNombre);
        lista.sort(comparator);
        //imprimir
        print(lista);
    }

    /**
     *  Ordenar por nota descendente y nombre Ascendente
     * Comparator -> por valor
     * 1 comparador lambda
     * 2 comparador por referencia
     */
    public void ejemplo10() {
        System.out.println("Ejemplo 10");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator
                .comparingDouble((Estudiante e) -> e.getNota()).reversed()
                .thenComparing(Estudiante::getNombre);
        lista.sort(comparator);
        //imprimir
        print(lista);
    }

    /**
    * Ordenar por nota ajustada ASCENDENTE y NOMBRE DESCENDENTE.
    * Sumar 2 puntos si la nota es menor que 7.
    * La nota máxima permitida es 10.
    * Comparator -> por valor calculado.
    * 1 comparator lambda con bloque de instrucciones.
    * 2 comparator referencia con orden inverso.
    */
    public void ejemplo11() {
        System.out.println("Ejemplo 11");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator .comparingDouble((Estudiante e) -> {
            double notaAjustada = e.getNota();
            if (notaAjustada < 7) {
                notaAjustada += 2;
                if (notaAjustada > 10) {
                    notaAjustada = 10;
                }
            }
            return notaAjustada;
        }).thenComparing(Comparator.comparing(Estudiante::getNombre).reversed());
        lista.sort(comparator);
        //imprimir
        print(lista);
    }

}
