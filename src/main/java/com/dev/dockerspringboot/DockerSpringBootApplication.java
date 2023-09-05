package com.dev.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DockerSpringBootApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Howdy Folks..Welcome to Devops Coaching by Coach Harshit!");
        model.addAttribute("msg", "Hello All..We are deploying springboot application into EKS cluster using Helm + Jenkins Pipeline!!!! Today is Sep 5th, 2023");
        return "index";
    }

    public static void main(String[] args) {

        SpringApplication.run(DockerSpringBootApplication.class, args);
    }

}
