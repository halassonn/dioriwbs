package com.github.britter.springbootherokudemo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Arrays;
import java.util.Date;

@Entity
public class DataPegawai {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    String id;
    String nik;
    String nama;
    String jenkel;
    String tempatlahir;
    Date tgllahir;
    String agama;
    String status;
    String alamat;
    @Lob
    byte[] foto;
    String jabatan;
    String statuskaryawan;
    Date tglmasuk;
    String masakerja;
    String pendidikan;

    public DataPegawai() {
    }

    public DataPegawai(String nik, String nama, String jenkel, String tempatlahir, Date tgllahir, String agama, String status, String alamat, byte[] foto, String jabatan, String statuskaryawan, Date tglmasuk, String masakerja, String pendidikan) {
        this.nik = nik;
        this.nama = nama;
        this.jenkel = jenkel;
        this.tempatlahir = tempatlahir;
        this.tgllahir = tgllahir;
        this.agama = agama;
        this.status = status;
        this.alamat = alamat;
        this.foto = foto;
        this.jabatan = jabatan;
        this.statuskaryawan = statuskaryawan;
        this.tglmasuk = tglmasuk;
        this.masakerja = masakerja;
        this.pendidikan =pendidikan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenkel() {
        return jenkel;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    public String getTempatlahir() {
        return tempatlahir;
    }

    public void setTempatlahir(String tempatlahir) {
        this.tempatlahir = tempatlahir;
    }

    public Date getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(Date tgllahir) {
        this.tgllahir = tgllahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getStatuskaryawan() {
        return statuskaryawan;
    }

    public void setStatuskaryawan(String statuskaryawan) {
        this.statuskaryawan = statuskaryawan;
    }

    public Date getTglmasuk() {
        return tglmasuk;
    }

    public void setTglmasuk(Date tglmasuk) {
        this.tglmasuk = tglmasuk;
    }

    public String getMasakerja() {
        return masakerja;
    }

    public void setMasakerja(String masakerja) {
        this.masakerja = masakerja;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    @Override
    public String toString() {
        return "DataPegawai{" +
                "id='" + id + '\'' +
                ", nik='" + nik + '\'' +
                ", nama='" + nama + '\'' +
                ", jenkel='" + jenkel + '\'' +
                ", tempatlahir='" + tempatlahir + '\'' +
                ", tgllahir=" + tgllahir +
                ", agama='" + agama + '\'' +
                ", status='" + status + '\'' +
                ", alamat='" + alamat + '\'' +
                ", foto=" + Arrays.toString(foto) +
                ", jabatan='" + jabatan + '\'' +
                ", statuskaryawan='" + statuskaryawan + '\'' +
                ", tglmasuk=" + tglmasuk +
                ", masakerja='" + masakerja + '\'' +
                ", pendidikan='" + pendidikan + '\'' +
                '}';
    }
}
