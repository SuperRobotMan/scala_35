package test;

import java.sql.*;
import java.util.Iterator;

public class MysqlIterator implements Iterator<User> {

    private ResultSet resultSet = null;
    /*
        1.获取到mysql的连接
        2.写一个sql，去获取到mysql里面的数据
        3.获取到数据后重写hasNext和next方法
     */
    //获取到mysql的连接
    public MysqlIterator(){

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "123456");
            PreparedStatement pps= conn.prepareStatement("select id,name,age,gender from user_info");
            resultSet = pps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean hasNext() {
        boolean flag = false;
        try {
              flag = resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User next() {
        int id = 0;
        String name = null;
        int age = 0;
        String gender = null;
        try {
            id = resultSet.getInt(1);
            name = resultSet.getString(2);
            age = resultSet.getInt(3);
            gender = resultSet.getString(4);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        User user = new User(id,name,age,gender);
        return user;
    }
}
