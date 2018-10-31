package main;

import user.User;

/**
 * 主类
 *
 * @author Zebe
 */
public class Main {

    /**
     * 运行入口
     *
     * @param args 运行参数
     */
    public static void main(String[] args) {
        // 调用 module-user 模块中的 User 类
        User user = new User();
        user.sayHello();
    }

}
