package com.hdw.common.jackson.converter;

import org.springframework.core.convert.converter.Converter;

/**
 * <code>
 *
 * </code>
 *
 * @author TuMingLong
 * @date 2020-04-02
 */
public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String source) {
        return StringToIntegerUtil.convert(source);
    }
}
