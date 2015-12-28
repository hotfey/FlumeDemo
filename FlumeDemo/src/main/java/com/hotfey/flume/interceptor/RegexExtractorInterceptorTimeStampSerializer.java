package com.hotfey.flume.interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.flume.Context;
import org.apache.flume.conf.ComponentConfiguration;
import org.apache.flume.interceptor.RegexExtractorInterceptorSerializer;

import com.google.common.base.Preconditions;

public class RegexExtractorInterceptorTimeStampSerializer implements RegexExtractorInterceptorSerializer {
	private String outputPattern;

	@Override
	public void configure(ComponentConfiguration conf) {
	}

	@Override
	public void configure(Context context) {
		outputPattern = context.getString("outputPattern");
		Preconditions.checkArgument(StringUtils.isNotEmpty(outputPattern), "Must configure with a valid outputPattern");

	}

	@Override
	public String serialize(String value) {
		Date date = new Date(Long.parseLong(value + "000"));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(outputPattern);
		return simpleDateFormat.format(date);

	}
}