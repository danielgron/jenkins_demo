package dk.danielgron.jenkinsmavendemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dog {
    String name;
    String breed;
}
