package cn.shellming.simplefactory;

/**
 * @ClassName ToGetUser
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/4 3:35 上午
 */
public class ToGetUser {
    public static void main(String[] args) {
        User admin = UserFactory.getUser("admin");
        User guest = UserFactory.getUser("guest");
        System.err.println(admin.listUserInfo());
        System.err.println(guest.listUserInfo());
    }
}
