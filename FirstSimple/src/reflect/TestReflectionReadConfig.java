package reflect;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;

/**
 * 读取Config文件并获取类的实例
 * Created by Administrator on 2017/7/18 0018.
 */
public class TestReflectionReadConfig {

    public static void main(String[] args) {
        ReflectPractice reflectPractice = getReflectPractice();
        System.out.println(reflectPractice + " tag");
    }

    public static ReflectPractice getReflectPractice() {
        File file = new File("C:/Users/Administrator/IdeaProjects/Project1/FirstSimple/src/reflect/reflect.config");
        try (FileReader fr = new FileReader(file)) {
            char[] all = new char[(int)file.length()];
            fr.read(all);
            String className = new String(all);
            Class clazz = Class.forName(className);
            Constructor constructor = clazz.getConstructor();
            ReflectPractice reflectPractice = (ReflectPractice) constructor.newInstance();
            return reflectPractice;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
