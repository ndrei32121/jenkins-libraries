def call(String log, Closure body) {
    body()
    def exists = fileExists 'logGroovyFile.log'
    def filecontent = exists? readFile 'logGroovyFile.log' : ''
    writeFile(file: 'logGroovyFile.log', text: filecontent+"\n${log}")
}