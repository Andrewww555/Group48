package lesson17HomeWork;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private int year;
    private double diameter;
    private String metalName;

    public Coin(int nominal, int year, double diameter, String metalName) {
        this.nominal = nominal;
        this.year = year;
        this.diameter = diameter;
        this.metalName = metalName;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getMetalName() {
        return metalName;
    }

    public void setMetalName(String metalName) {
        this.metalName = metalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && year == coin.year && Double.compare(diameter, coin.diameter) == 0 && Objects.equals(metalName, coin.metalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, year, diameter, metalName);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", diameter=" + diameter +
                ", metalName='" + metalName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coin o) {

        if (this.diameter != o.diameter) {
            return Double.compare(this.diameter, o.diameter);
        }
        if (this.year != o.year) {
            return this.year - o.year;
        }
        if (!this.metalName.equals(o.metalName)) {
            return this.metalName.compareTo(o.metalName);
        }
            return this.nominal - o.nominal;
        }
    }

