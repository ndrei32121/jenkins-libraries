def call(Closure body) {
    def logs = []
    logs << "Start with tests"
    body()
    logs << "Done with tests"
    writeFile(file: 'logGroovyFile.log', text: logs.join("\n"))
    // logs.each {
    //     writeFile(file: 'logGroovyFile.log', text: "$readcontent\n$it\n")
    //     def readContent = readFile "logGroovyFile.log"
    // }
    
}