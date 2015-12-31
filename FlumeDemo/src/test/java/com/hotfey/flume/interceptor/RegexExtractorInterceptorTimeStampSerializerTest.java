package com.hotfey.flume.interceptor;

import org.apache.flume.Context;
import org.junit.Ignore;
import org.junit.Test;

import com.hotfey.flume.interceptor.RegexExtractorInterceptorTimeStampSerializer;

public class RegexExtractorInterceptorTimeStampSerializerTest {
	@Ignore
	@Test
	public void testDateTimeFormatter() {
		Context context = new Context();
		context.put("outputPattern", "yyyy/MM/dd/HH");
		RegexExtractorInterceptorTimeStampSerializer customSerializer = new RegexExtractorInterceptorTimeStampSerializer();
		customSerializer.configure(context);
		System.out.println(customSerializer.serialize("1451280283"));
	}
}