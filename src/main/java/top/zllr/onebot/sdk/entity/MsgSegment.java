package top.zllr.onebot.sdk.entity;

import top.zllr.onebot.sdk.enums.MsgType;

import java.util.Map;

/**
 * Project: onebot-sdk
 * Author: cnlimiter
 * Date: 2023/2/10 1:30
 * Description:
 */
public class MsgSegment {
    private final MsgType type;

    protected Map<String, String> data;

    public MsgSegment(MsgType type) {
        this.type = type;
    }

    public MsgType getType() {
        return type;
    }

    public Map<String, String> getData() {
        return data;
    }
}
