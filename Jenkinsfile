
def commit_id
pipeline {
    agent any
    stages {
        stage('Preparation') {
            steps {
                checkout scm
                sh 'git rev-parse --short HEAD > .git/commit-id'
                commit_id = readFile('.git/commit-id').trim()
                sh 'chmod +x mvnw'
            }
        }
        stage('Compile') {
            steps {
                sh './mvnw compile'
            }
        }
        stage('test') {
            steps {
                sh './mvnw test'
            }
        }
        stage('docker build/push') {
            steps {
                sh 'echo Work In progress'
            }
        }
    }
}
