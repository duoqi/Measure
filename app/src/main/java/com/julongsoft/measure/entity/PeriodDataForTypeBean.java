package com.julongsoft.measure.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author taodq
 * @version V1.0
 * @Description
 * @Date 2018/6/12.
 * @Copyright Copyright  2010-2017 TigerFace All Rights Reserved
 */
public class PeriodDataForTypeBean {


    /**
     * pageNo : 1
     * pageSize : 10
     * count : 2
     * list : [{"id":null,"segmentId":null,"code":"变更申请编号","title":"单位名称","addr":null,"ygbgAmount":null,"cbr":null,"bgyj":null,"gcmc":null,"lstPrdPaySum":100,"prdPay":200,"thisPrdPaySum":300,"state":null,"stateStr":null,"signData":[]},{"id":null,"segmentId":null,"code":"变更申请编号1","title":"单位名称1","addr":null,"ygbgAmount":null,"cbr":null,"bgyj":null,"gcmc":null,"lstPrdPaySum":1100,"prdPay":1200,"thisPrdPaySum":2300,"state":null,"stateStr":null,"signData":[]}]
     * totalPage : 1
     */

    private int pageNo;
    private int pageSize;
    private int count;
    private int totalPage;
    private List<ListBean> list;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean implements Serializable{
        /**
         * id : null
         * segmentId : null
         * code : 变更申请编号
         * title : 单位名称
         * addr : null
         * ygbgAmount : null
         * cbr : null
         * bgyj : null
         * gcmc : null
         * lstPrdPaySum : 100.0
         * prdPay : 200.0
         * thisPrdPaySum : 300.0
         * state : null
         * stateStr : null
         * signData : []
         */

        private int id;
        private Object segmentId;
        private String code;
        private String title;
        private String addr;
        private double ygbgAmount;
        private String cbr;
        private String bgyj;
        private String gcmc;
        private double lstPrdPaySum;
        private double prdPay;
        private double thisPrdPaySum;
        private Object state;
        private Object stateStr;
        private List<?> signData;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getSegmentId() {
            return segmentId;
        }

        public void setSegmentId(Object segmentId) {
            this.segmentId = segmentId;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public double getYgbgAmount() {
            return ygbgAmount;
        }

        public void setYgbgAmount(double ygbgAmount) {
            this.ygbgAmount = ygbgAmount;
        }

        public String getCbr() {
            return cbr;
        }

        public void setCbr(String cbr) {
            this.cbr = cbr;
        }

        public String getBgyj() {
            return bgyj;
        }

        public void setBgyj(String bgyj) {
            this.bgyj = bgyj;
        }

        public String getGcmc() {
            return gcmc;
        }

        public void setGcmc(String gcmc) {
            this.gcmc = gcmc;
        }

        public double getLstPrdPaySum() {
            return lstPrdPaySum;
        }

        public void setLstPrdPaySum(double lstPrdPaySum) {
            this.lstPrdPaySum = lstPrdPaySum;
        }

        public double getPrdPay() {
            return prdPay;
        }

        public void setPrdPay(double prdPay) {
            this.prdPay = prdPay;
        }

        public double getThisPrdPaySum() {
            return thisPrdPaySum;
        }

        public void setThisPrdPaySum(double thisPrdPaySum) {
            this.thisPrdPaySum = thisPrdPaySum;
        }

        public Object getState() {
            return state;
        }

        public void setState(Object state) {
            this.state = state;
        }

        public Object getStateStr() {
            return stateStr;
        }

        public void setStateStr(Object stateStr) {
            this.stateStr = stateStr;
        }

        public List<?> getSignData() {
            return signData;
        }

        public void setSignData(List<?> signData) {
            this.signData = signData;
        }
    }
}
