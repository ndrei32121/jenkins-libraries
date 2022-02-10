def call(Map arguments = [:]) {
    loadLinuxScript(scriptName: ${arguments.scriptName})
    sh "bash ./${args.scriptName}"
}