package org.csu.mypetstore.api.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Manager
{
    @TableField(value = "id")
    private String id;
    @TableField(value = "password")
    private String password;
}
