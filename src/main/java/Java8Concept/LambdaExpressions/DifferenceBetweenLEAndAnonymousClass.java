package Java8Concept.LambdaExpressions;

public class DifferenceBetweenLEAndAnonymousClass {

    public static void main(String[] args) {

        Employees employees = new Employees()
            /*Anonymous Class*/
        {
            @Override
            public String getSalary() {
                return "100";
            }

            @Override
            public String getDesignation() {
                return "Software Engineer";
            }
        };

        System.out.println(employees.getSalary());
        System.out.println(employees.getDesignation());


    }

}
