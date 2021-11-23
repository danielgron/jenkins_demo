package dk.danielgron.jenkinsmavendemo.controller;

import dk.danielgron.jenkinsmavendemo.dto.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class DogController {

    @GetMapping()
    public List<Dog> retrieveAllStudents()
    {
        var result = new ArrayList<Dog>();
        result.add(new Dog("Fido", "Labrador"));
        result.add(new Dog("Scottie", "Scotsterrier"));
        return result;
    }
}
