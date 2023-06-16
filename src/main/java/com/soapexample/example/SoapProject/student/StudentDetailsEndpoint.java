package com.soapexample.example.SoapProject.student;

import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.namespace.QName;

@Endpoint
public class StudentDetailsEndpoint {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetStudentDetailsRequest")
    @ResponsePayload
    public JAXBElement<GetStudentDetailsResponse> processCourseDetailsRequest(
            @RequestPayload JAXBElement<GetStudentDetailsRequest> request) {

        GetStudentDetailsResponse response = new GetStudentDetailsResponse();

        StudentDetails studentDetails = new StudentDetails();
        studentDetails.setId(request.getValue().getId());
        studentDetails.setName("Adam");
        studentDetails.setPassportNumber("E1234567");

        response.setStudentDetails(studentDetails);

        return createResponseJaxbElement(response, GetStudentDetailsResponse.class);
    }

    private<T> JAXBElement createResponseJaxbElement(T object, Class clazz) {

        return new JAXBElement(new QName(NAMESPACE_URI, clazz.getSimpleName()), clazz, object);

    }
}