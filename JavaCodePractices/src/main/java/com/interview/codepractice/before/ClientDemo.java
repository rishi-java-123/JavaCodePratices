package com.interview.codepractice.before;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;

public class ClientDemo {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		HttpResponse gitResponse = new Client().send("https://api.github.com/");
		System.out.println(gitResponse.getStatusLine().getStatusCode());
	}
}
