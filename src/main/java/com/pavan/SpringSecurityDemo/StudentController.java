package com.pavan.SpringSecurityDemo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    List<Student> li = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Pavan", BigDecimal.valueOf(63.5))
            )
    );

    @GetMapping("/students")
    public List<Student> getStudents() {
        return li;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrf(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student getStudents(@RequestBody Student student) {
        li.add(student);
        return student;
    }
}