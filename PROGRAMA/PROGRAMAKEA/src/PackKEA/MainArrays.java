package PackKEA;

public class MainArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		// User 1 fer la suma dels elements de sumArray
		// Declaración del arreglo
        int[] SumArray = {4, 36, 4, 23, 867};

        // Variable para almacenar la suma
        int suma = 0;

        // Bucle para recorrer el arreglo y sumar los elementos
        for (int num : sumArray) {
            suma += num;
        }

        // Mostrar el resultado
        System.out.println("La suma de los elementos es: " + suma);
		
		
		// User 2 fer la resta dels elements de subArray
		// Declaración del arreglo
        int[] SubArray = {785675, 56, 5675, 56544, 234};

        // Variable para almacenar la resta
        int resta = 0;

        // Bucle para recorrer el arreglo y resta los elementos
        for (int num : subArray) {
            resta -= num;
        }

        // Mostrar el resultado
        System.out.println("La resta de los elementos es: " + resta);
		
		
		// User 3 fer la multiplicació dels elements de prodArray

		
		int resultado = 1; 
		for (int i = 0; i < prodArray.length; i++) { resultado *= prodArray[i]; }
	}
	
	

    }

