import java.util.ArrayList;
import java.util.List;

public class Demo2<T> {

    public static void main(String[] args) {
        //限制T 为String 类型
        Demo2<String> demo = new Demo2<>();
        List<String> array = new ArrayList<String>();
        array.add("Tom");
        array.add("河南");
        String str = demo.getListFisrt(array);
        System.out.println(str);

        //获取Integer类型
        Demo2<Integer> demo2 = new Demo2();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(13);
        Integer num = demo2.getListFisrt(nums);
        System.out.println(num);
    }

    /**
     * 这个只能传递T类型的数据
     * 返回值 就是Demo<T> 实例化传递的对象类型
     *
     * @param data
     * @return
     */
    private T getListFisrt(List<T> data) {
        if (data == null || data.size() == 0) {
            return null;
        }
        return data.get(0);
    }
}