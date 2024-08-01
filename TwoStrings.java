public class TwoStrings
{
    public static void main(String[] args)
    {
        String a="JAYA SANKAR";
        String b="RAJADHI RAJAN";
        int c=0;
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<b.length();j++)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    c+=1;
                    break;
                }
            }
        }
        System.out.println("Number of same characters: "+c);
    }
}
