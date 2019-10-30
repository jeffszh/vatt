package cn.jeff.app.vatt

import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.html.Label
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.textfield.PasswordField
import com.vaadin.flow.component.textfield.TextField
import com.vaadin.flow.router.Route
import java.lang.StringBuilder
import kotlin.random.Random

@Route("pwExercise")
class PwExerciseView : VerticalLayout() {

	private val rnd = Random.Default
	private val exampleTextField = TextField("这是密码样本：")
	private val inputArea = PasswordField("跟着上面输入：")
	private val scoreText = Label(" ")
	private val inputResult = TextField("实际输入内容：")

	init {
		defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
		add(H2("练习输入密码"))
		add(exampleTextField)
		exampleTextField.isReadOnly = true
		add(inputArea, Button("OK") {
			onOkClicked()
		})
		inputArea.isAutofocus = true
		add(scoreText)
		add(inputResult)
		inputResult.isReadOnly = true
		add(HorizontalLayout().apply {
			add(Button("重做") {
				onRedoClicked()
			})
			add(Button("下一题") {
				generateQuestion()
			})
		})
		addHomeButton()
		generateQuestion()
	}

	private fun onOkClicked() {
		inputResult.value = inputArea.value
		inputArea.isReadOnly = true
		scoreText.text = if (exampleTextField.value == inputResult.value)
			"正确" else "错误！！！"
	}

	private fun onRedoClicked() {
		inputArea.isReadOnly = false
		inputArea.clear()
		inputArea.focus()
	}

	private fun generateQuestion() {
		val sb = StringBuilder()
		repeat(4) {
			val r = rnd.nextInt(26)
			val c = 'A' + r
			sb.append(c)
		}
		repeat(6) {
			val r = rnd.nextInt(10)
			val c = '0' + r
			sb.append(c)
		}
		exampleTextField.value = sb.toString()
		inputArea.isReadOnly = false
		inputArea.clear()
		inputArea.focus()
	}

}
