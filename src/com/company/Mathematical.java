package com.company;

public enum Mathematical {

    SUBTRACTION(35, "-", 2),
    ADDITION(1, "+", 5),
    MULTIPLICATION(3, "*", 4),
    DIVISION(35, "/", 5),
    REMAINDER(80, "%", 9);

    private final double value1;
    private final String sign;
    private final double value2;

    Mathematical(double value1, String sign, double value2){
     this.sign = sign;
     this.value1 = value1;
     this.value2 = value2;
    }

 public String getSign() {
  return sign;
 }

 public double getValue1() {
  return value1;
 }


 public double getValue2() {
  return value2;
 }

}
