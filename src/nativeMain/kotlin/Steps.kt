import kotlinx.cinterop.ExperimentalForeignApi
import platform.windows.HWND

@OptIn(ExperimentalForeignApi::class)
enum class Steps(
    val elements: List<HWND?>,
    val clicked: (Int) -> Int
) {
    SELECT_LANGUAGE(
        elements = listOf(title, text1_1, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, separator, nextButton, cancelButton),
        clicked = { languagePageCommand(it) }
    ),

    LICENSE(
        elements = listOf(title, text2, separator, backButton, nextButton, cancelButton),
        clicked = { licensePageCommand(it) }
    ),

    CODM_KEYMAP(
        elements = listOf(vSeparator, separator, container, skipButton, backButton, nextButton, cancelButton),
        clicked = { keymapPageCommand(it) }
    )
}