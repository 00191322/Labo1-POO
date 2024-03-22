import java.util.Scanner;

public class Main {
    /**
     * Recibe 2 integers y retorna la suma de ambos
     * @param param1
     * @param param2
     * @return
     */
    static int suma(int param1, int param2){
        return param1 + param2;
    }

    /**
     * Recibe 2 integers y retorna la resta de ambos
     * @param param1
     * @param param2
     * @return
     */
    static int resta(int param1, int param2){
        return param1 - param2;
    }

    /**
     * Recibe 2 integers y retorna la division de ambos
     * @param param1
     * @param param2
     * @return
     */
    static int division(int param1, int param2){
        return param1/param2;
    }

    /**
     * Recibe 2 integers y retorna la multiplicacion de ambos
     * @param param1
     * @param param2
     * @return
     */
    static int multiplicacion(int param1, int param2){
        return param1 * param2;
    }

    /**
     * Recibe 1 parametro tipo int, que debe ser el segundo numero de la operacion, y luego
     * evalua si es 0. Si es 0, retorna false y si no es 0 retorna true
     * Esto sirve ya que la division entre 0 no se puede hacer
     * @param param
     * @return
     */
    static boolean validarDivision(int param){
        if(param == 0){
            return false;
        }
        return true;
    }

    static String imprimirEjecucion(int operacion, int param1, int param2){
        StringBuilder sb = new StringBuilder();
        if(operacion == 1){
            sb.append("Suma: ").append(param1).append(" + ").append(param2).append(" = ");
        } else if(operacion == 2){
            sb.append("Resta: ").append(param1).append(" - ").append(param2).append(" = ");
        } else if(operacion == 3){
            sb.append("Division: ").append(param1).append(" / ").append(param2).append(" = ");
        } else if(operacion == 4){
            sb.append("Multiplicacion: ").append(param1).append(" * ").append(param2).append(" = ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // flag que me ayuda a que el menu no cierre
        boolean flag = true, flag2 = true, flag3 = false;
        // 3 variables int para guardar los datos ingresados por el usuario
        int opc1 = 0, opc2 = 0, opc3 = 0, opc4 = 0;
        // Instancia de Scanner para leer datos desde consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la Calculadora\n");
        // Evaluar flag cuando sea true
        while (flag2){
            System.out.println("-- MENU PRINCIPAL --\n"
            + "1- Registrar Numeros\n"
            + "2- Ingresar a la calculadora\n"
            + "3- Salir");
            opc4 = sc.nextInt();
            switch (opc4){
                case 1:
                    System.out.println("Ingrese la primera cifra: ");
                    opc1 = sc.nextInt();
                    System.out.println("Ingrese la segunda cifra: ");
                    opc2 = sc.nextInt();
                    flag3 = true;
                    System.out.println("-- NUMEROS REGISTRADOS --");
                    break;
                case 2:
                    if(flag3){
                        while(flag) {
                            System.out.println("-- CALCULADORA -- \nIngrese una opcion del menu que desea realizar: \n" +
                                    "1- Sumar\n" +
                                    "2- Restar\n" +
                                    "3- Dividir\n" +
                                    "4- Multiplicar\n" +
                                    "5- Salir");
                            opc3 = sc.nextInt();
                            switch (opc3) {
                                case 1:
                                    System.out.println(imprimirEjecucion(opc3, opc1, opc2) + suma(opc1, opc2));
                                    break;
                                case 2:
                                    System.out.println(imprimirEjecucion(opc3, opc1, opc2) + resta(opc1, opc2));
                                    break;
                                case 3:
                                    if(validarDivision(opc2)){
                                        System.out.println(imprimirEjecucion(opc3, opc1, opc2) + division(opc1, opc2));
                                    } else {
                                        System.out.println("No se puede divir entre 0");
                                    }
                                    break;
                                case 4:
                                    System.out.println(imprimirEjecucion(opc3, opc1, opc2) + multiplicacion(opc1, opc2));
                                    break;
                                case 5:
                                    flag = false;
                                    System.out.printf("--Volviendo al menu principal--\n");
                                    break;
                                default:
                                    System.out.println("No es una opcion valida");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("No ha ingresado numeros");
                    }
                    break;
                case 3:
                    flag2 = false;
                    System.out.printf("Gracias por usar el sistema");
                    break;
                default:
                    System.out.println("No es una opcion valida");
                    break;
            }
        }
    }
}
