pipeline {
    agent { docker { image 'maven' } }
    stages {
         stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
    stage('Deliver') {
        steps {
            sh 'deliver.sh'
        }
    }
}