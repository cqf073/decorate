package senior;

public class main {
    public static void main(String[] args){
        people p=new people("小陈");
        tshirt ts =new tshirt();//寸衫
        tie te=new tie();//领带
        shoe sh =new shoe();//鞋子
        hat h = new hat();
        h.dec(p);
        ts.dec(h);
        te.dec(ts);
        sh.dec(te);
        sh.show();
    }
}
