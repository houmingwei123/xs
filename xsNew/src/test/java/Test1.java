import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
@Slf4j
public class Test1 {
    public static void main(String[] args) {

//        Integer a = 10000;
//
//        Integer b = 10000;
//
//        System.out.println(a.equals(b));
//
////        People people = new People("1",2);
//
//        String s = "{\"age\":1,\"name\":\"王\"}";
//        People people1 = JSON.parseObject(s, People.class);
//        System.out.println(people1);
        String s2 = "2021-09-26 09:11:00";

        System.out.println(Date.parse(s2));
    }

    public void function1(Function f){
        int a = 1;
        f.apply(a);
    }

    public boolean test2(){

        return (1==1);
    }
}
