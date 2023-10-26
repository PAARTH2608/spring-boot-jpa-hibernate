package com.springboot.SpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* LOMBOK : HELPS TO REMOVE THE UNNECESSARY CODE FROM THE FILE LIKE FOR ONLY 4 PROPERTIES WE ADDED
* SO MANY GETTERS AND SETTER AND TO_STRING METHODS, SO IT HELPS TO REMOVE ALL OF THEM
*/
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    // there are many more validation we can add like
    // @Length(max = 5, min = 1)
    // @Size(max = 10, min = 1)
    // @Email, @Positive, @Negative
    // for the dates we can see using future or past dates
    // @Future, @FutureOrPresent, @Past, @PastOrPresent
    @NotBlank(message = "Please add the department name")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
