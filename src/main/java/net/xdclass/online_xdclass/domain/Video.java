package net.xdclass.online_xdclass.domain;

import java.util.Date;

/**
 * `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
 *   `title` varchar(524) DEFAULT NULL COMMENT '视频标题',
 *   `summary` varchar(1026) DEFAULT NULL COMMENT '概述',
 *   `cover_img` varchar(524) DEFAULT NULL COMMENT '封面图',
 *   `price` int(11) DEFAULT NULL COMMENT '价格,分',
 *   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
 *   `c_id` int(10) DEFAULT NULL COMMENT '子分类id',
 *   `point` double(11,2) DEFAULT '8.70' COMMENT '默认8.7，最高10分',
 */
public class Video {
    private Integer id;
    private String title;
    private String summary;
    private String coverImg;
    private Integer price;
    private Date createTime;
    private Integer cId;
    private Double point;

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", cId=" + cId +
                ", point=" + point +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }
}
