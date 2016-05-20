package org.seckill.enums;

/**
 * 使用枚举表示常量数据字段
 * Created by compaq on 2016/5/20.
 */
public enum SeckillStatEnum {
    SUCCESS(1, "秒杀成功"),
    END(0, "秒杀结束"),
    REPEAT_KILL(-1, "重复秒杀"),
    INNER_ERROR(-2, "系统异常"),
    DATA_REWRITE(-3, "数据篡改");

    private int stat;

    private String statInfo;

    SeckillStatEnum(int stat, String statInfo) {
        this.stat = stat;
        this.statInfo = statInfo;
    }

    public int getStat() {
        return stat;
    }

    public String getStatInfo() {
        return statInfo;
    }

    public static SeckillStatEnum stateOf(int index) {
        for (SeckillStatEnum state : values()) {
            if (state.getStat() == index) {
                return state;
            }
        }
        return null;
    }
}
