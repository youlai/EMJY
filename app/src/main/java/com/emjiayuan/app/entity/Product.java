package com.emjiayuan.app.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Product implements Serializable{
    /*"id":"309",
            "weight":"0.00",
            "category":"123",
            "name":"【全国包邮】100个伊穆家园肉夹馍袋子 加厚不漏油",
            "subname":"",
            "images":"http:\/\/qiniu.emjiayuan.com\/products_headimg1525256099366",
            "images2":"http:\/\/qiniu.emjiayuan.com\/products_headimg1525256112573",
            "images3":"http:\/\/qiniu.emjiayuan.com\/products_headimg1525256121639",
            "images4":"",
            "guige":"100个\/份",
            "guigetag":"",
            "yunfei":"12",
            "content":"http:\/\/qiniu.emjiayuan.com\/products_detail1525256148244",
            "createtime":"0",
            "recommend":null,
            "freeshipping":"0",
            "tiptag":null,
            "comment":null,
            "source":"",
            "type":"1",
            "delflag":"0",
            "sort":null,
            "price":"18.00",
            "preprice":"19.00",
            "jifen":"1",
            "totalnum":"223",
            "sellnum":"23468",
            "lastnum":"0",
            "limitnum":"0",
            "giftjifen":"0",
            "gifttype":"0",
            "isnew":"1",
            "ishot":"1",
            "istejia":"1",
            "isvipdiscount":"1",
            "indexshow":"1",
            "sellstatus":"1",
            "top":"9",
            "guigeshow":"0",
            "spreadtype":"1",
            "catename":"精品餐具",
            "catetype":"0",
            "linkid":"0",
            "createdate":"1970-01-01 08:00:00"*/
    private String id;
    private String weight;
    private String category;
    private String name;
    private String subname;
    private String images;
    private String images2;
    private String images3;
    private String images4;
    private String guige;
    private String guigetag;
    private String yunfei;
    private String content;
    private String createtime;
    private String recommend;
    private String freeshipping;
    private String tiptag;
    private String comment;
    private String source;
    private String delflag;
    private String type;
    private String sort;
    private String price;
    private String preprice;
    private String jifen;
    private String totalnum;
    private String sellnum;
    private String lastnum;
    private String limitnum;
    private String giftjifen;
    private String gifttype;
    private String isnew;
    private String ishot;
    private String istejia;
    private String iscollection;
    private String isvipdiscount;
    private String indexshow;
    private String sellstatus;
    private String top;
    private String guigeshow;
    private String spreadtype;
    private String catename;
    private String catetype;
    private String linkid;
    private String createdate;
    private boolean checked;
    /**
     * recommend : null
     * tiptag : null
     * comment : null
     * sort : null
     * outerid : null
     * promotioninfo : {"type":"MS","name":"今日特价","price":"130","stock":"100","limitnum":"1","starttime":"1521095400","endtime":"1533484740","startdate":"2018-03-15 14:30:00","enddate":"2018-08-05 23:59:00"}
     * isbuy : 1
     */


    private Object outerid;
    private PromotioninfoBean promotioninfo;
    private int isbuy;

    public String getIscollection() {
        return iscollection;
    }

    public void setIscollection(String iscollection) {
        this.iscollection = iscollection;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getImages2() {
        return images2;
    }

    public void setImages2(String images2) {
        this.images2 = images2;
    }

    public String getImages3() {
        return images3;
    }

    public void setImages3(String images3) {
        this.images3 = images3;
    }

    public String getImages4() {
        return images4;
    }

    public void setImages4(String images4) {
        this.images4 = images4;
    }

    public String getGuige() {
        return guige;
    }

    public void setGuige(String guige) {
        this.guige = guige;
    }

    public String getGuigetag() {
        return guigetag;
    }

    public void setGuigetag(String guigetag) {
        this.guigetag = guigetag;
    }

    public String getYunfei() {
        return yunfei;
    }

    public void setYunfei(String yunfei) {
        this.yunfei = yunfei;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getFreeshipping() {
        return freeshipping;
    }

    public void setFreeshipping(String freeshipping) {
        this.freeshipping = freeshipping;
    }

    public String getTiptag() {
        return tiptag;
    }

    public void setTiptag(String tiptag) {
        this.tiptag = tiptag;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDelflag() {
        return delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPreprice() {
        return preprice;
    }

    public void setPreprice(String preprice) {
        this.preprice = preprice;
    }

    public String getJifen() {
        return jifen;
    }

    public void setJifen(String jifen) {
        this.jifen = jifen;
    }

    public String getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(String totalnum) {
        this.totalnum = totalnum;
    }

    public String getSellnum() {
        return sellnum;
    }

    public void setSellnum(String sellnum) {
        this.sellnum = sellnum;
    }

    public String getLastnum() {
        return lastnum;
    }

    public void setLastnum(String lastnum) {
        this.lastnum = lastnum;
    }

    public String getLimitnum() {
        return limitnum;
    }

    public void setLimitnum(String limitnum) {
        this.limitnum = limitnum;
    }

    public String getGiftjifen() {
        return giftjifen;
    }

    public void setGiftjifen(String giftjifen) {
        this.giftjifen = giftjifen;
    }

    public String getGifttype() {
        return gifttype;
    }

    public void setGifttype(String gifttype) {
        this.gifttype = gifttype;
    }

    public String getIsnew() {
        return isnew;
    }

    public void setIsnew(String isnew) {
        this.isnew = isnew;
    }

    public String getIshot() {
        return ishot;
    }

    public void setIshot(String ishot) {
        this.ishot = ishot;
    }

    public String getIstejia() {
        return istejia;
    }

    public void setIstejia(String istejia) {
        this.istejia = istejia;
    }

    public String getIsvipdiscount() {
        return isvipdiscount;
    }

    public void setIsvipdiscount(String isvipdiscount) {
        this.isvipdiscount = isvipdiscount;
    }

    public String getIndexshow() {
        return indexshow;
    }

    public void setIndexshow(String indexshow) {
        this.indexshow = indexshow;
    }

    public String getSellstatus() {
        return sellstatus;
    }

    public void setSellstatus(String sellstatus) {
        this.sellstatus = sellstatus;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getGuigeshow() {
        return guigeshow;
    }

    public void setGuigeshow(String guigeshow) {
        this.guigeshow = guigeshow;
    }

    public String getSpreadtype() {
        return spreadtype;
    }

    public void setSpreadtype(String spreadtype) {
        this.spreadtype = spreadtype;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

    public String getCatetype() {
        return catetype;
    }

    public void setCatetype(String catetype) {
        this.catetype = catetype;
    }

    public String getLinkid() {
        return linkid;
    }

    public void setLinkid(String linkid) {
        this.linkid = linkid;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }



    public Object getOuterid() {
        return outerid;
    }

    public void setOuterid(Object outerid) {
        this.outerid = outerid;
    }

    public PromotioninfoBean getPromotioninfo() {
        return promotioninfo;
    }

    public void setPromotioninfo(PromotioninfoBean promotioninfo) {
        this.promotioninfo = promotioninfo;
    }

    public int getIsbuy() {
        return isbuy;
    }

    public void setIsbuy(int isbuy) {
        this.isbuy = isbuy;
    }

    public static class PromotioninfoBean {
        /**
         * type : MS
         * name : 今日特价
         * price : 130
         * stock : 100
         * limitnum : 1
         * starttime : 1521095400
         * endtime : 1533484740
         * startdate : 2018-03-15 14:30:00
         * enddate : 2018-08-05 23:59:00
         */

        @SerializedName("type")
        private String typeX;
        @SerializedName("name")
        private String nameX;
        @SerializedName("price")
        private String priceX;
        private String stock;
        @SerializedName("limitnum")
        private String limitnumX;
        private String starttime;
        private String endtime;
        private String startdate;
        private String enddate;
        private String status;
        private String residuetime;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getResiduetime() {
            return residuetime;
        }

        public void setResiduetime(String residuetime) {
            this.residuetime = residuetime;
        }

        public String getTypeX() {
            return typeX;
        }

        public void setTypeX(String typeX) {
            this.typeX = typeX;
        }

        public String getNameX() {
            return nameX;
        }

        public void setNameX(String nameX) {
            this.nameX = nameX;
        }

        public String getPriceX() {
            return priceX;
        }

        public void setPriceX(String priceX) {
            this.priceX = priceX;
        }

        public String getStock() {
            return stock;
        }

        public void setStock(String stock) {
            this.stock = stock;
        }

        public String getLimitnumX() {
            return limitnumX;
        }

        public void setLimitnumX(String limitnumX) {
            this.limitnumX = limitnumX;
        }

        public String getStarttime() {
            return starttime;
        }

        public void setStarttime(String starttime) {
            this.starttime = starttime;
        }

        public String getEndtime() {
            return endtime;
        }

        public void setEndtime(String endtime) {
            this.endtime = endtime;
        }

        public String getStartdate() {
            return startdate;
        }

        public void setStartdate(String startdate) {
            this.startdate = startdate;
        }

        public String getEnddate() {
            return enddate;
        }

        public void setEnddate(String enddate) {
            this.enddate = enddate;
        }
    }
}
