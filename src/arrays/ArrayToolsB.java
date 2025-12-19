package arrays;
//crear documentación de la clase
public class ArrayToolsB {
//crear el constructor privado

    //crear documentación y test
    //metodo que suma o resta los valores de un array, dependiendo de la operación
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
    //crear metodo que cuenta el número de ceros de un array de enteros
    public static Integer countNumberOfZeros (int[] array) {
        return null; //cambiar
    }
    //metodo que nos dice si todos los elementos del array son iguales o no.
    //crear test y documentación
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
    //crear metodo que recibe un array de cadenas y devuelve  un array
    //donde las posiciones están invertidas, la primera cadena es la última
    //la última es la primera y así sucesivemente
    public static String[] changeOrderArray(String[] array) {
        return null; //cambiar ésto
    }

}
