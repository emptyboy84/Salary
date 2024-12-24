import java.util.Scanner;

public class SalaryCalculatorWith4Insurance {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("월 급여를 입력하세요: ");
        int salary = input.nextInt();

        double nationalPension = salary * 0.045;
        double healthInsurance = salary * 0.03545;
        double longTermCareInsurance = healthInsurance * 0.1295;
        double employmentInsurance = salary * 0.009;

        double totalInsurance = nationalPension + healthInsurance + longTermCareInsurance + employmentInsurance;
        double netSalary = salary - totalInsurance;

        System.out.println("국민연금: " + Math.round(nationalPension) + "원");
        System.out.println("건강보험: " + Math.round(healthInsurance) + "원");
        System.out.println("장기요양보험: " + Math.round(longTermCareInsurance) + "원");
        System.out.println("고용보험: " + Math.round(employmentInsurance) + "원");
        System.out.println("총 공제액: " + Math.round(totalInsurance) + "원");
        System.out.println("실수령액: " + Math.round(netSalary) + "원");
        input.close();
    }
}
