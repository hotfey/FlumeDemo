package com.hotfey.flume.interceptor.serializer;

import org.apache.flume.Context;
import org.junit.Ignore;
import org.junit.Test;

import com.hotfey.flume.interceptor.serializer.RegexExtractorInterceptorHourAssignSerializer;

public class RegexExtractorInterceptorHourAssignSerializerTest {
	@Ignore
	@Test
	public void testDateTimeFormatter() {
		Context context = new Context();
		context.put("hours", "-1");
		context.put("outputPattern", "yyyy/MM/dd/HH");
		RegexExtractorInterceptorHourAssignSerializer customSerializer = new RegexExtractorInterceptorHourAssignSerializer();
		customSerializer.configure(context);
		System.out.println(customSerializer.serialize(""));
	}
}