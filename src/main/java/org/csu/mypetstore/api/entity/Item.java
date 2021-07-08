package org.csu.mypetstore.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("item")
public class Item implements Serializable {

  private static final long serialVersionUID = -2159121673445254631L;

  @TableId(value = "itemid", type = IdType.INPUT)
  private String itemId;
  @TableField(value = "productid")
  private String productId;
  @TableField(value = "listprice")
  private BigDecimal listPrice;
  @TableField(value = "unitcost")
  private BigDecimal unitCost;
  @TableField(value = "supplier")
  private int supplierId;
  @TableField(value = "status")
  private String status;
  @TableField(value = "attr1")
  private String attribute1;
  @TableField(value = "attr2")
  private String attribute2;
  @TableField(value = "attr3")
  private String attribute3;
  @TableField(value = "attr4")
  private String attribute4;
  @TableField(value = "attr5")
  private String attribute5;
}
