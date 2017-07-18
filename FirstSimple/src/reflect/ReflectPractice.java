package reflect;

/**
 * Created by Administrator on 2017/7/18 0018.
 */
public class ReflectPractice {

    public String name;

    private String reflect1 = "reflect1";

    static String reflectStatic;

    static {
        System.out.println("初始化 copyright");
        reflectStatic = "初始化的reflect1";
    }

    private void reflectClose1() {
        System.out.println("reflectClose");
    }
    private void reflectClose2() {
        System.out.println("reflectClose");
    }
    private void reflectClose3() {
        System.out.println("reflectClose");
    }
    private void reflectClose4() {
        System.out.println("reflectClose");
    }
}
