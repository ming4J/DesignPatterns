package cn.shellming.simplefactory;

/**
 * @ClassName Guest
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/4 3:27 上午
 */
public class Guest implements User {
    @Override
    public  String listUserInfo() {
        return "GUEST";
    }
    public void edit(){

    }
    public void query(){

    }
}
