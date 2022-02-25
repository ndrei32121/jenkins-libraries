def call(String log, Closure body) {
    body()
    def exists = fileExists 'logGroovyFile.log'
    if (exists) {
        def filecontent = readFile 'logGroovyFile.log'
    } else {
        def filecontent = ''
    }
    writeFile(file: 'logGroovyFile.log', text: filecontent+"\n${log}")
}