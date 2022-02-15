def call(Closure body) {
    def logs = []
    logs << "Start with tests"
    body()
    logs << "Done with tests"
    
    logs.each { 
        writeFile(file: 'logGroovyFile.log', text: "$readcontent\n$it\n")
        def readContent = readFile "logGroovyFile.log"
    }
    
}