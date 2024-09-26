

import io.xjar.XCryptos;
import org.junit.Test;


public class Test222 {

    /**
     * 加密密码
     *
     */
    private final String password = "xdkj.#pwd@io.xjar";

    /**
     * 源码jars包全路径
     */
    private final String baseDir = "D:\\workspace\\xiudianer\\workspace\\transport-mqtt-device-v4\\branches\\4.0.0\\transport-mqtt-device-xjar\\src\\main\\java\\com\\xd\\device\\ad\\jars";
    /**
     * 使用方式
     *
     * 1. 拷贝要加密得jar包到jars目录下
     * 2. 修改from参数
     * 3. 执行main方法生成启动器源码 xjar.go
     * 4. 执行go build 交叉变异 xjar.go ，将会生成 xjar 启动器
     * 5. 到目标机器执行 /path/to/xjar /path/to/java [OPTIONS] -jar /path/to/encrypted.jar ,即可启动项目
     * @param args
     */
    @Test
    public void generationDevice() {


        try {
            XCryptos.encryption()
                    .from(baseDir + "/house-plat-0.0.1-SNAPSHOT.jar")
                    .use(password)
                    .exclude("/static/**/*")
                    .exclude("/META-INF/resources/**/*")
                    .to(baseDir + "/encrypted313.jar");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void generationDevice5() {


        try {
            XCryptos.encryption()
                    .from(baseDir + "/demo-0.0.1-SNAPSHOT.jar")
                    .use(password)
                    .exclude("/static/**/*")
                    .exclude("/META-INF/resources/**/*")
                    .to(baseDir + "/encrypted5.jar");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void generationDevice2() {


        try {
            XCryptos.encryption()
                    .from(baseDir + "/transport-mqtt-device-u1200-4.0.0.jar")
                    .use(password)
                    .exclude("/static/**/*")
                    .exclude("/META-INF/resources/**/*")
                    .to(baseDir + "/encrypted21.jar");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}