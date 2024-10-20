import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
           System.out.println("Hello, World!");

          Locale.setDefault(new Locale("pt", "BR"));

        try(Scanner sc = new Scanner(System.in);) {
            
           Triangulo x, y;

           x = new Triangulo();
           y = new Triangulo();

          System.out.println("Digite as medida do triangulo x : ");
          x.a = sc.nextDouble();
          x.b = sc.nextDouble();
          x.c = sc.nextDouble();

          System.out.println("Digite as medida do triangulo y : ");
          y.a = sc.nextDouble();
          y.b = sc.nextDouble();
          y.c = sc.nextDouble();

          double areax = x.area();
          double areay = y.area();

         

          System.out.printf("area do triangulo x: %.4f%n", areax);
          System.out.printf("area do triangulo y: %.4f%n", areay);


          if(areax > areay){
            System.out.println("mair area: X" );
          }else{
            System.out.println("mair area: Y" );
          }
  

          sc.close();
 
        }




          
    }
}
