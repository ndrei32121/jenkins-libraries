def call(Closure body) {
    logs << "Done with tests"
    body()
    File logFile = new File("./logFileGroovy.log")
    logs.each { logFile.append("$it\n")}
}