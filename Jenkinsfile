pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/imeshsen/Customer-management-system.git'
            }
        }

        stage('Run') {
            steps {
                sh '''
                chmod +x run.bash
                ./run.bash
                '''
            }
        }
    }
}
