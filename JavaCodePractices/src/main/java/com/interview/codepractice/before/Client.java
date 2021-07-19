package com.interview.codepractice.before;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;


//"Client" has many meanings, we have to look inside to realize that
//it is an HttpClient - so the class name can be improved

public class Client {

	private HttpClient client = getDefaultClient();

	public HttpResponse send(String s) throws ClientProtocolException, IOException {
		return client.execute(new HttpGet(s));

	}

	private HttpClient getDefaultClient() {

		return HttpClientBuilder.create().build();
	}

}
