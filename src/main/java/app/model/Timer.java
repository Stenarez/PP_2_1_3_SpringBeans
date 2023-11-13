package app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Timer {

    private final Long nanoTime = System.nanoTime();
@Scope("singletone")
    public Long getTime() {
        return nanoTime;
    }
}
