def call(Map arguments = [:]) {
    sh "echo 'hello ${arguments.name} from $(hostname)'"
}