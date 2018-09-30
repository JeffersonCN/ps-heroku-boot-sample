/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.rivers.repositories;

import com.boot.rivers.models.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jeffersoncn
 */
public interface SampleRepository extends JpaRepository<Sample, Long>{
    
}
