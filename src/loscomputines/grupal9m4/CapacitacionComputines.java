package loscomputines.grupal9m4;
import java.util.Scanner;



public class CapacitacionComputines {
    
    //Datos Empresa
    // private EmpresaCapacitacion empresa = new EmpresaCapacitacion();
    private EmpresaCapacitacion empresa;
    //Datos Instancia
    private InstanciaCapacitacion instancia;
    //Datos Asistente
    private AsistenteCapacitacion asistente;

    //VARIABLES DE LA CLASE
    //INSTANCIAR = Scanner scan | INICIALIZAR = new Scanner(System.in);
    private Scanner scan = new Scanner(System.in);
    private int asistenteCantidad;
    private AsistenteCapacitacion[] listaAsistentes;

    //CONTADORES
    @SuppressWarnings("unused")
    private int contAsistMenor26Annos;
    @SuppressWarnings("unused")
    private int contAsistMenor36Annos;
    @SuppressWarnings("unused")
    private int contAsistMayor35Annos;

    public CapacitacionComputines() {
        this.empresa = new EmpresaCapacitacion();
        this.instancia = new InstanciaCapacitacion();
        this.contAsistMenor26Annos = 0;
        this.contAsistMenor36Annos = 0;
        this.contAsistMayor35Annos = 0;
    }

    public void datosEmpresa () {
        System.out.println("====================================");
        System.out.println("=== INGRESE DATOS DE LA EMPRESA ====");
        System.out.println("====================================");

        System.out.println("Ingrese rut (sin puntos ni guion): ");
        empresa.setRut( scan.nextInt ()); 
        scan.nextLine ();

        System.out.println("Ingrese Nombre: ");
        empresa.setNombre(scan.nextLine ());

        System.out.println("Ingrese Direccion: ");
        empresa.setDireccion(scan.nextLine ());

        System.out.println("Ingrese  Comuna: ");
        empresa.setComuna(scan.nextLine ());

        System.out.print("Número de teléfono: ");
        empresa.setNumeroTelefono(scan.nextInt ());
        

        System.out.println("=========================");
        System.out.println("=== DATOS GUARDADOS ===");
        System.out.println("=========================");
    }

    public void datosCapacitacion () {
        
        System.out.println("Ingrese dia capacitacion");
        instancia.setDia(scan.nextLine());
        scan.nextLine();
        
        System.out.println("Ingrese Hora de capacitacion");
        instancia.setHora(scan.nextLine());
        
        System.out.println("Ingrese nombre de lugar");
        instancia.setLugar(scan.nextLine());
        
        System.out.println("Ingrese Duracion capacitacion en horas");
        instancia.setDuracion(scan.nextInt ());
        scan.nextLine ();
        
        System.out.println("Ingrese Cantidad Asistente");
        this.asistenteCantidad = scan.nextInt();
        scan.nextLine ();
        
        if (this.asistenteCantidad <= 0){
            do {
                System.out.println("Numero de cantidad de asistente invalida, por favor ingrese numero valido");
                asistenteCantidad = scan.nextInt();
            }while (asistenteCantidad <= 0);
    
        }

        this.listaAsistentes = new AsistenteCapacitacion[asistenteCantidad];
    }

    public void datosAsistentes (){

        for (int posicion = 0; posicion < asistenteCantidad; posicion++) {
            this.asistente = new AsistenteCapacitacion();

            System.out.println("Ingrese los datos del asistente " + (posicion + 1) + ":");
            
            System.out.print("Nombre: ");
            asistente.setNombreAsistente(scan.nextLine());

            System.out.print("Edad: ");
            asistente.setEdadAsistente(scan.nextInt());
            scan.nextLine(); // Consumir el salto de línea después de ingresar la edad

            this.listaAsistentes[posicion] = this.asistente;

            if(asistente.getEdadAsistente() < 26){
                //AUMENTARA EL CONTADOR SOLO CUANDO EL ASISTENTE TENGA MENOS DE 26 AÑOS
                this.contAsistMenor26Annos++;
            } else if(25 < asistente.getEdadAsistente() && asistente.getEdadAsistente() < 36){
                //AUMENTARA EL CONTADOR SOLO CUANDO EL ASISTENTE TENGA 26 A 35 AÑOS
                this.contAsistMenor36Annos++;
            } else {
                //AUMENTARA EL CONTADOR SOLO CUANDO EL ASISTENTE TENGA MAS DE 35 AÑOS
                this.contAsistMayor35Annos++;
            }
        }
    }

     public void mostrarDatosGenerales (){

         // Mostrar resultados
         System.out.println(" _______________________________");
         System.out.println("|      Datos de la empresa:     |");
         System.out.println("|_______________________________|");
         System.out.println("RUT: " + empresa.getRut());
         System.out.println("Nombre: " + empresa.getNombre());
         System.out.println("Dirección: " + empresa.getDireccion());
         System.out.println("Comuna: " + empresa.getComuna());
         System.out.println("Número de teléfono: " + empresa.getNumeroTelefono());

         System.out.println(" _______________________________");
         System.out.println("|    Datos de la capacitacion:  |");
         System.out.println("|_______________________________|");
         System.out.println("\n*** Datos de la capacitación *** ");
         System.out.println("Día: " + instancia.getDia());
         System.out.println("Hora: " + instancia.getHora());
         System.out.println("Lugar: " + instancia.getLugar());
         System.out.println("Duración: " + instancia.getDuracion() + " horas");
         System.out.println("Cantidad de asistentes: " + asistenteCantidad);
         System.out.println("----------------------------------------");
         System.out.println("");
         

    }

    public void pruebaDATOS (){
        System.out.println("Cantidad asistentes mayores a 35 años");
        System.out.println(contAsistMayor35Annos);
        System.out.println("Cantidad asistentes menores a 26 años");
        System.out.println(contAsistMenor26Annos);
        System.out.println("Cantidad Asistentes entre 26 y 35 años");
        System.out.println(contAsistMenor36Annos);
        System.out.println("Cantidad de Asistentes ingresados:");
        System.out.println(asistenteCantidad);
    }

     
}



