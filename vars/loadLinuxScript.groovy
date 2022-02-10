def call(Map args = [:]) {
    def content = libraryResource "linux/scripts/${args.scriptName}"
    writeFile file: "${args.scriptName}", text: content
    sh "chmod +x ${args.scriptName}" 
}