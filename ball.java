import java.lang.*;
public class ball {
    private String name;
    private  int weight;

    public ball (String n, int w){
        name = n;
        weight = w;
    }
    public ball (String n){
        name = n;
        weight = 0;
    }
    public ball() {
        name = "football";
        weight = 400;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.name+", age "+this.weight;
    }

    public void intoWeightBall (){
        System.out.println(name+"'s weighs "+weight*1+" grams");
    }
}

