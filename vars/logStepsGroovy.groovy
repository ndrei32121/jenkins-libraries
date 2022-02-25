def call(String log, Closure body) {
    body()
    if (fileExists 'logGroovyFile.log') {
        def filecontent = readFile 'logGroovyFile.log'
    } else {
        def filecontent = ''
    }
    writeFile(file: 'logGroovyFile.log', text: filecontent+"\n${log}")
}