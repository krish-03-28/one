pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git branch: 'main',
                    url: 'YOUR-GITHUB-REPOSITORY-URL'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t real-estate-app .'
            }
        }

        stage('Docker Deploy') {
            steps {
                sh '''
                    docker stop real-estate-container || true
                    docker rm real-estate-container || true

                    docker run -d \
                    -p 8080:8080 \
                    --name real-estate-container \
                    real-estate-app
                '''
            }
        }
    }
}
