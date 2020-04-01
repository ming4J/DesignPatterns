package cn.shellming.singleton.doublechecklock;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/1 4:33 下午
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    return new Singleton();
                }
            }
        }
        return singleton;
    }
}
