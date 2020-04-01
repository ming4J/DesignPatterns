package cn.shellming.singleton.lazy.safe;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/1 3:37 下午
 */
public class Singleton {
    private static volatile Singleton singleton;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if (singleton == null){
            return new Singleton();
        }
        return singleton;
    }
}
