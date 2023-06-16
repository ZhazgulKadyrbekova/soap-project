package com.soapexample.example.SoapProject.student;

public class GetStudentDetailsRequest {
    private long id;

    public GetStudentDetailsRequest() {
    }

    public GetStudentDetailsRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
