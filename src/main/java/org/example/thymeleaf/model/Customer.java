package org.example.thymeleaf.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.thymeleaf.validation.CourseCode;

@Data
@NoArgsConstructor
public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required") //it will be skipped if the value is null unless @NotNull is also present
    private String lastName;

    @CourseCode(value = "ABC", message = "must start with ABC")
    private String courseCode;


}
