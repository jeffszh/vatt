package cn.jeff.app.vatt

import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route("keyPosEx")
class KeyPosExView : VerticalLayout() {

	init {
		defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
		add(H2("键位练习"))
		add("此功能目前还没做好，正日夜兼程赶进度，敬请期待！")
		addHomeButton()
	}

}
