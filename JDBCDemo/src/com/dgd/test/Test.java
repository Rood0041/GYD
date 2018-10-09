package com.dgd.test;
import java.sql.*;


/**
 * @author Dgd
 * @create 2017-10-16-21:25
 * 测试数据库
 */
public class Test {
    private static final String url = "jdbc:mysql://localhost:3306/test";//test为我的数据库的名字
    private static final String user = "root";//用户名
    private static final String password = "1234";//密码

    public static void main(String[] args) throws Exception//记住要写抛出异常，否则就要用try catch语句
    {
        Class.forName("com.mysql.jdbc.Driver");//加载驱动
        Connection con = DriverManager.getConnection(url, user, password);//连接数据库
        Statement stm = con.createStatement();
        ResultSet re = stm.executeQuery("select * from inf");//执行询问语句，re中保存结果的集合
        while (re.next())//遍历结果
        {
            System.out.println(re.getString("name") + "," + re.getInt("age")
                    + "," + "" + re.getInt("tel"));
            //当然你的数据表要有这几个属性

        }
    }

}
