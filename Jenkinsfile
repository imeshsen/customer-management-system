pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/imeshsen/Customer-management-system.git'
            }
        }

        stage('Docker setup') {
            steps {
                sh '''
                docker network create spring-network
                docker build -t spring .
                '''
            }
        }

        stage('Running MySQL container') {
            steps {
                sh '''
                docker run -d --rm --name --network spring-network -e MYSQL_ALLOW_EMPTY_PASSWORD=true mysql:latest
                '''
            }
        }

        stage('Running Backend container') {
            steps {
                sh '''
                docker run -d --rm --name --network spring-network -p 8081:8081 -e SPRING_DATASOURCE_URL=jdbc:mysql://mysql-container:3306/customer?createDatabaseIfNotExist=true -e SPRING_DATASOURCE_USERNAME=root spring
                '''
            }
        }
    }
}
