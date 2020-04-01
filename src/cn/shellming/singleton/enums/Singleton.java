package cn.shellming.singleton.enums;

interface ISingleton{
    void doSomething();
}

public enum Singleton implements ISingleton{

    // 枚举
    INSTANCE {
        @Override
        public void doSomething() {
            System.out.println(getName() + "  " + getAge());
        }
    };

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private static Singleton getInstance(){
        return Singleton.INSTANCE;
    }
}
