package education.spring.plugin;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by yaroslav on 11/18/15.
 */
@Data @AllArgsConstructor
public class Result<T> {
    private final int resultCode;
    private T resultValue;

    public Result(int resultCode) {
        this.resultCode = resultCode;
    }
}

