package com.protics.model;

public class Employee {
    private Long id;
    private String name;
    private String department;
    private String phone;
    private String email;  // 팀원 Claude가 추가함
    private String address;
    private int salary;

    // 기본 생성자
    public Employee() {
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(Long id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getter, Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return true;  // 다른 팀원이 추가한 메서드
    }

    // 🧪 신규 기능: 아직 테스트 안 됨! 운영에 넣으면 안 됨!
    public double calculateBonus() {
        return salary * 0.1;  // 실험적 기능
    }

    @Override
    public String toString() {
        // 🔥 버그 수정: null 체크 추가 (NullPointerException 방지)
        String safeName = (name != null) ? name : "Unknown";
        String safeDept = (department != null) ? department : "Unknown";
        return "Employee{id=" + id + ", name='" + safeName + "', department='" + safeDept + "'}";
    }

}