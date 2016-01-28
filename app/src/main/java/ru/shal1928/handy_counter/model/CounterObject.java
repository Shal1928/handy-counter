package ru.shal1928.handy_counter.model;

/**
 *
 */
public class CounterObject {

    private String group;
    private final String title;
    private double count;
    private double generalBehaviorValue;
    private boolean isPartOfTotal;



    public CounterObject(String title){
        this.title = title;
        init(null, title, 0, 1, false);
    }

    private void init(String group, String title, double count, double generalBehaviorValue, boolean isPartOfTotal){
        this.group = group;
//        this.title = title;
        this.count = count;
        this.generalBehaviorValue = generalBehaviorValue;
        this.isPartOfTotal = isPartOfTotal;
    }


    public boolean isPartOfTotal() {
        return isPartOfTotal;
    }

    public void setIsPartOfTotal(boolean isPartOfTotal) {
        this.isPartOfTotal = isPartOfTotal;
    }

    public double getGeneralBehaviorValue() {
        return generalBehaviorValue;
    }

    public void setGeneralBehaviorValue(double generalBehaviorValue) {
        this.generalBehaviorValue = generalBehaviorValue;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
