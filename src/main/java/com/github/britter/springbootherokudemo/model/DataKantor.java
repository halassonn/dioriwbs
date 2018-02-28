package com.github.britter.springbootherokudemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class DataKantor {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String id;
    private String kodekantor;
    private String namakantor;
    private String alamat;
    private String kodepos;
    @JsonIgnore
    @OneToMany(mappedBy = "dataKantor")
    private List<UserDetails> userDetails;

    public DataKantor(String kodekantor, String namakantor, String alamat, String kodepos) {
        this.kodekantor = kodekantor;
        this.namakantor = namakantor;
        this.alamat = alamat;
        this.kodepos = kodepos;
    }

    public String getKodekantor() {
        return kodekantor;
    }

    public void setKodekantor(String kodekantor) {
        this.kodekantor = kodekantor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamakantor() {
        return namakantor;
    }

    public void setNamakantor(String namakantor) {
        this.namakantor = namakantor;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKodepos() {
        return kodepos;
    }

    public void setKodepos(String kodepos) {
        this.kodepos = kodepos;
    }

    public List<UserDetails> getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(List<UserDetails> userDetails) {
        this.userDetails = userDetails;
    }

    @Override
    public String toString() {
        return "DataKantor{" +
                "id='" + id + '\'' +
                ", kodekantor='" + kodekantor + '\'' +
                ", namakantor='" + namakantor + '\'' +
                ", alamat='" + alamat + '\'' +
                ", kodepos='" + kodepos + '\'' +
                ", userDetails=" + userDetails +
                '}';
    }
}
