/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.thymeleaf.repository;

import com.example.thymeleaf.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LAN CENTER LEONPERU
 */
@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{
}
