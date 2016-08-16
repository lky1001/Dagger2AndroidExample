package com.tistory.lky1001.dagger2androidwithrealmexample.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by lee on 2016. 8. 16..
 */
public class RealmTest extends RealmObject {

    @PrimaryKey
    private int id;

    private String name;

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
}
