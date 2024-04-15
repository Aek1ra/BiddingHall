package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "未读通知信息")
public class UnreadInformation {

    /**
     * 未读通知信息
     */
    @Schema(name = "content",description = "未读通知信息")
    private String content;

}
