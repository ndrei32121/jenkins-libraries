def call(Closure body) {
    def logs = []
    logs << "Start with tests"
    body()
    logs << "Done with tests"
    
    logs.each { 
        def readContent = readFile "logGroovyFile.log"
        writeFile(file: 'logGroovyFile.log', text: "$readcontent\n$it\n") 
    }
    
}