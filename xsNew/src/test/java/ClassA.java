import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class ClassA implements IntertaceA{
    private int age;
    @Override
    public <T> T getModules(Class<T> tClass) {
        Integer a =null;
        ArrayList<Integer> integers = new ArrayList<Integer>() {{
            add(a);
        }};
        return null;
    }

    public static List<ClassA> test1(){

        ClassA classA = new ClassA();
        List<ClassA> modules = null;
        return null;
    }

    public static void main(String[] args) {
        System.out.println(test1());
    }

}
