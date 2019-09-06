package cn.zdk.filter;

public class Person {
    private String name;
    private String sex;
    private int age;
    private String job;

    public Person(Builder builder) {
        this.name = builder.name;
        this.sex  = builder.sex;
        this.age = builder.age;
        this.job = builder.job;

    }

    public static class Builder{
        private String name;
        private String sex;
        private int age;
        private String job;

        public Builder name(String  name) {
            this.name = name;
            return  this;
        }

        public Builder sex(String  sex) {
            this.sex = sex;
            return  this;
        }

        public Builder age(int  age) {
            this.age = age;
            return  this;
        }

        public Builder job(String  job) {
            this.job = job;
            return  this;
        }

        public Person build(){
         return  new Person(this);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
