package az.abbtech.lesson_11.lesson;

import java.io.IOException;
import java.time.LocalDateTime;

public final class TimeUtil {
    private TimeUtil() {
        throw new IllegalStateException("Utility class");
    }

        public static LocalDateTime getCurrentTime() throws IOException {
        return LocalDateTime.now();
    }
}
