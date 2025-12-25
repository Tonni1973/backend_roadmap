package toni.InnerClass;

public class Company extends BigCompany{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public class Employee {
        private String name;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getCompany(){
            return Company.this.getName();
        }

        public String getBigCompany(){
            return Company.super.getName();
        }


    }
}
