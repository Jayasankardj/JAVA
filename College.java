import java.util.Scanner;

public class College
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER PHYSICS MARKS: ");
        int p=s.nextInt();
        System.out.println("ENTER CHEMISTRY MARKS: ");
        int c=s.nextInt();
        System.out.println("ENTER MATHS MARKS: ");
        int m=s.nextInt();
        System.out.println("ENTER BIOLOGY MARKS: ");
        int b=s.nextInt();
        System.out.println("ENTER COMPUTER SCIENCE MARKS: ");
        int cs=s.nextInt();
        System.out.println("RECOMENDED GROUPS ARE : ");

        String[] groups = determineGroups(p,c,m,b,cs);

        for (String group:groups)
        {
            switch(group)
            {
                case "BIOMEDICAL ENGINEERING":
                    System.out.println("BIOMEDICAL ENGINEERING");
                    break;
                case "COMPUTER SCIENCE ENGINEERING":
                    System.out.println("COMPUTER SCIENCE ENGINEERING");
                    break;
                case "MECHANICAL ENGINEERING":
                    System.out.println("MECHANICAL ENGINEERING");
                    break;
                case "CIVIL ENGINEERING":
                    System.out.println("CIVIL ENGINEERING");
                    break;
                case "BIO TECHNOLOGY":
                    System.out.println("BIO TECHNOLOGY");
                    break;
                case "CHEMICAL ENGINEERING":
                    System.out.println("CHEMICAL ENGINEERING");
                    break;
                case "ARTS GROUP":
                    System.out.println("ARTS GROUP");
                    break;
                case "SCIENCE GROUP":
                    System.out.println("SCIENCE GROUP");
                    break;
                default:
                    System.out.println("No matching group found.");
                    break;
            }
        }
    }

    public static String[] determineGroups(int p,int c,int m,int b,int cs)
    {
        double avg1=(p+c)/2;
        double avg2=(p+m+c)/3;
        StringBuilder sb = new StringBuilder();

        if (avg1<b)
        {
            sb.append("BIOMEDICAL ENGINEERING,");
        }
        if (cs>b && cs>c && m>b && m>c)
        {
            sb.append("COMPUTER SCIENCE ENGINEERING,");
        }
        if (p>b && p>cs && m>b && m>cs)
        {
            sb.append("MECHANICAL ENGINEERING,");
        }
        if (avg2>80 && cs<=70 && cs>=60 && b>=50 && b<=60)
        {
            sb.append("CIVIL ENGINEERING,");
        }
        if (c>=60 && c<=80 && b>=60 && b<=80 && c>p && c>cs && c>m && c>b && b>p && b>cs && b>m && b>c)
        {
            sb.append("BIO TECHNOLOGY,");
        }
        if (c>90 && b>=60 && b<=70 && p>=60 && p<=70 && m>=60 && m<=70 && cs>=60 && cs<=70)
        {
            sb.append("CHEMICAL ENGINEERING,");
        }
        if (p<50 || c<50 || m<50 || b<50 || cs<50)
        {
            sb.append("ARTS GROUP,");
        }
        sb.append("SCIENCE GROUP");

        return sb.toString().split(",");
    }
}
