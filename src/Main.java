import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Ejerecicio 1");
        double radio;
        System.out.println("Dime tu radio para hacer la circunferencia ");
        Scanner sc = new Scanner(System.in);
        radio = sc.nextDouble();
        double a = (Math.PI * Math.pow(radio, 2));
        System.out.println("tu circunferencia es " + a);

        int num1;
        int num2;
        System.out.println("dime 2 valores la base y la altura de un rectangulo");
        Scanner sd = new Scanner(System.in);
        num1 = sd.nextInt();
        num2 = sd.nextInt();
        System.out.println(" Tu numero es " + ((num1 * 2) + (num2 * 2)));

        System.out.println("que nota has sacado?");
        int nota;
        Scanner se = new Scanner(System.in);
        nota = se.nextByte();
        if (nota < 5)
            System.out.println("Has suspendido");
        else
            System.out.println("Has aprobado");

        int respuesta;
        System.out.printf("Que nota has sacado? del 1 al 10");
        Scanner sr = new Scanner(System.in);
        respuesta = sr.nextInt();
        switch (respuesta) {
            case 1, 2, 3:
                System.out.println("muy deficiente");
                break;
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 7, 8:
                System.out.println("notable");
                break;
            case 9, 10:
                System.out.println("sobresaliente");
                break;

            default:
                System.out.println("has puesto una nota que no esta entre el 1 o 10");


        }

    }
}
