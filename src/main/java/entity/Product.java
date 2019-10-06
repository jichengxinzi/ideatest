package entity;

import java.util.Date;
import java.util.List;

public class Product {
    private  Long productId;
    private  String productName;
    private  String productDesc;
    //简略图
    private  String imgAddr;
    private  String  normalPrice;
    private  String  promotiomPrice;
    private  Integer priority;
    private Date createTime;
    private  Date lastEitTime;
    //-1 不可用 0 下架 1 在前端展示系统展示
    private  Integer enableStatus;
    private List<ProductImg> productImgList;
    private  ProductCategory productCategory;
    private Shop shop;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getPromotiomPrice() {
        return promotiomPrice;
    }

    public void setPromotiomPrice(String promotiomPrice) {
        this.promotiomPrice = promotiomPrice;
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

    public Date getLastEitTime() {
        return lastEitTime;
    }

    public void setLastEitTime(Date lastEitTime) {
        this.lastEitTime = lastEitTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public List<ProductImg> getProductImgList() {
        return productImgList;
    }

    public void setProductImgList(List<ProductImg> productImgList) {
        this.productImgList = productImgList;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
