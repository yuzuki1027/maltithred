import java.util.Random; 
public class Chicket implements Runnable{
    String buyerName;
    private ChicketCounter cc;
    private int count;
    Chicket(String buyerName,int count,ChicketCounter cc){
        this.buyerName=buyerName;
        this.count=count;
        this.cc=cc;
    }
    public void run(){
        Random r=new Random();
        synchronized(cc){

        
        boolean flag=cc.accessedSite(count);
        if(flag==false){
           System.out.println("枚数を減らしてください"); 
        }
         else if(r.nextInt(7)<3){//予期せぬエラーを起こす
        try{
            Thread.sleep(3000);
            synchronized(cc){
              cc.failedBuy(count);  
            }
            System.out.println("残り枚数："+cc.getChickets());
        }
        catch(InterruptedException e){

        }
        }
        else{
            try{
                
                Thread.sleep(r.nextInt(7)*1000);//決済処理

            System.out.println("購入できました！"+"購入者:"+buyerName+"残り枚数："+cc.getChickets());  
            }
             catch(InterruptedException e){

             }
            
           
        }
        }
     }
}
