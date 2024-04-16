package com.akiteam.demo.util;

import org.apache.commons.lang3.StringUtils;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MoneyUtils {

    private static final String[] cnNums = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" }; // 汉字的数字
    private static final String[] cnIntRadice = { "", "拾", "佰", "仟" }; // 基本单位
    private static final String[] cnIntUnits = { "", "万", "亿", "兆" }; // 对应整数部分扩展单位
    private static final String[] cnDecUnits = { "角", "分"}; // 对应小数部分单位
    private static final String cnInteger = "整"; // 整数金额时后面跟的字符
    private static final String cnIntLast = "元"; // 整型完以后的单位

    /**
     * 金额大小写转换，将数字转换为汉字
     * @param money 支持最大16位整数2位小数
     * @return
     */
    public static String amountConversion(String money){
        //如果传入为空，则返回null
        if(StringUtils.isBlank(money)){
            return "null";
        }
        String result = "";
        //整数部分
        String integer="";
        //小数部分
        String point="";
        if(money.matches("^[0-9]{0,16}|[0-9]{0,16}+([.]{0,1}[0-9]{0,2})$")){
            BigDecimal bigDecimal = new BigDecimal(money);
            //对金额进行格式化，统一小数点后面保留两位。 此举能去除整数部分多余的0，以及小数部分统一保留两位 如：00456.1-->456.10
            money = new DecimalFormat("##0.00").format(bigDecimal);
            //整数部分
            integer = money.split("\\.").length==1?money:money.split("\\.")[0];
            //小数部分
            point = money.split("\\.").length==1?"00":money.split("\\.")[1];


            if("0".equals(integer)){
                result = "零"+cnIntLast;
            }else{
                int zeroCount = 0;
                char[] array = integer.toCharArray();
                String n="";
                int p=0,q=0,m=0;
                for (int i = 0; i < integer.length(); i++) {
                    n = Character.toString(array[i]);
                    p = integer.length() - i - 1;
                    q = p / 4;
                    m = p % 4;
                    if (n.equals("0")) {
                        zeroCount++;
                    } else {
                        if (zeroCount > 0) {
                            result += cnNums[0];
                        }
                        zeroCount = 0; // 归零
                        result += cnNums[Integer.parseInt(n)] + cnIntRadice[m];
                    }
                    if (m == 0 && zeroCount < 4) {
                        result += cnIntUnits[q];
                    }
                }
                result += cnIntLast;
            }

            //组装小数部分
            if ("00".equals(point)) {
                result += cnInteger;
            }else{
                String n="";
                char[] array = point.toCharArray();
                for (int i = 0; i < point.length(); i++) {
                    n = Character.toString(array[i]);
                    if (!n.equals("0")) {
                        result += cnNums[Integer.parseInt(n)] + cnDecUnits[i];
                    }
                }
            }


        }else{
            return "请检查金额（整数位不能超过16位,小数不能超过2位）";
        }

        return result;
    }
}


