package com.technoGeeks.bank_management.services;

import com.technoGeeks.bank_management.module.Bank;
import com.technoGeeks.bank_management.module.Login;
import com.technoGeeks.bank_management.module.Signup;
import com.technoGeeks.bank_management.module.SignupThree;
import com.technoGeeks.bank_management.module.SignupTwo;
import com.technoGeeks.bank_management.repository.BankRepository;
import com.technoGeeks.bank_management.repository.LoginRepository;
import com.technoGeeks.bank_management.repository.SignupRepository;
import com.technoGeeks.bank_management.repository.SignupThreeRepository;
import com.technoGeeks.bank_management.repository.SignupTwoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombinedService {

    @Autowired
    private SignupRepository signupRepository;

    @Autowired
    private SignupTwoRepository signupTwoRepository;

    @Autowired
    private SignupThreeRepository signupThreeRepository;

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private BankRepository bankRepository;

    // Signup Methods
    public Signup addSignup(Signup signup) {
        return signupRepository.save(signup);
    }

    public List<Signup> getAllSignups() {
        return signupRepository.findAll();
    }

    public Signup getSignupByFormNo(String formno) {
        return signupRepository.findById(formno).orElse(null);
    }

    public void deleteSignup(String formno) {
        signupRepository.deleteById(formno);
    }

    // SignupTwo Methods
    public SignupTwo addSignuptwo(SignupTwo signuptwo) {
        return signupTwoRepository.save(signuptwo);
    }

    public List<SignupTwo> getAllSignuptwos() {
        return signupTwoRepository.findAll();
    }

    public SignupTwo getSignuptwoByFormNo(String formno) {
        return signupTwoRepository.findById(formno).orElse(null);
    }

    public void deleteSignuptwo(String formno) {
        signupTwoRepository.deleteById(formno);
    }

    // SignupThree Methods
    public SignupThree addSignupthree(SignupThree signupthree) {
        return signupThreeRepository.save(signupthree);
    }

    public List<SignupThree> getAllSignupthrees() {
        return signupThreeRepository.findAll();
    }

    public SignupThree getSignupthreeByFormNo(String formno) {
        return signupThreeRepository.findById(formno).orElse(null);
    }

    public void deleteSignupthree(String formno) {
        signupThreeRepository.deleteById(formno);
    }

    // Login Methods
    public Login addLogin(Login login) {
        return loginRepository.save(login);
    }

    public List<Login> getAllLogins() {
        return loginRepository.findAll();
    }

    public Login getLoginByFormNo(String formno) {
        return loginRepository.findById(formno).orElse(null);
    }

    public void deleteLogin(String formno) {
        loginRepository.deleteById(formno);
    }

    // Bank Methods
    public Bank addBank(Bank bank) {
        return bankRepository.save(bank);
    }

    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    public Bank getBankByPin(String pin) {
        return bankRepository.findById(pin).orElse(null);
    }

    public void deleteBank(String pin) {
        bankRepository.deleteById(pin);
    }
}