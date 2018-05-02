package com.project.util;

public class JSonResponseBody {

    private int server;
    private Object response;

    public JSonResponseBody() {
        super();
        // TODO Auto-generated constructor stub
    }
    public JSonResponseBody(int server, Object response) {
        super();
        this.server = server;
        this.response = response;
    }

    public int getServer() {
        return server;
    }
    public void setServer(int server) {
        this.server = server;
    }
    public Object getResponse() {
        return response;
    }
    public void setResponse(Object response) {
        this.response = response;
    }

}