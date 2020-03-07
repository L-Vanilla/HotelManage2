package com.neuedu.pojo;

import java.util.Date;

public class Leaguer extends MyPage{
    private Integer id;

    private String leaguerName;

    private String leaguerSex;

    private String leaguerPwd;

    private String leaguerTel;

    private String leaguerAddress;

    private String leaguerEmail;

    private Integer leaguerScore;

    private String leaguerRank;

    private Date timeLastlive;

    private Date timeLastorder;

    private String remarks;

    private Integer active;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeaguerName() {
        return leaguerName;
    }

    public void setLeaguerName(String leaguerName) {
        this.leaguerName = leaguerName == null ? null : leaguerName.trim();
    }

    public String getLeaguerSex() {
        return leaguerSex;
    }

    public void setLeaguerSex(String leaguerSex) {
        this.leaguerSex = leaguerSex == null ? null : leaguerSex.trim();
    }

    public String getLeaguerPwd() {
        return leaguerPwd;
    }

    public void setLeaguerPwd(String leaguerPwd) {
        this.leaguerPwd = leaguerPwd == null ? null : leaguerPwd.trim();
    }

    public String getLeaguerTel() {
        return leaguerTel;
    }

    public void setLeaguerTel(String leaguerTel) {
        this.leaguerTel = leaguerTel == null ? null : leaguerTel.trim();
    }

    public String getLeaguerAddress() {
        return leaguerAddress;
    }

    public void setLeaguerAddress(String leaguerAddress) {
        this.leaguerAddress = leaguerAddress == null ? null : leaguerAddress.trim();
    }

    public String getLeaguerEmail() {
        return leaguerEmail;
    }

    public void setLeaguerEmail(String leaguerEmail) {
        this.leaguerEmail = leaguerEmail == null ? null : leaguerEmail.trim();
    }

    public Integer getLeaguerScore() {
        return leaguerScore;
    }

    public void setLeaguerScore(Integer leaguerScore) {
        this.leaguerScore = leaguerScore;
    }

    public String getLeaguerRank() {
        return leaguerRank;
    }

    public void setLeaguerRank(String leaguerRank) {
        this.leaguerRank = leaguerRank == null ? null : leaguerRank.trim();
    }

    public Date getTimeLastlive() {
        return timeLastlive;
    }

    public void setTimeLastlive(Date timeLastlive) {
        this.timeLastlive = timeLastlive;
    }

    public Date getTimeLastorder() {
        return timeLastorder;
    }

    public void setTimeLastorder(Date timeLastorder) {
        this.timeLastorder = timeLastorder;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}