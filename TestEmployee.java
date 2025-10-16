public class TestEmployee {
    static void main(String[] args) {
        Employee  e1=new Employee(8,"peter","Tan",2500);
        System.out.println(e1);
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id is:"+e1.getId());

        
    }

}
