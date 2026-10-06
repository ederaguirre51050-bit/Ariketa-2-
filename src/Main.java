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
        Scanner sc = new Scanner (System.in);
        radio = sc.nextDouble();
        double a= (Math.PI * Math.pow(radio,2));
        System.out.println("tu circunferencia es " + a);

    }

    }
