package co.edu.pdam.eci.persistenceapiintegration.data.entity;

import com.j256.ormlite.field.DatabaseField;

/**
 * @author Santiago Carrillo
 */

//TODO add database annotations and proper model structure
public class Team extends BaseEntity{


    @DatabaseField
    private String name;
    @DatabaseField
    private String shortName;
    @DatabaseField
    private String imageUrl;

    public Team(){
    }

    public Team(String name, String shortName, String imageUrl){
        this.name=name;
        this.shortName=shortName;
        this.imageUrl=imageUrl;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
