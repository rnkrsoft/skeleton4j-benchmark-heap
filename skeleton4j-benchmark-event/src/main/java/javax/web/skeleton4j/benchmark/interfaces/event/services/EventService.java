package javax.web.skeleton4j.benchmark.interfaces.event.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.event.domains.*;

/**
 * Created by rnkrsoft.com on 2019/5/11.
 */
@ApidocService("事件服务")
public interface EventService {
    @ApidocInterface("元素失去焦点事件")
    EventResponse eventBlur(EventBlurRequest request);
    @ApidocInterface("值改变事件")
    EventResponse eventChange(EventChangeRequest request);
    @ApidocInterface("单击事件")
    EventResponse eventClick(EventClickRequest request);
    @ApidocInterface("双击事件")
    EventResponse eventDblClick(EventDblclickRequest request);
    @ApidocInterface("获取焦点")
    EventResponse eventFocus(EventFocusRequest request);
    @ApidocInterface("键盘按键被按下事件")
    EventResponse eventKeyDown(EventKeyDownRequest request);
    @ApidocInterface("键盘按键被按下并松开事件")
    EventResponse eventKeyPress(EventKeyPressRequest request);
    @ApidocInterface("键盘按键被松开事件")
    EventResponse eventKeyUp(EventKeyUpRequest request);
    @ApidocInterface("鼠标按钮时按下事件")
    EventResponse eventMouseDown(EventMouseDownRequest request);
    @ApidocInterface("鼠标指针进入（穿过）元素时")
    EventResponse eventMouseEnter(EventMouseEnterRequest request);
    @ApidocInterface("当鼠标指针离开元素事件")
    EventResponse eventMouseLeave(EventMouseLeaveRequest request);
    @ApidocInterface("鼠标被移动事件")
    EventResponse eventMouseMove(EventMouseMoveRequest request);
    @ApidocInterface("鼠标从某元素移开")
    EventResponse eventMouseOut(EventMouseOutRequest request);
    @ApidocInterface("当鼠标指针位于元素上方时时")
    EventResponse eventMouseOver(EventMouseOverRequest request);
    @ApidocInterface("当松开鼠标按钮时")
    EventResponse eventMouseUp(EventMouseUpRequest request);
    @ApidocInterface("文本被选中")
    EventResponse eventSelect(EventSelectRequest request);
    @ApidocInterface("复杂")
    EventResponse eventComplex(EventComplexRequest request);
}
