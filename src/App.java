import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int mat, fiz, tur, kim, muz;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mat = input.nextInt();

        System.out.print("Fizik notunuz :");
        fiz = input.nextInt();

        System.out.print("Turkce notunuz :");
        tur = input.nextInt();

        System.out.print("Kimya notunuz :");
        kim = input.nextInt();

        System.out.print("Muzik notunuz :");
        muz = input.nextInt();

        if((mat <= 0) || (mat >= 101) ){
            mat = 0;
        }if((fiz <= 0) || (fiz >= 101)){
            fiz = 0;
        }if((tur <= 0) || (tur >=  101)){
            tur = 0;
        }if((kim <= 0) || (kim >= 101)){
            kim = 0;
        }if((muz <= 0) || (muz >= 101)){
            muz = 0;
        }

        double avrg = (mat+fiz+tur+kim+muz)/5;

        if(avrg <= 55){
            System.out.println("Sinifta kaldiniz");
            System.out.print("Ortlamaniz :" + avrg);
        } else{
            System.out.println("Sinifi gectiniz");
            System.out.print("Ortlamaniz :" + avrg);
        }
        
    }
}
