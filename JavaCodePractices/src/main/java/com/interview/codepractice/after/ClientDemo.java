package com.interview.codepractice.after;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;


public class ClientDemo {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		HttpResponse gitResponse = new WebHttpClient().send("https://api.github.com/");
		System.out.println(gitResponse.getStatusLine().getStatusCode());
	}
}
