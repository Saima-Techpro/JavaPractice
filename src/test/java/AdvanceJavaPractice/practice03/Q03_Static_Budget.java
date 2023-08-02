package AdvanceJavaPractice.practice03;

public class Q03_Static_Budget {
    // Type a basic home budget

    public static void main(String[] args) {

        Budget father = new Budget();
        System.out.println(father.familyBudget);  // it's warning coz this is static variable.. but if you insist, you can reach it by using object as well

        father.getSalary(3000);
        System.out.println(Budget.familyBudget); // 3000.0
        System.out.println(father.pocketMoney); // 0.0  co father hasn't got any pocket money yet

        father.getPocketMoney(500);    // 500
        System.out.println(Budget.familyBudget); // 2500.0

        Budget mother = new Budget();
        System.out.println(mother.familyBudget);  // 2500
        mother.getPocketMoney(1000);  // 1000
        mother.getSalary(5000);

        System.out.println(mother.familyBudget); // 6500.0

        mother.spendPocketMoney(2000);  // This will not work coz mother doesn't this much pocketmoney to spend

        Budget kid = new Budget();
        kid.getPocketMoney(500);
        System.out.println(Budget.familyBudget);  // 6000

        Budget.spendFamilyBudget(5000);
        System.out.println(Budget.familyBudget);

    }

}
