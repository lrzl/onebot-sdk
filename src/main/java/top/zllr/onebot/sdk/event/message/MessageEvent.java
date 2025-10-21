package top.zllr.onebot.sdk.event.message;

import top.zllr.onebot.sdk.entity.MsgSegment;
import top.zllr.onebot.sdk.event.Event;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 基础消息
 *
 * @author cnlimiter
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MessageEvent extends Event {

    @SerializedName( "message_type")
    private String messageType;

    @SerializedName( "user_id")
    private long userId;

    @SerializedName( "message")
    private String message;

    @SerializedName( "raw_message")
    private String rawMessage;

    @SerializedName( "font")
    private int font;

    private List<MsgSegment> msgSegment;

}
