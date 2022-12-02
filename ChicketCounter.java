public class ChicketCounter {
    int chickets=3000;
    ChicketCounter(){
        
    }
    void buyChicket(String name,int count){//チケットの購入

        Chicket chikets[]=new Chicket [count];
        for(int i=0;i<count;i++){//チケットに名前を入れる
            chikets[i]=new Chicket(name);
        }
    }
    int accessedSite(int count){//サイトにアクセスされていて,購入枚数が入力される
        chickets-=count;
        return chickets;//暫定残り枚数を返す
    }
    int failedBuy(int count){//購入処理が失敗する
        chickets+=count;//購入予定のチケットをもとに戻す
        return chickets;
    }
}
