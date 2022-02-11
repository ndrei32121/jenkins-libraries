def call(Closure body) {
    def logs = []
    logs << "Done with tests"
    body()
    sh(script: "touch ./logFileGroovy.log && chmod ug+rw ./logFileGroovy.log")
    File logFile = new File("./logFileGroovy.log")
    logs.each { logFile.append("$it\n")}
}