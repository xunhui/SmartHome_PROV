// 基于Jena转换模块实现 RDF数据库 => RDF/Turtle

import java.io.*;
import java.sql.SQLException;
import com.hp.hpl.jena.db.IDBConnection;
import com.hp.hpl.jena.db.DBConnection;
import com.hp.hpl.jena.rdf.model.*;

public class Jena_mysql_RDF {

    public static final String strDriver = "com.mysql.jdbc.Driver"; // path of driver class
    public static final String strURL = "jdbc:mysql://localhost:3306/******"; // URL of database
    public static final String strUser = "******"; // database user id
    public static final String strPassWord = "******"; // database password
    public static final String strDB = "MySQL"; // database type

    public static void main(String[] args) {
        try {
            // 创建一个数据库连接
            IDBConnection conn = new DBConnection(strURL, strUser, strPassWord, strDB);

            // 加载数据库驱动类，需要处理异常
            try {
                Class.forName(strDriver);
            } catch (ClassNotFoundException e) {
                System.out.println("ClassNotFoundException, Driver is not available...");
            }

            // 使用数据库连接参数创建一个模型制造器
            ModelMaker maker = ModelFactory.createModelRDBMaker(conn);
            // 创建一个默认模型，命名为 MyOntology
            Model defModel = maker.createDefaultModel();
            // 准备需要存入数据库的本体文件，建立输出文件流
            FileInputStream inputSreamfile = null;
            try {
                File file = new File("c:/win.rdf");
                inputSreamfile = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("本体文件不存在");
            }

            InputStreamReader in = null;
            try {
                in = new InputStreamReader(inputSreamfile, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                System.out.println("出错了");
                e.printStackTrace();
            }

            // 读取文件
            defModel.read(in, null);

            // 关闭输入流读取器
            try {
                in.close();
            } catch (IOException e) {
                System.out.println("Exceptions occurclose1...");
                e.printStackTrace();
            }

            // 执行数据转换，将本体数据存入数据库
            defModel.commit();
            System.out.println("成功");
            // 关闭数据库连接
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Exceptions occur22...");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Exceptions occur...");
        }
    }
}