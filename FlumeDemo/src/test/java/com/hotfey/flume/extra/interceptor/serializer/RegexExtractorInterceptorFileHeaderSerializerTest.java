package com.hotfey.flume.extra.interceptor.serializer;

import org.apache.flume.Context;
import org.junit.Ignore;
import org.junit.Test;

public class RegexExtractorInterceptorFileHeaderSerializerTest {
	@Ignore
	@Test
	public void testDateTimeFormatter() {
		Context context = new Context();
		context.put("inputPattern", "yyyy-MM-dd-HH");
		context.put("outputPattern", "yyyy/MM/dd/HH");
		RegexExtractorInterceptorFileHeaderSerializer customSerializer = new RegexExtractorInterceptorFileHeaderSerializer();
		customSerializer.configure(context);
		System.out.println(customSerializer.serialize("2015-12-31-12"));
	}
}