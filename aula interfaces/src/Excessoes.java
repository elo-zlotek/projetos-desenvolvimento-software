import java.io.BufferedReader;
import java.io.FileReader;

public class Excessoes {
    public static void main(String[] args) {
        int x = 0;
        try{
            x = 7 / 2;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(x);

        String texto = "4567";
        int y = 0;
        try {
             y = Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println(y);

        String[] nomes = {"Ana", "Marcelo", "Caio"};
        try{
            System.out.println(nomes[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Chamou o finally...");
        }
        System.out.println("Continuou...");

            int l;
        try{
            BufferedReader bf = new BufferedReader(
                    new FileReader("dados.txt"));
            int num = Integer.parseInt(bf.readLine());
            l = 10 / num;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fecha arquivo");
        }

    }
    }