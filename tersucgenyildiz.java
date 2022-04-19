import java.util.*;

public class tersucgenyildiz
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int i,j,k, gir;
        System.out.print("Bu kod yildizlarla gireceginiz satir sayisi boyutunda ters ucgen yapar.\nSatir sayisi giriniz:");
        gir = tara.nextInt();

        for(i=0;i<=gir;i++)
        {
            for (j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for (k=((2*gir-1));k>=((2*i)+1);k--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
