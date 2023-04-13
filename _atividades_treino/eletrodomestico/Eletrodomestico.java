package eletrodomestico;

public class Eletrodomestico {
    private int code;
    private String name;
    private float power;
    private float useForDay;

    public Eletrodomestico(int code, String name, float power, float useForDay) {
        this.code = code;
        this.name = name;
        this.power = power;
        this.useForDay = useForDay;
    }

    public float wattsPerDia() {
        float calculation = this.power * this.useForDay;
        return calculation;
    }
    public float wattsPerMes() {
        float calculation = wattsPerDia() * 30;
        return calculation;
    }
    public float wattsPorAno() {
        float calculation = wattsPerMes() * 12;
        return calculation;
    }

    public float spentPerMonth(float precowatts) {
        float calculation = wattsPerMes()/1000;
        return calculation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public float useForDay() {
        return useForDay;
    }

    public void useForDay(float useForDay) {
        this.useForDay = useForDay;
    }

}
