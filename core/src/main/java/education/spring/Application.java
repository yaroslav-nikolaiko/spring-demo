package education.spring;

import education.spring.plugin.PluginManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Created by yaroslav on 11/18/15.
 */
@Configuration
@ComponentScan(basePackages = {"education.spring.plugin"})
public class Application {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        PluginManager manager = context.getBean(PluginManager.class);
        System.out.println(manager.execute(args).getResultValue());
    }
}
