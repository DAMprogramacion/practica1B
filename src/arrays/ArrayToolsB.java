package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Clase que contiene varios metodos que actuán sobre arrrays de varios tipos
 * @author manuel
 * @version 1.0
 */
public class ArrayToolsB {
//crear el constructor privado

    private ArrayToolsB() {
    }

    /**
     * <p>Metodo estático que opera sobre un array de enteros dada una operación de suma o resta</p>
     * <ol>
     *     <li>Si recibe un null, devuelve un null</li>
     *     <li>Si recibe como operador algo distinto a los caracters + ó -, devuelve un null</li>
     *     <li>Si recibe un array vacío y los caracters + ó -, devuelve cero</li>
     *     <li>Si recibe un array  y los caracters + ó -, devuelve o la suma de los valores o la resta</li>
     *     <li>Ejemplo [1,2] y + devuelve 3</li>
     *     <li>Ejemplo [1,2] y - devuelve -3</li>
     * </ol>
     * @param array de números enteros, puede ser un array vacío
     * @param operation que puede ser + ó -
     * @return null, cero o el valor de la operación correspondiente
     */
    public static Integer getSubstractOrSum (int[] array, char operation ) {
        if (array == null || !(operation == '+' || operation == '-'))
            return null;
        if (array.length == 0)
            return 0;

        int result = 0;
        if (operation == '+')
            for (int number : array)
                result += number;
        else
            for (int number : array)
                result -= number;

        return result;

    }

    /**
     * xxxxxx
     * @param array
     * @return
     */
    public static Integer countNumberOfZeros (int[] array) {
        if (array == null) return null;
        int counter0 = 0;
        for (int number : array) {
            if (number == 0) counter0++;
        }
        return counter0; //cambiar
    }

    /**
     * xxxxxxxxxxxxxxxxx
     * @param array
     * @return
     */
    public static Boolean isSeemItems(int[] array) {
        if (array == null) return null;
        if (array.length == 0) return false;
        if (array.length == 1) return true;
        int item = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] != item)
                return false;
        }
        return true;
    }

    /**
     * xxxxxxxxxxxxxxxxxxxxxxxxxxx
     * @param array
     * @return
     */
    public static String[] changeOrderArray(String[] array) {
        if (array == null || array.length == 0 || array.length == 1) return array;
       /* List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        int size = array.length;
        String[] arrayRerverse = new String[size];
        for (int i = 0; i < size; i++) {
            arrayRerverse[i] = list.get(i);
        }*/ //metodo poco eficiente, se debería cambiar con un único bucle for
        int size = array.length;
        String[] arrayRerverse = new String[size];
        for (int i = 0; i < size ; i++) {
            arrayRerverse[i] = array[size -1 -i];
        }
        return arrayRerverse;

    }



}
