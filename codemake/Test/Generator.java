package makecode;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aix
 * @Title:
 * @Package: makecode
 * @Description:
 * @date 2018/9/6 10:13
 * @Version:
 */
public class Generator {

    @Test
    public void make(){
        try {
            List<String> list = new ArrayList<>();
            File file = new File("D:\\ideaworkplace\\fly\\src\\main\\resources\\conf\\generator.xml");
            ConfigurationParser cp = new ConfigurationParser(list);
            Configuration config = cp.parseConfiguration(file);
            DefaultShellCallback callback = new DefaultShellCallback(true);
            MyBatisGenerator mg = new MyBatisGenerator(config,callback,list);
            ProgressCallback progressCallback = new VerboseProgressCallback();
            mg.generate(progressCallback);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
