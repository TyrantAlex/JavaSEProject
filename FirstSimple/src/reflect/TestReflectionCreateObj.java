package reflect;

import java.lang.reflect.Constructor;

/**
 * 创建对象
 * Created by Administrator on 2017/7/18 0018.
 */
public class TestReflectionCreateObj {

    public static void main(String[] args) {
        //传统方式new创建对象
        ReflectPractice reflectPractice = new ReflectPractice();
        reflectPractice.name = "r1";
        System.out.println(reflectPractice);

        //反射方式创建对象
        String className = "reflect.ReflectPractice";
        try {
            //类对象
            Class reflectClass = Class.forName(className);
            //构造器
            Constructor constructor = reflectClass.getConstructor();
            //通过构造器实例化
            ReflectPractice reflectPractice2 = (ReflectPractice) constructor.newInstance();
            reflectPractice2.name = "r2";
            System.out.println(reflectPractice2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
