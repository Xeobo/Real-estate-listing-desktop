package com.vzbiljic.pki.datasource.manager;

import com.vzbiljic.pki.datasource.CommentDataSource;

/**
 * Created by vzbiljic on 14.3.17..
 */

public class CommentDataSourceManager extends AbstractManager<CommentDataSource> {


    public static CommentDataSourceManager instance;

    @Override
    protected CommentDataSource instatiate() {
        return new CommentDataSource();
    }

    public static CommentDataSourceManager getInstance(){
        if(null == instance){
            instance = new CommentDataSourceManager();
        }
        return instance;
    }
}
