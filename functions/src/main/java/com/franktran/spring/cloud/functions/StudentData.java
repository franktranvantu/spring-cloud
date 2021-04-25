package com.franktran.spring.cloud.functions;

import java.util.List;

public class StudentData {

  private List<Student> students;

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  @Override
  public String toString() {
    return "StudentData{" +
        "students=" + students +
        '}';
  }
}
