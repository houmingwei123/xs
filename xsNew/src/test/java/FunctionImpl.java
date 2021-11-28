import java.util.function.Function;

public class FunctionImpl implements Function {
    @Override
    public Object apply(Object o) {
        System.out.println("我正在apply 这个方法");
        return null;
    }

}
