import java.util.*;
import java.lang.*;

public class burc
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        String ay;
        int gun;

        System.out.println("Bu program gireceginiz ay ve gune gore burc hesaplar.");

        System.out.print("Dogdugunuz ayi ozel karakter kullanmadan giriniz (orn. subat):");
        ay = tara.next();

        System.out.print("Dogdugunuz gunu giriniz:");
        gun = tara.nextInt();


        if(ay.compareToIgnoreCase("nisan")==0)
        {
            if (gun>=1 && gun<=20)
                System.out.print("Koc burcusunuz.");
            else if(gun>20 && gun<=31)
                System.out.print("Boga burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else if(ay.compareToIgnoreCase("mayis")==0)
        {
            if (gun>=1 && gun<=21)
                System.out.print("Boga burcusunuz.");
            else if(gun>21 && gun<=31)
                System.out.print("Ikizler burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else if(ay.compareToIgnoreCase("haziran")==0)
        {
            if (gun>=1 && gun<=22)
                System.out.print("Ikizler burcusunuz.");
            else if(gun>22 && gun<=31)
                System.out.print("Yengec burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else if(ay.compareToIgnoreCase("temmuz")==0)
        {
            if(gun>=1 && gun<=22)
                System.out.print("Yengec burcusunuz.");
            else if(gun>22 && gun<=31)
                System.out.print("Aslan burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else if(ay.compareToIgnoreCase("agustos")==0)
        {
            if(gun>=1 && gun<=22)
                System.out.print("Aslan burcusunuz.");
            else if(gun>22 && gun<=31)
                System.out.print("Basak burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else if(ay.compareToIgnoreCase("eylul")==0)
        {
            if(gun>=1 && gun<=22)
                System.out.print("Basak burcusunuz.");
            else if(gun>22 && gun<=31)
                System.out.print("Terazi burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else if(ay.compareToIgnoreCase("ekim")==0)
        {
            if(gun>=1 && gun<=22)
                System.out.print("Terazi burcusunuz.");
            else if(gun>22 && gun<=31)
                System.out.print("Akrep burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else if(ay.compareToIgnoreCase("kasim")==0)
        {
            if(gun>=1 && gun<=21)
                System.out.print("Akrep burcusunuz.");
            else if(gun>21 && gun<=31)
                System.out.print("Yay burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else if(ay.compareToIgnoreCase("aralik")==0)
        {
            if(gun>=1 && gun<=21)
                System.out.print("Yay burcusunuz.");
            else if(gun>21 && gun<=31)
                System.out.print("Oglak burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else if(ay.compareToIgnoreCase("ocak")==0)
        {
            if(gun>=1 && gun<=21)
                System.out.print("Oglak burcusunuz.");
            else if(gun>21 && gun<=31)
                System.out.print("Kova burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else if(ay.compareToIgnoreCase("subat")==0)
        {
            if(gun>=1 && gun<=19)
                System.out.print("Kova burcusunuz.");
            else if(gun>19 && gun<=31)
                System.out.print("Balik burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else if(ay.compareToIgnoreCase("mart")==0)
        {
            if(gun>=1 && gun<=20)
                System.out.print("Balik burcusunuz.");
            else if(gun>20 && gun<=31)
                System.out.print("Koc burcusunuz.");
            else
                System.out.print("Something went wrong :(");
        }

        else
            System.out.print("\nSomething went wrong :(");
    }
}
