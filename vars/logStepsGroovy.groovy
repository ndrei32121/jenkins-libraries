def call(Closure body) {
    def logs = []
    logs << "Done with tests"
    body()
    File logFile = new File("./logFileGroovy.log")
    sh(script: "chmod ug+rw ./logFileGroovy.log")
    logs.each { logFile.append("$it\n")}
}