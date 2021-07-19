package com.interview.codepractice.after;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class WebHttpClient {
	
	private HttpClient client = getDefaultClient();

	public HttpResponse send(String s) throws ClientProtocolException, IOException {
		return client.execute(new HttpGet(s));

	}

	private HttpClient getDefaultClient() {

		return HttpClientBuilder.create().build();
	}

}
