package education.spring.plugin;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by yaroslav on 11/19/15.
 */
@Component("date")
public class DatePlugin implements Plugin<LocalDateTime> {
    public Result<LocalDateTime> execute(String... params) {
        return new Result<LocalDateTime>(0, LocalDateTime.now());
    }
}
