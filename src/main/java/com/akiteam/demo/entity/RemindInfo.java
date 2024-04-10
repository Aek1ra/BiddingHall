package com.akiteam.demo.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Schema(name = "提醒通知表")
@TableName(value = "remind_info")
public class RemindInfo {

    /**
     * 提醒id
     */
    @Schema(name = "id",description = "提醒id")
    private Integer id;

    /**
     * 提醒标题
     */
    @Schema(name = "title",description = "提醒标题")
    private String title;

    /**
     * 提醒内容
     */
    @Schema(name = "content",description = "提醒内容")
    private String content;

    /**
     * 0-未读 1-已读 2-已删除在回收站中 3-已删除
     */
    @Schema(name = "status",description = "提醒状态")
    private String status;

    /**
     * 提醒创建时间
     */
    @Schema(name = "createTime",description = "提醒创建时间")
    private Timestamp createTime;

    /**
     * 提醒更新时间(在进行删除 阅读的时候都要更新)
     */
    @Schema(name = "updateTime",description = "提醒更新时间")
    private Timestamp updateTime;

    /**
     * 提醒对应的用户id
     */
    @Schema(name = "userId",description = "提醒对应的用户id")
    private Integer userId;
}
