def call(String log, Closure body) {
    body()
    def exists = fileExists 'logGroovyFile.log'
    def filecontent = exists ? readFile 'logGroovyFile.log' : null
    writeFile(file: 'logGroovyFile.log', text: filecontent+"\n${log}")
}