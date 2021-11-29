pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    triggers { pollSCM('H/2 * * * *') }
    stages {
        stage('Build') {
            steps {
                dir("jenkins-maven")
                {
                    sh 'mvn -B compile'
                    sh 'mvn -B test'
                    sh 'mvn -B package'
                }
            }
        }
    }
}
