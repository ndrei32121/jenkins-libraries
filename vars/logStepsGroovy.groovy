def call(Closure body) {
    def logs = []
    logs << "Start with tests"
    body()
    logs << "Done with tests"
    def readContent = readFile "logGroovyFile.log"
    logs.each { writeFile(file: 'logGroovyFile.log', text: "$readcontent\n$it\n") }
    
}