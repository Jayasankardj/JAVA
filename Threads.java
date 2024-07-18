public class Threads extends Thread
{
    public static void main(String[] args)
    {
        try
        {
            Thread t=new Thread();
            System.out.println("Thread Started");
            t.start();
            System.out.println("Thread Running");
            t.run();
            System.out.println("Thread Sleeping for 10sec");
            Thread.sleep(10000);
            System.out.println("Thread again Running");
            t.run();
            System.out.println("Thread name is: "+t.getName());
        }
        catch (Exception e)
        {

        }

    }
}
