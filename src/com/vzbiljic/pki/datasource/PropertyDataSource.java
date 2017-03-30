package com.vzbiljic.pki.datasource;

import com.vzbiljic.pki.bean.Property;
import com.vzbiljic.pki.util.R;


/**
 * Created by Xeobo on 2/4/2017.
 */

public class PropertyDataSource extends AbstractDataSource<Property> {

    public static PropertyDataSource instance;


    @Override
    protected String getDescription(Property object) {
        return object.getName();
    }

    private PropertyDataSource(){
        add(new Property(R.drawable.mm,"Milutina Milankovica 19B","200$", 67,"dvosoban","4","CG","DA","poslovni","20.12.2016.","da","useljivo"));
        add(new Property(R.drawable.moler,"Kralja Aleksandra 20A","300$", 67,"dvosoban","4","CG","DA","poslovni","20.12.2016.","da","useljivo"));
        add(new Property(R.drawable.omlad,"Nedeljka Cabrinovica 21","250$", 67,"dvosoban","4","CG","DA","poslovni","20.12.2016.","da","useljivo"));
        add(new Property(R.drawable.kraljam,"Rasinska 32","300$", 67,"dvosoban","4","CG","DA","poslovni","20.12.2016.","da","useljivo"));
        add(new Property(R.drawable.kraljicem,"Bratislave Petrovic BB","230$",67,"dvosoban","4","CG","DA","poslovni","20.12.2016.","da","useljivo"));
        add(new Property(R.drawable.vojvodes,"Bulevar vojvode Misica","320$",67,"dvosoban","4","CG","DA","poslovni","20.12.2016.","da","useljivo"));

    }

    public static PropertyDataSource getInstance(){
        if(null == instance){
            instance = new PropertyDataSource();
        }

        return instance;
    }

    public boolean checkIfExists(String user) {
        for(int i=0; i< PropertyDataSource.getInstance().size();i++){
            Property u = PropertyDataSource.getInstance().get(i);
            if(u.getName().equals(user)) {
                return true;
            }
        }
        return false;
    }

}
