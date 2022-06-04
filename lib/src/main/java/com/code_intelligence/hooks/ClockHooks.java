package com.code_intelligence.hooks;

import com.code_intelligence.jazzer.api.HookType;
import com.code_intelligence.jazzer.api.MethodHook;

import java.lang.invoke.MethodHandle;
import java.time.Instant;
import java.time.LocalDateTime;

public class ClockHooks {

    // The Java release date is our new reference point.
    public static final LocalDateTime JAVA_RELEASE_DATE = LocalDateTime.of(1996, 1, 23, 0, 0);

    @SuppressWarnings("unused")
    @MethodHook(type = HookType.REPLACE, targetClassName = "java.time.LocalDateTime", targetMethod = "now")
    public static LocalDateTime hookInstant(MethodHandle method, Object thisObject, Object[] arguments, int hookId) {
        return JAVA_RELEASE_DATE;
    }
}
