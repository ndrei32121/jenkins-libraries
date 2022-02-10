def call(Map arguments = [:]) {
    loadLinuxScript(scriptName: "${arguments.scriptName}")
    sh "bash ./${arguments.scriptName}"
}