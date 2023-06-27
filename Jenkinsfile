pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/imeshsen/Customer-management-system.git'
            }
        }

        stage('Permission settings') {
            steps {
                sh 'chmod +x *.bash'
            }
        }

        stage('Run') {
            steps {
                sh './*.bash'
            }
        }
    }
}
