package cn.shellming.singleton.hungry.safe;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/1 3:42 下午
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return singleton;
    }

}
