// Generated by jextract

package com.unascribed.jxljxl.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*jpegxl_cms_set_fields_from_icc_func)(void* user_data,unsigned char* icc_data,unsigned long icc_size,struct * c,int* cmyk);
 * }
 */
public interface jpegxl_cms_set_fields_from_icc_func {

    int apply(java.lang.foreign.MemorySegment user_data, java.lang.foreign.MemorySegment icc_data, long icc_size, java.lang.foreign.MemorySegment c, java.lang.foreign.MemorySegment cmyk);
    static MemorySegment allocate(jpegxl_cms_set_fields_from_icc_func fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$0.jpegxl_cms_set_fields_from_icc_func_UP$MH, fi, constants$0.jpegxl_cms_set_fields_from_icc_func$FUNC, scope);
    }
    static jpegxl_cms_set_fields_from_icc_func ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _user_data, java.lang.foreign.MemorySegment _icc_data, long _icc_size, java.lang.foreign.MemorySegment _c, java.lang.foreign.MemorySegment _cmyk) -> {
            try {
                return (int)constants$0.jpegxl_cms_set_fields_from_icc_func_DOWN$MH.invokeExact(symbol, _user_data, _icc_data, _icc_size, _c, _cmyk);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


