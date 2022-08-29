import java.util.Random;
public class EmployeeSwitch {
    int random;
    int Wage_per_Hour;
    int Hour;
    double totalEmployeeWage;
    double EmployeeWage;
    private int totalDay=20;
    EmployeeSwitch(int Wage){
        Wage_per_Hour=Wage;
    }
    public  int isCheck(){
        random=randomNumber();
        switch (random){
            case 1:
                Hour=8;
                System.out.println(" Working is full time");
                break;
            case 2:
                Hour=4;
                System.out.println(" Working is part time");
                break;
            default:
                Hour=0;
                System.out.println(" Employee is Absent");
        }
        return Hour;
    }
    public int randomNumber(){
        Random r = new Random();
        random = r.nextInt(3);
        return random;
    }
    public  void calculate(){
        for ( int day = 1; day <=totalDay; day++){
            EmployeeWage=Wage_per_Hour*Hour;
            totalEmployeeWage=totalEmployeeWage+EmployeeWage;
            System.out.println("  Employee  per day Wage "+day+" :" +EmployeeWage);
        }
        System.out.println("................................");
        System.out.println(" Total Employee Wage  one Month is "+totalEmployeeWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        EmployeeSwitch wage= new EmployeeSwitch(20);
        wage.calculate();
    }
}
