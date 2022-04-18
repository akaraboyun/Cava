import java.util.*;
import java.lang.Math;



public class armstrong
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int length, sayi, i, armst=0, sayiComp, sum=0;
        int[] intArray = new int[50];
        System.out.print("Bu program gireceginiz bir sayinin Armstrong sayisi olup olmadigini bulur ve basamak sayilari toplamini hesaplar." +
                "\nArmstrong sayisi -> orn. 1234 = 1^4+2^4+3^4+4^4 ise Armstrong " +
                "sayisidir.\nSimdi bir sayi giriniz:");
        sayi = tara.nextInt();
        sayiComp = sayi;
        length = (int) (Math.log10(sayi) + 1);
        for(i=0;i<length;i++)
        {
            intArray[length-i-1] = sayi%10;
            armst += Math.pow(intArray[length-i-1],length);
            sum += intArray[length-i-1];
            sayi/=10;
        }

        if(armst==sayiComp)
            System.out.printf("Girdiginiz %d sayisi bir Armstrong sayisidir.",sayiComp);
        else
            System.out.printf("Girdiginiz %d sayisi bir Armstrong sayisi degildir.",sayiComp);

        System.out.printf("\nGirdiginiz %d sayisinin basamaklari toplami = %d",sayiComp,sum);
    }
}
