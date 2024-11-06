; Open the dialog and wait for it to appear
WinWaitActive("Open")

; Focus on the input field (if needed)
ControlFocus("Open", "", "Edit1")

; Type the first file path and press Enter
Send("C:\Users\Mahesh\eclipse-workspace\Selenium-ByPavanKumar\src\test\java\pageObjectPackage\Dummy.txt{ENTER}")

; Type the second file path and press Ctrl+O to open the file dialog again
Send("C:\Users\Mahesh\eclipse-workspace\Selenium-ByPavanKumar\src\test\java\pageObjectPackage\Dummy2.txt{ENTER}")

; Click the Open button (if applicable)
ControlClick("Open", "", "Button1")
