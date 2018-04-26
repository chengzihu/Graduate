package top.kuangcp.graduate.domain;

import com.kuangcp.mythpoi.excel.base.ExcelTransform;
import com.kuangcp.mythpoi.utils.base.ExcelConfig;
import com.kuangcp.mythpoi.utils.base.ExcelSheet;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by https://github.com/kuangcp on 17-11-26  下午8:57
 * 班级 实体
 * @author kuangcp
 */
@Data
@Entity
@ExcelSheet(importTitle = "班级表", exportTitle = "班级表")
public class ClassGroup implements Serializable, ExcelTransform{
    @Id
    @GeneratedValue
    private long groupId;
    @ExcelConfig("名称")
    private String name;
}
