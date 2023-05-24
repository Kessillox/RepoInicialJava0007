package losmarinesespaciales.grupales;
import java.util.Scanner;
public class Grupal9Marines {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);
        String name_assist = "";
        int year_assist = 0;
        int menor = 0;
        int entre = 0;
        int mayor = 0;

//		DECLARACIÓN DE VARIABLES
        String input_capacitacion = "";
        String input_id = "";
        String input_rut = "";
        String input_nombre = "";
        String input_direccion = "";
        String input_comuna = "";
        String input_telefono = "";
        String input_nombreCliente = "";
        String input_runCliente = "";
        String input_dia_cap = "";
        String input_hora_cap = "";
        String input_lugar_cap = "";
        String input_duracion_cap = "";
        int input_cantidad_cap = 0;


//		INGRESO DATOS DE CLIENTE
        System.out.println("<<< Ingreso de datos(Cliente) >>>");

//		CAPACITACIÓN
        while (true) {
            System.out.println("Ingrese nombre de la Capacitación");
            input_capacitacion = entrada.nextLine();

            if (input_capacitacion.matches("[a-zA-Z0-9]{2,20}$")) {	//A-Z, ESPACIOS Y DE 2 A 20 CARACTERES
                break;
            } else {
                System.out.println("El nombre ingresado no es válido, ingrese solo letras.");
            }
        }

//		ID
        while (true) {
            System.out.println("Ingrese ID de la Capacitación");
            input_id = entrada.nextLine();
            if (input_id.matches("[a-zA-Z0-9]{1,5}")) {	// ENTRE 1 Y 5 CARACTERES
                break;
            } else {
                System.out.println("ID no válido, máximo 5 caracteres");
            }
        }

//		RUT
        while (true) {
            System.out.println("Ingrese RUT de la Empresa");
            input_rut = entrada.nextLine();
            if (input_rut.matches("[0-9]{7,8}")) {	// ENTRE 7 Y 8 NUMEROS
                break;
            } else {
                System.out.println("RUT no válido, ingrese rut sin digito verificador ni guión");
            }
        }

//		NOMBRE
        while (true) {
            System.out.println("Ingrese Nombre de la Empresa");
            input_nombre = entrada.nextLine();

            if (input_nombre.matches("^[a-zA-Z\\s]{2,20}$")) {	//A-Z, ESPACIOS Y DE 2 A 20 CARACTERES
                break;
            } else {
                System.out.println("El nombre ingresado no es válido, ingrese solo letras.");
            }
        }

//		DIRECCION
        while (true) {
            System.out.println("Ingrese Dirección de la Empresa");
            input_direccion = entrada.nextLine();

            if (input_direccion.matches("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d\\s]+$")) {		//  QUE INCLUYA TANTO LETRAS COMO NUMEROS Y PERMITA ESPACIOS
                break;
            } else {
                System.out.println("dirección no válida (calle y número)");
            }
        }

//		COMUNA
        while (true) {
            System.out.println("Ingrese Comuna");
            input_comuna = entrada.nextLine();

            if (input_comuna.matches("^[a-zA-Z\\s]{2,20}$")) {  // IGUAL QUE NOMBRE, SOLO LETRAS (2 A 20)
                break;
            } else {
                System.out.println("La comuna ingresada no es válida, ingrese solo letras.");
            }
        }

//		TELEFONO
        while (true) {
            System.out.println("Ingrese Teléfono");
            input_telefono = entrada.nextLine();
            if (input_telefono.matches("[0-9]{6,15}")) {		//SOLO NUMEROS ENTRE 6 Y 15 CARACTERES
                break;
            } else {
                System.out.println("teléfono inválido(ingrese de 6 a 15 carácteres de número)");
            }
        }

//		NOMBRE DEL CLIENTE
        while (true) {
            System.out.println("Ingrese Nombre del Cliente");
            input_nombreCliente = entrada.nextLine();

            if (input_nombreCliente.matches("^[a-zA-Z\\s]{2,20}$")) {    //A-Z, ESPACIOS Y DE 2 A 20 CARACTERES
                break;
            } else {
                System.out.println("El nombre ingresado no es válido, ingrese solo letras.");
            }
        }

//		RUN DEL CLIENTE
        while (true) {
            System.out.println("Ingrese RUN del Cliente");
            input_runCliente = entrada.nextLine();
            if (input_runCliente.matches("[0-9]{7,8}")) {	// ENTRE 7 Y 8 NUMEROS
                break;
            } else {
                System.out.println("RUN no válido, ingrese rut sin digito verificador ni guión");
            }
        }

//		INGRESO DATOS CAPACITACIÓN
        System.out.println("<<< Ingreso de datos(Capacitación) >>>");

//		FECHA
        while (true) {
            System.out.println("Ingrese Fecha (formato dd/mm/aaa)");
            input_dia_cap = entrada.nextLine();

            if (input_dia_cap.matches("\\d{2}/\\d{2}/\\d{4}")) {  //SOLO NUMEROS Y '/' EN FORMATO  22/22/4444
                break;
            } else {
                System.out.println("Día ingresado no válido");
            }
        }

