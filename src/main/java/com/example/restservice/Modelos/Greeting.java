package com.example.restservice.Modelos;

public class Greeting {

	private final long id;
	private final String content;
        private final String[] example;

	public Greeting(long id, String content, String[] example) {
		this.id = id;
		this.content = content;
                this.example = example;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
        
        public String[] getExample() {
            return example;
        }
}
