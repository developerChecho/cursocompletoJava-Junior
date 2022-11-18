/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
     /*ENTRADA Y SALIDA
      String name;
      Integer edad;
      String profesion;
      Integer añoexperiencia;

       name = JOptionPane.showInputDialog("digite su nombre");
       edad = Integer.parseInt(JOptionPane.showInputDialog("digite su edad"));
       profesion = JOptionPane.showInputDialog("Cual es su profesion");
       añoexperiencia =Integer.parseInt(JOptionPane.showInputDialog("cuantos años tiene de experiencia"));
        JOptionPane.showMessageDialog(null,"su nombre es " + name );
        JOptionPane.showMessageDialog(null,"su edad es " +edad);
        JOptionPane.showMessageDialog(null,"su profesion es " +profesion);
        JOptionPane.showMessageDialog(null," tienes " +añoexperiencia + "años de experiencia"); }*/

    //operadores aritmeticos

      /*  package operadores;
        import java.util.Scanner;

        public class operadores{

                public static void main(String[] args) {
                        Scanner caluladora= new Scanner(System.in);
                        float numero1,numero2,suma,resta,division,multiplicacion,resto;
                        System.out.printf("por favor digite dos numeros");
                         numero1=caluladora.nextFloat();
                         numero2=caluladora.nextFloat();
                         suma= numero1+numero2;
                         resta=numero1-numero2;
                         division=numero1/numero2;
                         multiplicacion=numero1*numero2;
                         resto=numero1%numero2;
                        System.out.printf("la suma es " + suma);
                        System.out.printf("la resta es "+ resta);
                        System.out.printf("la division es "+ division);
                        System.out.printf("la multiplicacion es "+ multiplicacion);
                        System.out.printf("el residuo es " + resto);

                }

        }
         */

          //operadores aritmeticos con ingremento y decremento//

/*package operadores;
import java.util.Scanner;

public class operadores{

    public static void main(String[] args) {
        int x=5, y;
        y = --x;
        System.out.println(y);
        System.out.println(x);

    }

}
*/

              // clase math//

