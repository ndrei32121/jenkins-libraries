def call(Closure body, String log) {
    body()
    def filecontent = readFile 'logGroovyFile.log'
    writeFile(file: 'logGroovyFile.log', text: filecontent+"\n${log}")
    
}