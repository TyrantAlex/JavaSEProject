package reflect;

import java.lang.reflect.Method;

/**
 * 获取类对象
 * Created by Administrator on 2017/7/18 0018.
 */
public class ReflectMain {
    public static void  main(String[] args){
//        Class<?> aClass = Class.forName("reflect.ReflectPractice");
//        Class<ReflectPractice> aClass = ReflectPractice.class;
        Class<? extends ReflectPractice> aClass = new ReflectPractice().getClass();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m.getName());
        }

        String className = "reflect.ReflectPractice";
        try {
            Class pClass1=Class.forName(className);
            Class pClass2=ReflectPractice.class;
            Class pClass3=new ReflectPractice().getClass();
            System.out.println(pClass1==pClass2);
            System.out.println(pClass1==pClass3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
