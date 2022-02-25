def call(Closure body) {
    body()
    def log = sh(script: "echo inside logStepsGroovy log func")
    def exists = fileExists 'logGroovyFile.log'
    def filecontent = exists? readFile('logGroovyFile.log') : ''
    writeFile(file: 'logGroovyFile.log', text: filecontent+"\n${log}")
}