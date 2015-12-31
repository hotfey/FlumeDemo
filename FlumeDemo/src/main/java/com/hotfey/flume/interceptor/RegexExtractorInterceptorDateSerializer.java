package com.hotfey.flume.interceptor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.flume.Context;
import org.apache.flume.conf.ComponentConfiguration;
import org.apache.flume.interceptor.RegexExtractorInterceptorSerializer;

import com.google.common.base.Preconditions;

public class RegexExtractorInterceptorDateSerializer implements RegexExtractorInterceptorSerializer {
	private String inputPattern;
	private String outputPattern;

	@Override
	public void configure(ComponentConfiguration conf) {
	}

	@Override
	public void configure(Context context) {
		inputPattern = context.getString("inputPattern");
		Preconditions.checkArgument(!StringUtils.isEmpty(inputPattern), "Must configure with a valid inputPattern");
		outputPattern = context.getString("outputPattern");
		Preconditions.checkArgument(!StringUtils.isEmpty(outputPattern), "Must configure with a valid outputPattern");

	}

	@Override
	public String serialize(String value) {
		Date date = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(inputPattern);
		try {
			date = simpleDateFormat.parse(value);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		simpleDateFormat = new SimpleDateFormat(outputPattern);
		return simpleDateFormat.format(date);

	}
}