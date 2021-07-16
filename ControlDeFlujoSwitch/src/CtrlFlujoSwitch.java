
public class CtrlFlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch(condicion) {
		 * case valor:
		 * codigo
		 * codigo
		 * codigo
		 * break;
		 *case valor2:
		 * codigo
		 * codigo
		 * codigo
		 *break;
		 *default:
		 * codigo por defecto
		 *}
		 */
		
		int dia = 1;
		String mensaje = "";
		
		switch (dia) {
		case 1:
			mensaje = "Lunes";
			break;
		case 2:
			mensaje = "Martes";
			break;
		case 3:
			mensaje = "Miércoles";
			break;
		case 4:
			mensaje = "Jueves";
			break;
		case 5:
			mensaje = "Viernes";
			break;
		case 6:
			mensaje = "Sábado";
			break;
		case 7:
			mensaje = "Domingo";
			break;
		default:
			mensaje = "Día inválido";
			break;
		}
		
		System.out.println(mensaje);
		
		/*
		 * Crear una calculadora que pueda sumar, restar, multiplicar 
		 * y divididr dos numeros.
		 * La calculadora debe pedir los dos números y posteriormente,
		 * preguntar qué operación se quiere realizar, el menú es el siguiente:
		 * 1. Suma
		 * 2. Resta
		 * 3. Multiplicación
		 * 4. División
		 * 
		 * Al final debe mostrar la operación
		 * Nota: Se debe usar el switch
		 */

	}

}
