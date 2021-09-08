package cn.dokey.springframework.test.bean;

/**
 * @author: huamao836@163.com
 * @date: 2021/9/3 2:53 下午
 * @version: V1.0
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUser() {
        System.out.println("......................"+ name +"......................");
        System.out.println(" ......................阿弥陀佛......................\n" +
                "                       _oo0oo_                      \n" +
                "                      o8888888o                     \n" +
                "                      88\" . \"88                     \n" +
                "                      (| -_- |)                     \n" +
                "                      0\\  =  /0                     \n" +
                "                   ___/‘---’\\___                   \n" +
                "                  .' \\|       |/ '.                 \n" +
                "                 / \\\\|||  :  |||// \\                \n" +
                "                / _||||| -卍-|||||_ \\               \n" +
                "               |   | \\\\\\  -  /// |   |              \n" +
                "               | \\_|  ''\\---/''  |_/ |              \n" +
                "               \\  .-\\__  '-'  ___/-. /              \n" +
                "             ___'. .'  /--.--\\  '. .'___            \n" +
                "         .\"\" ‘<  ‘.___\\_<|>_/___.’>’ \"\".          \n" +
                "       | | :  ‘- \\‘.;‘\\ _ /’;.’/ - ’ : | |        \n" +
                "         \\  \\ ‘_.   \\_ __\\ /__ _/   .-’ /  /        \n" +
                "    =====‘-.____‘.___ \\_____/___.-’___.-’=====     \n" +
                "                       ‘=---=’                      \n" +
                "                                                    \n" +
                "....................佛祖保佑 ,永无BUG...................");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
