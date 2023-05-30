// 1.- El nombre del package es Clase11 debe tener el nombre en minusculas y el nombre del paquete correcto
package losmarinesespaciales.luisindividuales.individual21;

// 2.- El nombre de la clase es _EJempl01 y debe ser con la primera letra en mayusculas sin _ y correspondiente a la clase que se va a trabajar
public class Individual21 {
    public static void main (String args[]) {

        // 3.- El nombre de la variable debe ser descriptivo y no comenzar por $

        int numero1 = 5;

        // 4.- El nombre de la variable no debe ser Var1 debe ser en minusculas y descriptiva

        // 5.- El valor del String debe estar bien entrecomillado, las lineas deben ser de un largo
        //     no mayor a 80 caracteres para efectos de su legibilidad y bien concatenado

        String mensaje = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo \n" +
                         "que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco \n" +
                         "y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más \n" +
                         "noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de \n" +
                         " añadidura los domingos, consumían las tres partes de su hacienda. \n" +
                         "El resto della concluían sayo de velarte, calzas de \n" +
                         "velludo para las fiestas, con sus pantuflos de lo \n" +
                         "mesmo, y los días de entre semana se honraba con su" +
                         "vellorí de lo más fino.";

                          // 6.- El resto della concluían sayo de velarte, calzas de no debe estar como comentario si no que debe estar incluido en el mensaje

                         // 7.- velludo para las fiestas, con sus pantuflos de lo mesmo, Tampoco debe estar comentado, debe estar en el mensaje

                         // 8.- y los días de entresemana se honraba con su Tampoco debe estar comentado, debe estar en el mensaje y entresemana sebe separarse a entre semana

                         // 9.- vellorí de lo más fino Tampoco debe estar comentado, debe estar en el mensaje

        // 10.- otraCosa esta bien escrito pero debe ser descriptivo e inicializado en ojala en la misma linea y con un espacio entre el valor y el operador de asignacion =

        int numero2 = 6;

        // 11.- Falta el + para concatenar el String con la variable

        System.out.println("El valor de la primera variable es " + numero1 + " y de la segunda es " + numero2);

        // 12.- En el String hay que concatenar el mensaje para que tenga sentido e imprimir el cuento

        System.out.println("¿Te cuento un cuento?: " + mensaje);
    }
}
