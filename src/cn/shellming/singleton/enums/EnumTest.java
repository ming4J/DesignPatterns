package cn.shellming.singleton.enums;

/**
 * @ClassName EnumTest
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/2 1:03 上午
 */
public class EnumTest {
    public static void main(String[] args) {

        Singleton singleton = Singleton.INSTANCE;
        singleton.setName("小明");
        singleton.setAge(10);
        singleton.doSomething();
        Singleton single = Singleton.INSTANCE;
        single.setName("小明他爸");
        single.setAge(36);
        single.doSomething();

        try {
            Singleton[] enums = Singleton.class.getEnumConstants();
            for (Singleton ss : enums) {
                ss.doSomething();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
