package com.apispring.api_spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentConfirmpaperId implements Serializable {

    @Column(name = "Student")
    private String studentId;

    @Column(name = "RequiredTime")
    private Date requiredTime;

    @Column(name = "ConfirmationPaper")
    private int confirmationPaperId;


}
