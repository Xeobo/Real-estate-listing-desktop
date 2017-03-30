package com.vzbiljic.pki.datasource.manager;

import com.vzbiljic.pki.datasource.AbstractDataSource;
import com.vzbiljic.pki.datasource.ActivityDataSource;

import java.util.ArrayList;

/**
 * Created by vzbiljic on 14.3.17..
 */

public abstract class AbstractManager<T extends AbstractDataSource> {
    protected ArrayList<T> arrayList = new ArrayList<>();


    protected abstract T instatiate();


    public T getDataSource(int i){
        if( i >= arrayList.size()){
            for(int j=arrayList.size();j<=i;j++)
                arrayList.add(instatiate());
        }

        return arrayList.get(i);
    }

    public int size(){
        return arrayList.size();
    }

    public boolean remove(int i){
        if( i < arrayList.size()){
            arrayList.remove(i);
            return true;
        }
        return false;
    }

}
