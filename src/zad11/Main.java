package zad11;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        System.out.print("Urodzony 15.05.2002");
        if (majority(15,5,2002))
            System.out.println(" - pełnoletni");
        else
            System.out.println(" - niepelnoletni");

    }
    private  static  boolean majority (int day , int month , int year) {


        LocalDate now, dateOfBirth;
        now = LocalDate.now();
        dateOfBirth = LocalDate.of(year, month, day);

        Period p = Period.between(dateOfBirth,now);
        if (p.getYears() >= 18) return true;
        return false;
    }
}
