package cn.jeff.app.vatt

import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.html.H3
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route("")
class MainView : VerticalLayout() {

	init {
		add(H3("打字練習"), Button("開始"))
	}

}
