package com.pavan.SpringSecurityDemo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Student {
    private int stuentId;
    private String studentName;
    private BigDecimal studentMarks;

    public Student(int stuentId, String studentName, BigDecimal studentMarks) {
        this.stuentId = stuentId;
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    public int getStuentId() {
        return stuentId;
    }

    public void setStuentId(int stuentId) {
        this.stuentId = stuentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public BigDecimal getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(BigDecimal studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuentId=" + stuentId +
                ", studentName='" + studentName + '\'' +
                ", studentMarks=" + studentMarks +
                '}';
    }

}
