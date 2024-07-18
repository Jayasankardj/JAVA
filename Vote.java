public class Vote
{
    public static void main(String[] args)
    {
        int y=2072;
        int e=21;
        int by=y-e;
        System.out.println("Birth Year: "+by);
        if(by>2060)
        {
            int el=y-2023;
            System.out.println("Eligibility from 2023 "+el+" Years");
        }
        else
        {
            int med=(by+2023)/2;
            System.out.println("Median between years: "+med);
        }
    }
}
