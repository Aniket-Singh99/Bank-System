package com.technoGeeks.bank_management.controller;



import com.technoGeeks.bank_management.module.Bank;
import com.technoGeeks.bank_management.module.Login;
import com.technoGeeks.bank_management.module.Signup;
import com.technoGeeks.bank_management.module.SignupThree;
import com.technoGeeks.bank_management.module.SignupTwo;
import com.technoGeeks.bank_management.services.CombinedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CombinedController {

    @Autowired
    private CombinedService combinedService;

    // Signup Endpoints
    @PostMapping("/signup")
    public ResponseEntity<Signup> createSignup(@RequestBody Signup signup) {
        Signup createdSignup = combinedService.addSignup(signup);
        return ResponseEntity.status(201).body(createdSignup); // 201 Created
    }

    @GetMapping("/signup")
    public ResponseEntity<List<Signup>> getAllSignups() {
        List<Signup> signups = combinedService.getAllSignups();
        return ResponseEntity.ok(signups); // 200 OK
    }

    @GetMapping("/signup/{formno}")
    public ResponseEntity<Signup> getSignupByFormNo(@PathVariable String formno) {
        Signup signup = combinedService.getSignupByFormNo(formno);
        return signup != null ? ResponseEntity.ok(signup) : ResponseEntity.notFound().build(); // 404 Not Found
    }

    @DeleteMapping("/signup/{formno}")
    public ResponseEntity<Void> deleteSignup(@PathVariable String formno) {
        combinedService.deleteSignup(formno);
        return ResponseEntity.noContent().build(); // 204 No Content
    }

    // SignupTwo Endpoints
    @PostMapping("/signuptwo")
    public ResponseEntity<SignupTwo> createSignupTwo(@RequestBody SignupTwo signuptwo) {
        SignupTwo createdSignupTwo = combinedService.addSignuptwo(signuptwo);
        return ResponseEntity.status(201).body(createdSignupTwo); // 201 Created
    }

    @GetMapping("/signuptwo")
    public ResponseEntity<List<SignupTwo>> getAllSignupTwos() {
        List<SignupTwo> signupTwos = combinedService.getAllSignuptwos();
        return ResponseEntity.ok(signupTwos); // 200 OK
    }

    @GetMapping("/signuptwo/{formno}")
    public ResponseEntity<SignupTwo> getSignupTwoByFormNo(@PathVariable String formno) {
        SignupTwo signuptwo = combinedService.getSignuptwoByFormNo(formno);
        return signuptwo != null ? ResponseEntity.ok(signuptwo) : ResponseEntity.notFound().build(); // 404 Not Found
    }

    @DeleteMapping("/signuptwo/{formno}")
    public ResponseEntity<Void> deleteSignupTwo(@PathVariable String formno) {
        combinedService.deleteSignuptwo(formno);
        return ResponseEntity.noContent().build(); // 204 No Content
    }

    // SignupThree Endpoints
    @PostMapping("/signupthree")
    public ResponseEntity<SignupThree> createSignupThree(@RequestBody SignupThree signupthree) {
        SignupThree createdSignupThree = combinedService.addSignupthree(signupthree);
        return ResponseEntity.status(201).body(createdSignupThree); // 201 Created
    }

    @GetMapping("/signupthree")
    public ResponseEntity<List<SignupThree>> getAllSignupThrees() {
        List<SignupThree> signupThrees = combinedService.getAllSignupthrees();
        return ResponseEntity.ok(signupThrees); // 200 OK
    }

    @GetMapping("/signupthree/{formno}")
    public ResponseEntity<SignupThree> getSignupThreeByFormNo(@PathVariable String formno) {
        SignupThree signupthree = combinedService.getSignupthreeByFormNo(formno);
        return signupthree != null ? ResponseEntity.ok(signupthree) : ResponseEntity.notFound().build(); // 404 Not Found
    }

    @DeleteMapping("/signupthree/{formno}")
    public ResponseEntity<Void> deleteSignupThree(@PathVariable String formno) {
        combinedService.deleteSignupthree(formno);
        return ResponseEntity.noContent().build(); // 204 No Content
    }

    // Login Endpoints
    @PostMapping("/login")
    public ResponseEntity<Login> createLogin(@RequestBody Login login) {
        Login createdLogin = combinedService.addLogin(login);
        return ResponseEntity.status(201).body(createdLogin);
    }
}