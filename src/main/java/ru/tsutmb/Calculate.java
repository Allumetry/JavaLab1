package ru.tsutmb;

public class Calculate {
    public double Work(double x){
        if (x<=1) {
            return Math.asin(x / (Math.pow(x, 2)));
        }
        else if (1 < x && x < 2){
            return Math.log(Math.pow(x, 4) / (1 + Math.pow(x, 4)));
        }
        else {
            return Math.log10(Math.abs(Math.pow(2, -x) * Math.pow(x, 4-x)));
        }
    }
}
