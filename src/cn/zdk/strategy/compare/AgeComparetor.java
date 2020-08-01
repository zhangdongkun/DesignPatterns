package cn.zdk.strategy.compare;

public class AgeComparetor implements Comparetor<Person> {

    @Override
    public int compare(Person t1, Person t2) {
        if (t1.getAge() > t2.getAge()) {return 1;}
        if (t1.getAge() <t2.getAge()){return -1;}

        return 0;
    }
}


