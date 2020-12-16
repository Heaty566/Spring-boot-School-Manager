package com.schoolmanager.app;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "")
    public String renderIndex() {
        return "index";
    }

    @GetMapping(value = "/student-form")
    public String renderStudentForm(Model model) {
        Student student = new Student();

        model.addAttribute("student", student);
        return "studentForm";
    }

    @GetMapping(value = "/student-table")
    public String renderStudentTable(Model model) {
        List<Student> students = this.studentService.getAllStudent();
        int count = this.studentService.studentCount();
        model.addAttribute("students", students);
        model.addAttribute("count", count);

        return "studentTable";
    }

    @GetMapping(value = "/student-summary")
    public String renderStudentSummary(Model model) {
        List<Student> students = this.studentService.getAllStudent();
        HashMap<String, Double> studentReport = this.studentService.studentReport();
        Collections.sort(students);
        model.addAttribute("students", students);
        model.addAttribute("studentReport", studentReport);

        return "studentSummary";
    }

    @GetMapping(value = "/update/{id}")
    public String updateStudentForm(Model model, @PathVariable("id") int id) {
        Student student = this.studentService.getStudentById(id);

        model.addAttribute("student", student);
        return "studentForm";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        this.studentService.deleteStudentById(id);

        return "redirect:/student/student-table";
    }

    @GetMapping(value = "/handle-add-student")
    public String handleAddStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "studentForm";
        }

        this.studentService.addNewStudent(student);
        return ("redirect:/student/student-table");

    }

}