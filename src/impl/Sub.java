package impl;

import java.time.Instant;

public final class Sub extends Super {
    private final Instant instant;

    Sub() {
        instant = Instant.now();
    }

    @Override
    public void overrideMe(){
        System.out.println(instant);
    }
}
