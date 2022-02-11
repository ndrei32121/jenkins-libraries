def call(Closure body) {
    def logs = []
    logs << "Done with tests"
    body()
    File logFile = new File("./logFileGroovy.log")
    logs.each { logFile.append("$it\n")}
}