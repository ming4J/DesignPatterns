package cn.shellming.singleton.lazy.unsafe;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/1 3:33 下午
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance(){
        if (singleton == null){
            return new Singleton();
        }
        return singleton;
    }
}
