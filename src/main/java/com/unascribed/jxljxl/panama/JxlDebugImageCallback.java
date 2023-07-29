// Generated by jextract

package com.unascribed.jxljxl.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*JxlDebugImageCallback)(void* opaque,char* label,unsigned long xsize,unsigned long ysize,struct * color,unsigned short* pixels);
 * }
 */
public interface JxlDebugImageCallback {

    void apply(java.lang.foreign.MemorySegment opaque, java.lang.foreign.MemorySegment label, long xsize, long ysize, java.lang.foreign.MemorySegment color, java.lang.foreign.MemorySegment pixels);
    static MemorySegment allocate(JxlDebugImageCallback fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$11.JxlDebugImageCallback_UP$MH, fi, constants$11.JxlDebugImageCallback$FUNC, scope);
    }
    static JxlDebugImageCallback ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _opaque, java.lang.foreign.MemorySegment _label, long _xsize, long _ysize, java.lang.foreign.MemorySegment _color, java.lang.foreign.MemorySegment _pixels) -> {
            try {
                constants$12.JxlDebugImageCallback_DOWN$MH.invokeExact(symbol, _opaque, _label, _xsize, _ysize, _color, _pixels);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


