package org.meveo.model.customEntities;

import org.meveo.model.CustomEntity;
import java.util.List;
import org.meveo.model.persistence.DBStorageType;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ceicetInstall implements CustomEntity {

    public ceicetInstall() {
    }

    private String uuid;

    @JsonIgnore()
    private DBStorageType storages;

    private String fieldCei;

    @Override()
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public DBStorageType getStorages() {
        return storages;
    }

    public void setStorages(DBStorageType storages) {
        this.storages = storages;
    }

    public String getFieldCei() {
        return fieldCei;
    }

    public void setFieldCei(String fieldCei) {
        this.fieldCei = fieldCei;
    }

    @Override()
    @JsonIgnore()
    public String getCetCode() {
        return "ceicetInstall";
    }
}
