package PackKEA;

public class MainArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaración del arreglo
        int[] sumArray = {4, 36, 4, 23, 867};

        // Variable para almacenar la suma
        int suma = 0;

        // Bucle para recorrer el arreglo y sumar los elementos
        for (int num : sumArray) {
            suma += num;
        }

        // Mostrar el resultado
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}
