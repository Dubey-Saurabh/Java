package JavaCollections.Class;

public class University {

    //Static Nested Class:

    public static class Department {

        private String departmentName;
        private int facultyCount;

        public Department(String departmentName, int facultyCount) {
            this.departmentName = departmentName;
            this.facultyCount = facultyCount;
        }

        public void displayInfo() {
            System.out.println("department name:" + departmentName);
            System.out.println("faculty members:" + facultyCount);
        }


    }

    public static void main(String[] args) {

        University.Department department = new University.Department("Computer Science", 50);
        department.displayInfo();
    }


}
