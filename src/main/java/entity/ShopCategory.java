package entity;

import java.util.Date;

public class ShopCategory {
    private  Long shopCategoryId;
    private  String shopCatgoryName;
    private String shopCatgoryDesc;
    private  String shopCatgoryImg;
    private  Integer priority;
    private Date createTime;
    private  Date lastEditTime;
    private  ShopCategory parent;

    public Long getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Long shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopCatgoryName() {
        return shopCatgoryName;
    }

    public void setShopCatgoryName(String shopCatgoryName) {
        this.shopCatgoryName = shopCatgoryName;
    }

    public String getShopCatgoryDesc() {
        return shopCatgoryDesc;
    }

    public void setShopCatgoryDesc(String shopCatgoryDesc) {
        this.shopCatgoryDesc = shopCatgoryDesc;
    }

    public String getShopCatgoryImg() {
        return shopCatgoryImg;
    }

    public void setShopCatgoryImg(String shopCatgoryImg) {
        this.shopCatgoryImg = shopCatgoryImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public ShopCategory getParent() {
        return parent;
    }

    public void setParent(ShopCategory parent) {
        this.parent = parent;
    }
}
