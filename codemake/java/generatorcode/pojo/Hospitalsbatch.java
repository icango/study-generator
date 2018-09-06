package generatorcode.pojo;

import java.util.Date;

public class Hospitalsbatch {
    private String hospitalsbatchId;

    private String batchname;

    private Date dcreatedtime;

    private Integer dstatus;

    private String hospitaloperator;

    private Integer hospitaldrugcount;

    private Integer diagnosecount;

    private Integer dictcount;

    private Integer slicescount;

    private Integer historyprescriptioncount;

    private Date precompletetime;

    private Integer batchtype;

    private String coreversionname;

    public String getHospitalsbatchId() {
        return hospitalsbatchId;
    }

    public void setHospitalsbatchId(String hospitalsbatchId) {
        this.hospitalsbatchId = hospitalsbatchId == null ? null : hospitalsbatchId.trim();
    }

    public String getBatchname() {
        return batchname;
    }

    public void setBatchname(String batchname) {
        this.batchname = batchname == null ? null : batchname.trim();
    }

    public Date getDcreatedtime() {
        return dcreatedtime;
    }

    public void setDcreatedtime(Date dcreatedtime) {
        this.dcreatedtime = dcreatedtime;
    }

    public Integer getDstatus() {
        return dstatus;
    }

    public void setDstatus(Integer dstatus) {
        this.dstatus = dstatus;
    }

    public String getHospitaloperator() {
        return hospitaloperator;
    }

    public void setHospitaloperator(String hospitaloperator) {
        this.hospitaloperator = hospitaloperator == null ? null : hospitaloperator.trim();
    }

    public Integer getHospitaldrugcount() {
        return hospitaldrugcount;
    }

    public void setHospitaldrugcount(Integer hospitaldrugcount) {
        this.hospitaldrugcount = hospitaldrugcount;
    }

    public Integer getDiagnosecount() {
        return diagnosecount;
    }

    public void setDiagnosecount(Integer diagnosecount) {
        this.diagnosecount = diagnosecount;
    }

    public Integer getDictcount() {
        return dictcount;
    }

    public void setDictcount(Integer dictcount) {
        this.dictcount = dictcount;
    }

    public Integer getSlicescount() {
        return slicescount;
    }

    public void setSlicescount(Integer slicescount) {
        this.slicescount = slicescount;
    }

    public Integer getHistoryprescriptioncount() {
        return historyprescriptioncount;
    }

    public void setHistoryprescriptioncount(Integer historyprescriptioncount) {
        this.historyprescriptioncount = historyprescriptioncount;
    }

    public Date getPrecompletetime() {
        return precompletetime;
    }

    public void setPrecompletetime(Date precompletetime) {
        this.precompletetime = precompletetime;
    }

    public Integer getBatchtype() {
        return batchtype;
    }

    public void setBatchtype(Integer batchtype) {
        this.batchtype = batchtype;
    }

    public String getCoreversionname() {
        return coreversionname;
    }

    public void setCoreversionname(String coreversionname) {
        this.coreversionname = coreversionname == null ? null : coreversionname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalsbatchId=").append(hospitalsbatchId);
        sb.append(", batchname=").append(batchname);
        sb.append(", dcreatedtime=").append(dcreatedtime);
        sb.append(", dstatus=").append(dstatus);
        sb.append(", hospitaloperator=").append(hospitaloperator);
        sb.append(", hospitaldrugcount=").append(hospitaldrugcount);
        sb.append(", diagnosecount=").append(diagnosecount);
        sb.append(", dictcount=").append(dictcount);
        sb.append(", slicescount=").append(slicescount);
        sb.append(", historyprescriptioncount=").append(historyprescriptioncount);
        sb.append(", precompletetime=").append(precompletetime);
        sb.append(", batchtype=").append(batchtype);
        sb.append(", coreversionname=").append(coreversionname);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Hospitalsbatch other = (Hospitalsbatch) that;
        return (this.getHospitalsbatchId() == null ? other.getHospitalsbatchId() == null : this.getHospitalsbatchId().equals(other.getHospitalsbatchId()))
            && (this.getBatchname() == null ? other.getBatchname() == null : this.getBatchname().equals(other.getBatchname()))
            && (this.getDcreatedtime() == null ? other.getDcreatedtime() == null : this.getDcreatedtime().equals(other.getDcreatedtime()))
            && (this.getDstatus() == null ? other.getDstatus() == null : this.getDstatus().equals(other.getDstatus()))
            && (this.getHospitaloperator() == null ? other.getHospitaloperator() == null : this.getHospitaloperator().equals(other.getHospitaloperator()))
            && (this.getHospitaldrugcount() == null ? other.getHospitaldrugcount() == null : this.getHospitaldrugcount().equals(other.getHospitaldrugcount()))
            && (this.getDiagnosecount() == null ? other.getDiagnosecount() == null : this.getDiagnosecount().equals(other.getDiagnosecount()))
            && (this.getDictcount() == null ? other.getDictcount() == null : this.getDictcount().equals(other.getDictcount()))
            && (this.getSlicescount() == null ? other.getSlicescount() == null : this.getSlicescount().equals(other.getSlicescount()))
            && (this.getHistoryprescriptioncount() == null ? other.getHistoryprescriptioncount() == null : this.getHistoryprescriptioncount().equals(other.getHistoryprescriptioncount()))
            && (this.getPrecompletetime() == null ? other.getPrecompletetime() == null : this.getPrecompletetime().equals(other.getPrecompletetime()))
            && (this.getBatchtype() == null ? other.getBatchtype() == null : this.getBatchtype().equals(other.getBatchtype()))
            && (this.getCoreversionname() == null ? other.getCoreversionname() == null : this.getCoreversionname().equals(other.getCoreversionname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHospitalsbatchId() == null) ? 0 : getHospitalsbatchId().hashCode());
        result = prime * result + ((getBatchname() == null) ? 0 : getBatchname().hashCode());
        result = prime * result + ((getDcreatedtime() == null) ? 0 : getDcreatedtime().hashCode());
        result = prime * result + ((getDstatus() == null) ? 0 : getDstatus().hashCode());
        result = prime * result + ((getHospitaloperator() == null) ? 0 : getHospitaloperator().hashCode());
        result = prime * result + ((getHospitaldrugcount() == null) ? 0 : getHospitaldrugcount().hashCode());
        result = prime * result + ((getDiagnosecount() == null) ? 0 : getDiagnosecount().hashCode());
        result = prime * result + ((getDictcount() == null) ? 0 : getDictcount().hashCode());
        result = prime * result + ((getSlicescount() == null) ? 0 : getSlicescount().hashCode());
        result = prime * result + ((getHistoryprescriptioncount() == null) ? 0 : getHistoryprescriptioncount().hashCode());
        result = prime * result + ((getPrecompletetime() == null) ? 0 : getPrecompletetime().hashCode());
        result = prime * result + ((getBatchtype() == null) ? 0 : getBatchtype().hashCode());
        result = prime * result + ((getCoreversionname() == null) ? 0 : getCoreversionname().hashCode());
        return result;
    }
}