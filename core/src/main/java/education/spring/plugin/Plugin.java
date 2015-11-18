package education.spring.plugin;

/**
 * Created by yaroslav on 11/18/15.
 */
public interface Plugin<T> {
    Result<T> execute(String... params);
}