package operadores;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class operadores {

    public static void main(String[] args) {

        /*double raiz = Math.sqrt(9);
        System.out.println(raiz);

         */
      /*  double base=5, exponente = 2; // la base y un exponente//
        double resultado= Math.pow(base,exponente);
        System.out.println(resultado);

        // ejercicio 1 sumar tres calificaciones
        Scanner calificaciones = new Scanner(System.in);
        float nota1, nota2, nota3,suma;
        // guardamos las tres notas
        System.out.print("digite las tres calificaciones ");
        nota1=calificaciones.nextFloat();
        nota2=calificaciones.nextFloat();
        nota3= calificaciones.nextFloat();
        suma= nota1 + nota2 + nota3;
        System.out.println("el resultado final de las notas es "+ suma);*/

        /* Ejercicio 2 hacer un programa que calcule y  imprima  el salario semanal
         apartir de sus horas semanales trabajadas y su salario por hora


         Scanner salario = new Scanner(System.in);
          float salarioPorhora, horasTrabajadas, totalSemanal,suma,multipicacion;
        System.out.print("ingrese por favor el valor de salario por hora ");
        salarioPorhora=salario.nextFloat();
        System.out.print("ingrese el numero de horas trabajadas");
        horasTrabajadas=salario.nextFloat();
        suma = salarioPorhora * horasTrabajadas  ;
        System.out.println("su salario semanal es " + suma); */

        /*  ejercicio 3
        guillermo tiene N dolares. Luis tiene la mitad de lo que posee guillermo. Juan
        tiene la mitad de lo que poseen guillermo y luis juntos hacer un programa que calcule lo que
        la cantidad de dinero que tienen los tres

        Scanner dinero = new Scanner(System.in);
        float N1, N2, N3,suma;
        System.out.print("ingrese la cantidad de dinero de guillermo");
        N1= dinero.nextFloat();
        N2=N1/2;
        N3=(N1+N2)/2;
        suma= N1+N2+N3;
     System.out.println("el valor total que tienen entre los tres es "+ suma);*/
                  /* ejercicio 4
       una compañia de venta de carros usados le paga a un empelado  un salario de 1000 + 150
       de comision po   r cada carro vendido + 5% del valor de carro vendido. imprima el valor total del salario
       de un empleado al mes.



        Scanner carro =new Scanner(System.in);
        final int salario= 1000;
        int carroVendido;
        System.out.print("cuantos carros ha vendido");
        carroVendido=carro.nextInt();
        float valorCarro;
        System.out.print("el valor del carro es ");
        valorCarro=carro.nextFloat();
        float totalSalario;
        totalSalario= salario + (carroVendido*150) + (0.05f*valorCarro);
        System.out.println("su salario mensual es " + totalSalario);


         // Ejecicio haga un programa que calcule notas de los estudiantes
        Scanner calificacion = new  Scanner(System.in);
        float participación;
        System.out.print("Porvaor ingresa la nota de participacion");
        participación=calificacion.nextFloat();
        float primerExamen;
        System.out.print("Porfavor ingresa la calificacion del primer examen");
        primerExamen=calificacion.nextFloat();
        float  segundoExamen;
        System.out.print("por favor ingresa la calificacion del segundo examen");
        segundoExamen=calificacion.nextFloat();
        float  examenFInal;
        System.out.print("ingresa la nota del examen final");
        examenFInal=calificacion.nextFloat();
        float resultado;
        resultado = (0.10f*participación) + (0.25f*primerExamen) +
                (0.25f*segundoExamen) + (0.40f*examenFInal) ;
        System.out.println("su caliciacion es fina es "+ resultado);


        Scanner cuadro=new Scanner(System.in);
        double a , b , resultado;
        System.out.print("digite el valor de a");
        a=cuadro.nextDouble();
        System.out.print("digite el valor de b");
        b=cuadro.nextDouble();
        resultado = Math.pow(a,2) + Math.pow(b,2) + (2*a*b);
        System.out.println("el resultado es " + resultado);

       Scanner tiempo = new Scanner(System.in);
       int semanas,dias,horas,horasTotales;
        System.out.print("digita las horas ");
        horas=tiempo.nextInt();

         semanas = dias / 168;
         dias = horas%168 /24;
         horas= horasTotales%24;
        System.out.print("su valor equivale a " );
        System.out.println("semanas" + semanas);
        System.out.println("dias"+ dias);
        System.out.println("horas" + horas); */
        //condicionales//
         /*
            == : igualadad
            != : diferente
            > :  mayor
            >=:  mayor o igual
            < :  menor
            >= : menor o igual
          */
       /* int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite el numero"));
        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "el numero es 5");
        } else {
            JOptionPane.showMessageDialog(null,"el numero es diferente a 5");
        }

      int dato;
      dato=Integer.parseInt(JOptionPane.showInputDialog("digite un numero del 1 al 5"));
      switch (dato){
          case 1: JOptionPane.showMessageDialog(null,"este es el numero  1");
                 break;
          case 2: JOptionPane.showMessageDialog(null," este es le numero 2");
                 break;
          case 3: JOptionPane.showMessageDialog(null,"este es el numero 3");
                 break;
          case 4: JOptionPane.showMessageDialog(null,"este es el numero 4");
                 break;
          case 5: JOptionPane.showMessageDialog(null,"este es el numero 5");
                 break;
          default: JOptionPane.showMessageDialog(null,"este numero esta fuera del rango del 1 a 5");
      }*/

       /* String vehiculos;
        vehiculos=JOptionPane.showInputDialog("digite solo vehiculos renault");
           switch (vehiculos){
               case "duster": JOptionPane.showMessageDialog(null,"esta es una duster");
                    break;
               case  "symbol": JOptionPane.showMessageDialog(null,"esta es un symbol");
                    break;
               case "sandero":  JOptionPane.showMessageDialog(null,"este es un sandero");
                    break;
               default: JOptionPane.showMessageDialog(null,"la referencia que buscas no es renault");
           }*/

                     /*
                     ejercicio 1 hacer un programa que lea un numero entero y lea si es multiplo de 10
                      */
/*
                     int entero;
                       entero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero que sea multiplo de 10"));
                       if (entero%10==0){
                           JOptionPane.showMessageDialog(null,"el numero" + entero + " es multiplo de 10");

                       } else {
                           JOptionPane.showMessageDialog(null,"el numero no es multiplo de 10");
                       }*/

                               /*int numero1,numero2;
                               numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa un numero"));
                               numero2=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa un numero"));

                               if (numero1>numero2){
                                   JOptionPane.showMessageDialog(null,"el numero" + numero1 + " es mayor a el " + numero2);
                               } else if (numero2 > numero1){
                                   JOptionPane.showMessageDialog(null,"el numero "+ numero2 + "es mayor que el " + numero1);
                               } else {
                                   JOptionPane.showMessageDialog(null, + numero1+ " y " + numero2 + " son iguales");
                               }*/


                         /*  char letra ;
                           letra=JOptionPane.showInputDialog("ingrese una letra").charAt(0);
                            if (Character.isUpperCase(letra)){
                                JOptionPane.showInputDialog(null,"la letra "+ letra + "es mayucula ");
                            } else if (Character.isLowerCase(letra)) {
                                JOptionPane.showInputDialog(null,"LA LETRA " + letra + " es minuscula ");
                            } else {
                                JOptionPane.showMessageDialog(null," error porfavor inserta una letra ");
                            }*/

                                   /*float compra;
                                   float  descuento;
                                   float resultado;
                                   compra=Float.parseFloat(JOptionPane.showInputDialog("ingrese el valor de su compra"));

                                   if (compra> 300){
                                       descuento = compra * 0.20f;
                                       compra -= descuento;
                                        JOptionPane.showMessageDialog(null," tienes un  20 % de descuento por la compra de valor "
                                        + compra );
                                   } else  {
                                       JOptionPane.showMessageDialog(null, "su compra no tiene descuentos");
                                   }*/


                                          // ejercicio 5 //
                               /*  float salario;
                                 int horaExtra;
                                 int horasTrabajadas;
                                 double total;
                                 horasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de trabajo del Empleado"));

                                 if (horasTrabajadas<=40){
                                     salario = horasTrabajadas * 16;
                                     JOptionPane.showMessageDialog(null,"su salario es " + salario);
                                 } else {

                                     salario = (40*16) + ((horasTrabajadas-40)*20);



                                        JOptionPane.showMessageDialog(null,"Su salario es "+ salario);
                                 }*/


                                      // decifrar cuantas cifras tiene un numero//

                    /* int numero;
                       numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                       if (numero < 10){
                           JOptionPane.showMessageDialog(null," el numero es de 1 cifra ");
                       } else if (numero<100) {
                           JOptionPane.showMessageDialog(null,"el numero es de 2 cifras");
                       } else if (numero <1000) {
                           JOptionPane.showMessageDialog(null,"el numero es de 3 cifras");

                       } else if (numero<10000) {
                           JOptionPane.showMessageDialog(null," el numero es de 4 cifras");

                       } else if (numero<100000) {
                           JOptionPane.showMessageDialog(null," el numero es de 5 cifras");

                       } else {
                           if (numero >100000){
                               JOptionPane.showMessageDialog(null,"el numero que ingreso esta fuera del rango");
                           }*/
                           /*
                           realizar un programa que informe si la fecha dia y año es correcta tenieniendo encuenta que son de 30 dias
                            */
                         /*  int dia, mes ,año;
                           dia=Integer.parseInt(JOptionPane.showInputDialog("digite el dia "));
                           mes=Integer.parseInt(JOptionPane.showInputDialog("digite el mes"));
                           año=Integer.parseInt(JOptionPane.showInputDialog("digite el año "));

                           if ((dia>=1) && (dia<=30 )){
                               JOptionPane.showMessageDialog(null," la fecha es correcta ");
                       } if ((mes >=1) && (mes<=12)){
                               JOptionPane.showMessageDialog(null, " la fecha es correcta ");
                        } if ((año>=1) && (año<1900)){
                               JOptionPane.showMessageDialog(null, " la fecha es correcta ");
                        } else {
                                JOptionPane.showMessageDialog(null, " fecha incorrecta");

                       }*/

                   // hacer un programa donde se digite un numero y diga si es par o impar//

                          /*int numero= 2;
                          numero=Integer.parseInt(JOptionPane.showInputDialog(" por favor digite un numero"));
                          if (((numero)%2)==0){
                                JOptionPane.showMessageDialog(null," el numero es par ");
                          } else {
                              JOptionPane.showMessageDialog(null,"el numero es impar");
                          }*/

                    /*  int dia, mes, año;
                      dia=Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia"));
                      mes=Integer.parseInt(JOptionPane.showInputDialog("ingrese el mes "));
                      año=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el año "));
                      
                      if (año==0){
                          JOptionPane.showMessageDialog(null,"fecha incorrecta");
                      } else if ((mes==2 ) && dia>=1 && dia<=28) {
                          JOptionPane.showMessageDialog(null,"fecha correcta");
                      } else if((mes == 4 || mes==6 || mes==9 || mes==11) && dia>1 && dia<=30){
                          JOptionPane.showMessageDialog(null,"fecha correcta");
                      } else if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8|| mes==10 || mes==12  )&& dia>1 && dia<=31) {
                          JOptionPane.showMessageDialog(null,"fecha correcta");
                          
                      } else {
                          JOptionPane.showMessageDialog(null,"fecha incorrecta");
                      }*/
                    /*
                    realizar una calculadora donde pueda sumar restar multiplicar y donde S sea para suma R para resta M para multiplicar
                    D para dividir
                     */
                    int numero1,numero2,suma,resta,division,multiplicacion;
                    char operacion;

                    numero1=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese un numero"));
                    numero2=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa otro numero"));

                    operacion=JOptionPane.showInputDialog("digite la  operacion que desea realizar").charAt(0);
                    switch (operacion){
                        case 's':
                        case 'S':
                            suma= numero1+numero2;
                            JOptionPane.showMessageDialog(null," el resultado es " +suma);
                        break;
                        case 'r':
                        case 'R':
                            resta= numero1-numero2;
                            JOptionPane.showMessageDialog(null," El resultado es "+resta);
                        break;
                        case 'd':
                        case 'D':
                            division= numero1/numero2;
                            JOptionPane.showMessageDialog(null,"el resultado es "+division);
                        break;
                        case 'm':
                        case 'M':
                            multiplicacion=numero1*numero2;
                            JOptionPane.showMessageDialog(null,"el resultado es "+ multiplicacion);
                        break;
                        default: JOptionPane.showMessageDialog(null,"operacion no realiza digite la opcion correcta");


                    }


    }

}