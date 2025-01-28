package com.example.Personal.Details.App;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class DTO {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String phoneNumber;

}
