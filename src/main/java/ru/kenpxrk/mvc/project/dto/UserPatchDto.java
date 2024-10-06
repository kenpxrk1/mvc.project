package ru.kenpxrk.mvc.project.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPatchDto {

    @NotNull
    @NotBlank
    private String name;

    @Min(value = 1)
    @Max(value = 115)
    private Integer age;

    @Email
    @NotNull
    private String email;
}
