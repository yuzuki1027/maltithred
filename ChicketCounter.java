import java.util.Random;
public class ChicketCounter {
    int chickets=1000;
    ChicketCounter(){
        
    }
     
    boolean accessedSite(int count){//サイトにアクセスされていて,購入枚数が入力される
        
            if(chickets>=count){
         
                chickets-=count;
                return true;
            
        }
        else{
            return false;
        }
        
    }
    int getChickets(){
       
        return chickets;
        
    }
    int failedBuy(int count){//購入処理が失敗する
       
            chickets+=count;//購入予定のチケットをもとに戻す
            System.out.println("チケットの購入に失敗しました,購入サイトに戻ります");
            return chickets;
            
        
    }
}
