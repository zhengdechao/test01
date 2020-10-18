import com.domain.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class test_1 {


    public static void main(String[] args) {

        //引入配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;

        {
            try {
                //通过加载mybatis配置文件创建输入流对象
                inputStream = Resources.getResourceAsStream(resource);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println( inputStream);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                    //获取与数据库回话的对象session
        System.out.println(sqlSessionFactory );
        SqlSession session = sqlSessionFactory.openSession();
             student stu=   session.selectOne("test1.getById","A01");
        System.out.println(stu);
        session.close();

    }


}
