package com.dongba.foo.model;

/**
 * Created by dongba on 2017-07-10.
 */
public class Greeting {

    private final long id;

    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

}
