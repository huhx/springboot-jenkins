pipeline {
    agent { docker { image 'maven' } }
    stages {
         stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
         stage('Deliver') {
            steps {
                sh 'nohup java -jar target/demo-0.0.1-SNAPSHOT.jar > log.txt &'
            }
        }
    }
}