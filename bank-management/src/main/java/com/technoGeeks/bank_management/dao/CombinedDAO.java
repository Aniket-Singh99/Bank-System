package com.technoGeeks.bank_management.dao;


import java.util.List;

import com.technoGeeks.bank_management.module.Login;
import com.technoGeeks.bank_management.module.Signup;
import com.technoGeeks.bank_management.module.SignupTwo;
import com.technoGeeks.bank_management.module.SignupThree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
@Repository
public class CombinedDAO {

    @PersistenceContext
    private EntityManager entityManager;

    // Method to add a new Signup
    public Signup addSignup(Signup signup) {
        entityManager.persist(signup);
        return signup;
    }

    // Method to get all Signups
    public List<Signup> getAllSignups() {
        TypedQuery<Signup> query = entityManager.createQuery("SELECT s FROM Signup s", Signup.class);
        return query.getResultList();
    }

    // Method to get Signup by Form Number
    public Signup getSignupByFormNo(String formNo) {
        return entityManager.find(Signup.class, formNo);
    }

    // Method to delete Signup by Form Number
    public void deleteSignup(String formNo) {
        Signup signup = getSignupByFormNo(formNo);
        if (signup != null) {
            entityManager.remove(signup);
        }
    }

    // Method to add a new SignupTwo
    public SignupTwo addSignuptwo(SignupTwo signuptwo) {
        entityManager.persist(signuptwo);
        return signuptwo;
    }

    // Method to get all SignupTwos
    public List<SignupTwo> getAllSignuptwos() {
        TypedQuery<SignupTwo> query = entityManager.createQuery("SELECT s FROM SignupTwo s", SignupTwo.class);
        return query.getResultList();
    }

    // Method to get SignupTwo by Form Number
    public SignupTwo getSignuptwoByFormNo(String formNo) {
        return entityManager.find(SignupTwo.class, formNo);
    }

    // Method to delete SignupTwo by Form Number
    public void deleteSignuptwo(String formNo) {
        SignupTwo signuptwo = getSignuptwoByFormNo(formNo);
        if (signuptwo != null) {
            entityManager.remove(signuptwo);
        }
    }

    // Method to add a new SignupThree
    public SignupThree addSignupthree(SignupThree signupthree) {
        entityManager.persist(signupthree);
        return signupthree;
    }

    // Method to get all SignupThrees
    public List<SignupThree> getAllSignupthrees() {
        TypedQuery<SignupThree> query = entityManager.createQuery("SELECT s FROM SignupThree s", SignupThree.class);
        return query.getResultList();
    }

    // Method to get SignupThree by Form Number
    public SignupThree getSignupthreeByFormNo(String formNo) {
        return entityManager.find(SignupThree.class, formNo);
    }

    // Method to delete SignupThree by Form Number
    public void deleteSignupthree(String formNo) {
        SignupThree signupthree = getSignupthreeByFormNo(formNo);
        if (signupthree != null) {
            entityManager.remove(signupthree);
        }
    }

    // Method to add a new Login
    public Login addLogin(Login login) {
        entityManager.persist(login);
        return login;
    }

    // Method to validate user login
    public Login validateLogin(String cardnumber, String pin) {
        TypedQuery<Login> query = entityManager.createQuery("SELECT l FROM Login l WHERE l.cardnumber = :cardnumber AND l.pin = :pin", Login.class);
        query.setParameter("cardnumber", cardnumber);
        query.setParameter("pin", pin);
        return query.getResultStream().findFirst().orElse(null);
    }
}