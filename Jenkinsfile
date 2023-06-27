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
                sh 'chmod +x run.bash'
            }
        }

        stage('Run') {
            steps {
                sh './run.bash'
            }
        }
    }
}
