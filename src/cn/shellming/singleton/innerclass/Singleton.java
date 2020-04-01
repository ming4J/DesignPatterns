package cn.shellming.singleton.innerclass;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/1 5:41 下午
 */
public class Singleton {
    private Singleton(){}
    private static class SingletonHolder{
        private final static Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
