import java.util.Scanner;

public class MedianofArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array:- ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the elments of array:- ");
        for(int k=0;k<n;k++)
        {
            array[k]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=0;
                if (array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.print(array[i]+" ");
        }
        if (n%2==0)
        {
            System.out.println("The  n-term of median:- "+((n/2)+((n/2)+1))/2);
        }
        else
        {
            System.out.println("The n-term of median:- "+((n+1)/2));
        }

    }
}
