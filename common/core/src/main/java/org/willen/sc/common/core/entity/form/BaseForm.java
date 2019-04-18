package org.willen.sc.common.core.entity.form;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.willen.sc.common.core.entity.po.BasePo;

@ApiModel
@Slf4j
@Data
public class BaseForm<T extends BasePo> {

    private String username;

    /**
     * From转化为Po，进行后续业务处理
     *
     * @param clazz
     * @return
     */
    public T toPo(Class<T> clazz) {
        T t = null;
        try {
            t = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            log.error("Po NewInstance Error");
        }
        BeanUtils.copyProperties(this, t);
        return t;
    }


}
