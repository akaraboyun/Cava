import java.util.*;


public class sicaklik
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        float temp;

        System.out.print("Sicaklik degeri giriniz:");
        temp = tara.nextFloat();

        if (temp<5)
            System.out.print("Kayak yapabilirsiniz.");

        else if (temp>=5 && temp<15)
            System.out.print("Sinemaya gidebilirsiniz.");

        else if (temp>=15 && temp<25)
            System.out.print("Piknige gidebilirsiniz.");

        else
            System.out.print("Yuzmeye gidebilirsiniz.");
    }
}
