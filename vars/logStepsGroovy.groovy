def call(Closure body) {
    def logs = []
    logs << "Done with tests"
    body()
    sh(script: "touch /home/vagrant/logFileGroovy.log && chmod ugo+rw /home/vagrant/logFileGroovy.log && echo $pwd")
    File logFile = new File("/home/vagrant/logFileGroovy.log")
    logs.each { logFile.append("$it\n")}
}