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

        package operadores;
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

