package com.akiteam.demo.pojo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "动态时间列表")
public class TimeNode {

    /**
     * 动态时间列表
     */
    @Schema(name = "list",description = "动态时间列表")
    List<Integer> list;
}
