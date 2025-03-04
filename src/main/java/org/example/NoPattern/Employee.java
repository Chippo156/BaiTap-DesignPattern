package org.example.NoPattern;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public void work(){
        if ("Đội Trưởng".equals(position)) {
            System.out.println(name + " đi tuần và gán việc nhân viên.");
        } else if ("Giám Đốc".equals(position)) {
            System.out.println(name + " quản lý công ty.");
        } else if ("Nhân Viên VP".equals(position)) {
            System.out.println(name + " pha và phê.");
        } else {
            System.out.println(name + " thực hiện công việc chung.");
        }
    }

}