//		HORA
        while (true) {
            System.out.println("Ingrese Hora (formato 00:00)");
            input_hora_cap = entrada.nextLine();

            if (input_hora_cap.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")) {  //SOLO NUMEROS Y ':' EN FORMATO  23:59 RESPETANDO VALORES
                break;
            } else {
                System.out.println("Hora no válida");
            }
        }

//		LUGAR
        while (true) {
            System.out.println("Ingrese lugar");
            input_lugar_cap = entrada.nextLine();

            if (input_lugar_cap.matches("^[a-zA-Z0-9\\s]{4,40}$")) {	//NUMEROS Y/O LETRAS DE 4 A 40 CARACTERES
                break;
            } else {
                System.out.println("Lugar no válido, faltan caracteres, min 3.");
            }
        }


//		DURACIÓN
        while (true) {
            System.out.println("Ingrese duración (número y, horas o días");
            input_duracion_cap = entrada.nextLine();

            if (input_duracion_cap.matches("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d\\s]+$")) {		// AL IGUAL QUE DIRECCION NUMERO Y TEXTO
                break;
            } else {
                System.out.println("duración no válida, ingrese número horas o días, etc");
            }
        }


//		CANTIDAD ASISTENTES

        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Ingrese cantidad de asistentes:");

            if (entrada.hasNextInt()) {			//hasNextInt: VERIFICA SI ES UN ENTERO
                input_cantidad_cap = entrada.nextInt();

                if (input_cantidad_cap > 0) {
                    inputValido = true;
                } else {
                    System.out.println("La cantidad de asistentes debe ser mayor a 0. Inténtelo de nuevo.");
                }
            } else {
                System.out.println("Debe ingresar un número entero. Inténtelo de nuevo.");
                entrada.next(); // DESCARTA ENTRADA INVALIDA
            }
        }


        //	FOR PARA LLENAR INFO SEGÚN CANTIDAD DE ASISTENTES
//		Scanner entrada2 = new Scanner(System.in); // NO ERA NECESARIO HACER UN NUEVO SCANNER SOLO VOLVER A INSTANCIARLO PARA CADA ITERACION
        for(int i = 0; i < input_cantidad_cap; i++) {
            entrada = new Scanner(System.in);

            //NOMBRE ASISTENTE
            while (true) {
                System.out.println("Ingrese nombre del asistente");
                name_assist = entrada.nextLine();

                if (name_assist.matches("^[a-zA-Z\\s]{2,20}$")) {      //  A-Z (2 A 20 CARACTERES)
                    break;
                } else {
                    System.out.println("Nombre ingresado no válido, ingrese solo letras.");
                }
            }

            //EDAD ASISTENTE
            while (true) {
                System.out.println("Ingrese edad asistente");
                if(entrada.hasNextInt()) {
                    year_assist = entrada.nextInt();		//hasNextInt: VERIFICA SI ES UN ENTERO
                    if (year_assist > 1 && year_assist < 100) {
                        break;
                    } else {
                        System.out.println("Revise edad ingresada");
                    }
                }else {
                    System.out.println("Debe ingresar un número entero");
                    entrada.next();
                }
            }

            if(year_assist < 25) {
                menor++;
            }else if(year_assist >= 26 && year_assist <= 35) {
                entre++;
            }else {
                mayor++;
            }

        }

        System.out.println("____________________________________");
        System.out.println();
        System.out.println("<<<< CAPACITACIÓN " + input_capacitacion + " (" + input_id + ") >>>>");
        System.out.println();
        System.out.println("<<<<     DATOS EMPRESA     >>>>");
        System.out.println("RUT Empresa: " + input_rut);
        System.out.println("Nombre Empresa: " + input_nombre);
        System.out.println("Dirección: " + input_direccion);
        System.out.println("Comuna: " + input_comuna);
        System.out.println("Teléfono: " + input_telefono);
        System.out.println("Nombre Cliente: " + input_nombreCliente);
        System.out.println("RUN Cliente: " + input_runCliente);
        System.out.println();
        System.out.println("<<<<  DATOS CAPACITACIÓN  >>>>");
        System.out.println("Dia: " + input_dia_cap);
        System.out.println("Hora: " + input_hora_cap);
        System.out.println("Lugar: " + input_lugar_cap);
        System.out.println("Duración: " + input_duracion_cap);
        System.out.println();
        System.out.println("<<<<   DATOS ASISTENTES   >>>>");
        System.out.println("Cantidad de asistentes: " + input_cantidad_cap);
        System.out.println("Asistentes menores a 25 años: " + menor);
        System.out.println("Asistentes entre 26 y 35 años: " + entre);
        System.out.println("Asistentes mayores a 35 años: " + mayor);

        System.out.println("Registro Completo!");


        entrada.close(); // SIN CERRAR SCANNER ARROJABA ADVERTENCIAS
//		entrada2.close();
    }

}
