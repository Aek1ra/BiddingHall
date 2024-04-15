package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "通知信息")
public class GetInformation {

    /**
     * 获取通知信息标题
     */
    @Schema(name = "title",description = "通知信息标题")
    private String title;

    /**
     * 获取通知信息标题
     */
    @Schema(name = "id",description = "通知信息ID")
    private String id;
}
