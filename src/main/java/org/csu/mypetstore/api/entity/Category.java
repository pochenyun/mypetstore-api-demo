package org.csu.mypetstore.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;

@Data
@TableName("category")
public class Category implements Serializable
{
    private static final long serialVersionUID = 6804536240033522156L;

    @TableId(value = "catid", type = IdType.INPUT)
    private String categoryId;
    @TableField(value = "name")
    private String name;
    @TableField(value = "descn")
    private String description;
}
