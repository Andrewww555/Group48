package lesson17HomeWork;

import java.util.Comparator;

public class SortByDiameterComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        if (o1.getDiameter() != o2.getDiameter()) {
            return Double.compare(o2.getDiameter(), o1.getDiameter());
        }
        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }
        if (!o1.getMetalName().equals(o2.getMetalName())) {
            return o1.getMetalName().compareTo(o2.getMetalName());
        }
        return o2.getNominal() - o1.getNominal();
    }
}

