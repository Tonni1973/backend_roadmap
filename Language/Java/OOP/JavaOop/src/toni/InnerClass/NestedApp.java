package toni.InnerClass;

public class NestedApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("ToniCorps");

        Company.Employee employee = company.new Employee(); // --> cara memanggil inner class
        employee.setName("Tonni");

        System.out.println(company.getName());
        System.out.println(employee.getName());

        System.out.println(employee.getCompany());
    }
}
