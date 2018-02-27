package API.model;

import javax.persistence.*;

@Entity
@Table(name = "maint")
public  class MainTab implements java.lang.Cloneable {

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "name")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String name;

    @Column(name = "date")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String date;

    @Column(name = "type")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String type;

    @Column(name = "sum")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int sum;

    @Column(name = "place")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String place;

    @Column(name = "ch")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public boolean ch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public boolean isCh() {
        return ch;
    }

    public void setCh(boolean ch) {
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "MainTab{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", sum=" + sum +
                ", place='" + place + '\'' +
                ", ch=" + ch +
                '}';
    }
}
