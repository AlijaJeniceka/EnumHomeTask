package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
     //   +Create a project to model 5 mathematical constants. (add it to enum)
        Mathematical newSub = Mathematical.SUBTRACTION;
        Mathematical newAdd = Mathematical.ADDITION;
        Mathematical newMult = Mathematical.MULTIPLICATION;
        Mathematical newDiv = Mathematical.DIVISION;
        Mathematical newRem = Mathematical.REMAINDER;

        double sub = newSub.getValue1() - newSub.getValue2();
        double add = newAdd.getValue1() + newAdd.getValue2();
        double mult = newMult.getValue1() * newAdd.getValue2();
        double div = newDiv.getValue1() / newDiv.getValue2();
        double rem = newRem.getValue1() % newRem.getValue2();

        System.out.println(newSub + " of " + newSub.getValue1() + newSub.getSign() +
                newSub.getValue2() + " = " + sub);

        System.out.println(newAdd + " of " + newAdd.getValue1() + newAdd.getSign() +
                newAdd.getValue2() + " = " + add);

        System.out.println(newMult + " of " + newMult.getValue1() + newMult.getSign() +
                newMult.getValue2() + " = " + mult);

        System.out.println(newDiv + " of " + newDiv.getValue1() + newDiv.getSign() +
                newDiv.getValue2() + " = " + div);

            System.out.println(newRem + " of " + newRem.getValue1() + newRem.getSign() +
                newRem.getValue2() + " = " + rem);


    }
}
