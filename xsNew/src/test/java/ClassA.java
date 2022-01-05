import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
//        int i = new BigDecimal("12349.12").intValue();
//        BigDecimal position;
//        String iStr = i+"";
//        if(iStr.length()<=2){
//            position = new BigDecimal(iStr);
//        }else {
//            position = new BigDecimal(iStr.substring(0,2)+zerosNums(iStr));
//        }

        System.out.println(zerosNums(new BigDecimal(10.98)));
    }

    public static String zerosNums(String iStr){
        String zerosNums="";
        for (int i = 0; i < (iStr.length() - 2); i++) {
            zerosNums+="0";
        }
        return zerosNums;
    }

    public  static BigDecimal zerosNums(BigDecimal iStrBigDecimal){
        BigDecimal position;
        //取整
        String iStr= iStrBigDecimal.intValue()+"";
        //计算 0 位
        StringBuilder zerosNums=new StringBuilder();
        for (int i = 0; i < (iStr.length() - 2); i++) {
            zerosNums.append("0");
        }


        if(iStr.length()<=2){
            position = new BigDecimal(iStr);
        }else {
            position = new BigDecimal(iStr.substring(0,2)+zerosNums);
        }
        return position;
    }

    @Test
    public void test2(){
        Integer a = 1;

        Integer b = 3;

        System.out.println(BigDecimal.valueOf(1).multiply(BigDecimal.valueOf(0.1)).
                divide(BigDecimal.valueOf(1),2, RoundingMode.UP));
        ArrayList<Person> peoples = new ArrayList<Person>() {{
            add(new Person("xiaohong", 10));
            add(new Person("", 11));
        }};
        List<Person> collect = peoples.stream().filter(s -> !s.getName().equals("")).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void  test3(){
        String a = null;
        if(a.isEmpty()||a=="1"){
            System.out.println(1);
        }
    }
}
