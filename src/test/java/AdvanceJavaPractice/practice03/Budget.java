package AdvanceJavaPractice.practice03;

public class Budget {
    public static double familyBudget;
    public double pocketMoney;

    public void getPocketMoney(double moneyToTake){
        if (moneyToTake < familyBudget){
            familyBudget -= moneyToTake;
            pocketMoney += moneyToTake;
        }

    }

    public void getSalary(double salary){
        familyBudget += salary;
    }

    public void spendPocketMoney(double moneyToSpend ){
        if(moneyToSpend<pocketMoney){
            pocketMoney -= moneyToSpend;
        }
    }

    public static void spendFamilyBudget(double moneyToSpendFromFB){  // we make this method static coz it's affecting all family members
        if (moneyToSpendFromFB < familyBudget){
            familyBudget -= moneyToSpendFromFB;
        }
    }

}
