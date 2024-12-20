

import io.xjar.XCryptos;


public class Test {

    /**
     * 加密密码
     *
     */
    private final String password = "xdkj.#pwd@io.xjar";





    /**
     * 使用方式
     *
     * 1. 修改jarpath  和  加密文件名
     * 2. 修改from参数
     * 3. 执行main方法生成启动器源码 xjar.go
     * 4. 执行go build 交叉变异 xjar.go ，将会生成 xjar 启动器
     * 5. 到目标机器执行 /path/to/xjar /path/to/java [OPTIONS] -jar /path/to/encrypted.jar ,即可启动项目
     * @param args
     */
    @org.junit.Test
    public void generationJar() {

        /**
         * 源码jars包全路径
         */
        String jarpath = "D:\\workspace\\boot3\\target";
        try {
            XCryptos.encryption()
                    .from(jarpath + "/boot3.jar")  // 加密的源文件
                    .use(password)
                    .exclude("/static/**/*")
                    .exclude("/META-INF/resources/**/*")
                    .to(jarpath + "/encrypted5.jar");  // 输出文件
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}