package org.willen.sc.sysadmin.organization.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import org.willen.sc.common.core.entity.po.BasePo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("\"group\"")
public class Group extends BasePo {
    private String name;
    private long parentId;
    private String description;
}
