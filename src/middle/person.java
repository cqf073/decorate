package middle;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/4/2415:05
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class person {
    private String name;

    public person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println(name);
        return name;
    }
}
