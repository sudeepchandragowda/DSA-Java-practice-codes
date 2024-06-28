package designPatterns.builder;

import designPatterns.builder.exception.InvalidGradYearException;
import designPatterns.builder.exception.InvalidNameException;
import designPatterns.builder.exception.InvalidYoeException;

public class Builder {
    public int id;
    public String name; // validate -> name is not null
    public int yoe; // validate -> yoe >= 1
    public int gradYear; // validate -> gradYear >= 2022
    public double psp;
    public String batchName;

    public Builder setId(int id) {
        this.id = id;
        return this;
    }
    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    public Builder setYoe(int yoe) {
        this.yoe = yoe;
        return this;
    }
    public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }
    public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
    }
    public Builder setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }
    public void validate(){
        if(name == null) {
            throw new InvalidNameException("Name should not be null");
        }
        if (yoe < 1) {
            throw new InvalidYoeException("Years of experience should not be 0");
        }
        if (gradYear < 2022) {
            throw new InvalidGradYearException("Grad year should be 2022 or before");
        }
    }
    public Student build() {
        this.validate();
        Student s = new Student(this);
        return s;
    }
}
