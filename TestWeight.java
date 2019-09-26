import java.lang.*;
public class Testweight {
    public static void main (String[] args){
        Weight d1 = new weight("Mike", 2);
        dogs d2 = new dogs("Helen", 7);
        dogs d3 = new dogs("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }