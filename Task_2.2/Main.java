public class Main 
{
    public static void main(String[] args) 
    {
        int numbers [] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 1; i < numbers.length+1; i++)
        {
            for (int j = 1; j < numbers.length+1; j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println(" ");
        }
    }
}
