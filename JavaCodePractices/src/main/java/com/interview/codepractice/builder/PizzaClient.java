package com.interview.codepractice.builder;

public class PizzaClient {
	
	public static void main(String[] args) {
		Pizza pizza =  new Pizza.Builder(12)
                .cheese(true)
                .ham(true)
                .build();
	}

}
