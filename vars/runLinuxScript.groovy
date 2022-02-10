def call(Map arguments = [:]) {
    loadLinuxScript(scriptName: "${arguments.scriptName}")
    sh "bash ./${arguments.scriptName}"
}


def loadLinuxScript(Map args = [:]) {
    def content = libraryResource "linux/scripts/${args.scriptName}"
    writeFile file: "${args.scriptName}", text: content
    sh "chmod +x ${args.scriptName}" 
}