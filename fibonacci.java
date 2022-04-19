import java.util.*;

public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int girdi,i,Fn, Fnn=1, Fnnn=0;
        System.out.print("Bu kod gireceginiz sayiya kadar Fibonacci serisi hesaplar.\nEleman sayisi giriniz:");
        girdi = tara.nextInt();
        System.out.printf("%d %d ",Fnnn, Fnn);
        for(i=2;i<girdi;i++)
        {
            Fn=Fnn+Fnnn;
            System.out.printf("%d ",Fn);
            Fnnn=Fnn;
            Fnn=Fn;
        }


    }
}
