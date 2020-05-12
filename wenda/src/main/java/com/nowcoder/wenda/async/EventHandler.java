package com.nowcoder.wenda.async;

import java.util.List;

//专门处理event
public interface EventHandler {
    void doHandle(EventModel model);

    //得到该Handler所支持的所有Event
    List<EventType> getSupportEventTypes();
}
