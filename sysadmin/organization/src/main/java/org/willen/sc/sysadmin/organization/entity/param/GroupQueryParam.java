package org.willen.sc.sysadmin.organization.entity.param;

import org.willen.sc.common.core.entity.param.BaseParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupQueryParam extends BaseParam {
    private String name;
    private Date createdTimeStart;
    private Date createdTimeEnd;
}
