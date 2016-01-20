package com.hotfey.flume.interceptor.serializer;

import org.apache.flume.Context;
import org.junit.Ignore;
import org.junit.Test;

import com.hotfey.flume.interceptor.serializer.RegexExtractorInterceptorDateSerializer;

public class RegexExtractorInterceptorDateSerializerTest {
	@Ignore
	@Test
	public void testDateTimeFormatter() {
		Context context = new Context();
		context.put("inputPattern", "dd/MMM/yyyy:HH");
		context.put("outputPattern", "yyyy/MM/dd/HH");
		RegexExtractorInterceptorDateSerializer customSerializer = new RegexExtractorInterceptorDateSerializer();
		customSerializer.configure(context);
		System.out.println(customSerializer.serialize("09/Nov/2015:15"));
	}
}