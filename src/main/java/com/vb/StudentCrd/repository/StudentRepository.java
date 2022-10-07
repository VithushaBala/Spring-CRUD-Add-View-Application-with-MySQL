package com.vb.StudentCrd.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vb.StudentCrd.student.Student1;


@Repository
public interface StudentRepository extends JpaRepository<Student1, Long> {

}
