def call(Closure body) {
    def logs = []
    logs << "Start with tests"
    body()
    logs << "Done with tests"
    logs.each { writeFile(file: 'readme.txt', text: "$it\n") }
    
}