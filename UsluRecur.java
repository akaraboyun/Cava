import java.util.*;

public class UsluRecur
{
    public static void main(String[] args)
    {
        RecurUs();
    }

    static void RecurUs()
    {
        int base, baseTemp, to,res;
        Scanner tara = new Scanner(System.in);
        System.out.print("Taban degerini girin:");
        base= tara.nextInt();
        baseTemp=base;
        System.out.print("Kuvvet degerini girin:");
        to=tara.nextInt();
        for(int i=1;i<to;i++)
            baseTemp*=base;
        System.out.println(base+" ^ "+to+" = "+baseTemp);
        RecurUs();
    }
}
