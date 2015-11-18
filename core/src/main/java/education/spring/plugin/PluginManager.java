package education.spring.plugin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by yaroslav on 11/18/15.
 */
@Component
public class PluginManager {
    @Autowired
    Map<String, Plugin> plugins;

    public Result execute(String[] args) {
        return plugins.get(args[0]).execute(args);
    }
}
