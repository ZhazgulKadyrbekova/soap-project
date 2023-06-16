package com.soapexample.example.SoapProject.student;

public class GetStudentDetailsResponse {
    private StudentDetails studentDetails;

    public GetStudentDetailsResponse() {
    }

    public GetStudentDetailsResponse(StudentDetails studentDetails) {
        this.studentDetails = studentDetails;
    }

    public StudentDetails getStudentDetails() {
        return studentDetails;
    }

    public void setStudentDetails(StudentDetails studentDetails) {
        this.studentDetails = studentDetails;
    }
}
