import java.util.Random; 
public class Main{
    public static void main(String[] args) throws InterruptedException{
       ChicketCounter chicketCounter=new ChicketCounter();
      Random r=new Random();
      int chickets=1000;
      Chicket c[]=new Chicket[chickets];
      Thread th[]=new Thread[chickets];
        for (int i=0;i<chickets;i++){
            String name=Integer.valueOf(i).toString();
           c[i]=new Chicket(name,r.nextInt(5)+1,chicketCounter);
           th[i]=new Thread(c[i]);
           th[i].start();
           Thread.sleep(3000);
        }
        for(int i=0;i<chickets;i++){
            th[i].join();
        }
        
    }
}