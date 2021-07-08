package org.csu.mypetstore.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("product")
public class Product implements Serializable
{
    private static final long serialVersionUID = -7492639752670189553L;

    @TableId(value = "productid", type = IdType.INPUT)
    private String productId;
    @TableField(value = "category")
    private String categoryId;
    private String name;
    @TableField(value = "descn")
    private String description;
}
