def call(String log, Closure body) {
    body()
    def filecontent = readFile 'logGroovyFile.log'
    writeFile(file: 'logGroovyFile.log', text: filecontent+"\n${log}")
}