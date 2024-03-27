package com.itshaala.spring013studentmgmtspringboot.dao;

import com.itshaala.spring013studentmgmtspringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
}
