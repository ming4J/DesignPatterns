package cn.shellming.simplefactory;

/**
 * @ClassName UserFactory
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/4 3:32 上午
 */
public class UserFactory {
    public static User getUser(String type){
        switch (type){
            case "admin":
                    return new Admin();
            case "guest":
                    return new Guest();
            default:
                throw new RuntimeException("无用户类别");
        }
    }
}
