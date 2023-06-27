pipeline {
    agent any

    // tools {
    //     maven 'Maven 3.8.4'
    // }

    stages {
        stage('Clone') {
            steps {
                sh 'git clone https://github.com/imeshsen/Customer-management-system.git'
            }
        }

        stage('Run') {
            steps {
                sh './run.bash'
            }
        }
    }
}

