pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                dir('project') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Test') {
            steps {
                dir('project') {
                    sh 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }
}
