package fancybank.data.Handlers;

public class SimulateTime {

    private int day;

    public SimulateTime() {
        this.day = 1;
    }

    public SimulateTime(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int addDay(int days) {
        this.day += days;
        return this.day;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj.getClass() == this.getClass()) {
            final SimulateTime toCompare = (SimulateTime) obj;
            return this.day == toCompare.getDay();
        }
        return false;
    }

}
