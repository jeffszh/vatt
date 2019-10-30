package cn.jeff.app.vatt

import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout

fun VerticalLayout.addHomeButton(text: String = "返回主页") {
	val button = Button(text) {
		ui.get().navigate("")
	}
	setHorizontalComponentAlignment(FlexComponent.Alignment.END, button)
	add(button)
}
