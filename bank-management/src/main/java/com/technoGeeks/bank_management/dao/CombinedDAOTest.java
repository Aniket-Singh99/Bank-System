package com.technoGeeks.bank_management.dao;



import com.technoGeeks.bank_management.module.Signup;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class CombinedDAOTest {

    @InjectMocks
    private CombinedDAO combinedDAO;

    @Mock
    private EntityManager entityManager;

    @Mock
    private TypedQuery<Signup> typedQuery;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddSignup() {
        Signup signup = new Signup();
        signup.setFormno("123");
        signup.setName("John Doe");

        combinedDAO.addSignup(signup);

        verify(entityManager, times(1)).persist(signup);
    }

    @Test
    public void testGetAllSignups() {
        List<Signup> signupList = new ArrayList<>();
        Signup signup1 = new Signup();
        signup1.setFormno("123");
        signupList.add(signup1);

        when(entityManager.createQuery(any(String.class), eq(Signup.class))).thenReturn(typedQuery);
        when(typedQuery.getResultList()).thenReturn(signupList);

        List<Signup> result = combinedDAO.getAllSignups();

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("123", result.get(0).getFormno());
    }

    @Test
    public void testGetSignupByFormNo() {
        Signup signup = new Signup();
        signup.setFormno("123");

        when(entityManager.find(Signup.class, "123")).thenReturn(signup);

        Signup result = combinedDAO.getSignupByFormNo("123");

        assertNotNull(result);
        assertEquals("123", result.getFormno());
    }

    @Test
    public void testDeleteSignup() {
        Signup signup = new Signup();
        signup.setFormno("123");

        when(entityManager.find(Signup.class, "123")).thenReturn(signup);

        combinedDAO.deleteSignup("123");

        verify(entityManager, times(1)).remove(signup);
    }

    @Test
    public void testDeleteSignup_NotFound() {
        when(entityManager.find(Signup.class, "123")).thenReturn(null);

        combinedDAO.deleteSignup("123");

        verify(entityManager, never()).remove(any(Signup.class));
    }
}
