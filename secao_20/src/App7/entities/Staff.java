package App7.entities;

public class Staff {
    private String name;
    private String email;
    private Double salary;

    public Staff(String name, String email, Double salaray) {
        this.name = name;
        this.email = email;
        this.salary = salaray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salaray) {
        this.salary = salaray;
    }
}
