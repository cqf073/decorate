package middle;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/4/2415:14
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class persontest {
    public static void main(String[] args) {
        person p = new person("小陈");
        p.toString();
        clothes hat = new hat();
        clothes shirt = new shirt();
        clothes jeans = new jeans();
        clothes shoes = new shoes();
        hat.show();
        shirt.show();
        jeans.show();
        shoes.show();
    }
}
