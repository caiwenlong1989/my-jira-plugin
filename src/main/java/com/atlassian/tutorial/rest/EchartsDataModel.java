package com.atlassian.tutorial.rest;

import javax.xml.bind.annotation.*;
@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class EchartsDataModel {

    @XmlElement(name = "value")
    private String message;

    public EchartsDataModel() {
    }

    public EchartsDataModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}