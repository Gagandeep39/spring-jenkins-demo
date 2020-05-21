node {
    def commit_id
    triggers {
        pollSCM('*/15 * * * *')
    }
    stage('Preparation') {
        checkout scm
        sh 'git rev-parse --short HEAD > .git/commit-id'
        commit_id = readFile('.git/commit-id').trim()
        sh 'chmod +x mvnw'
    }
    stage('Compile') {
            sh './mvnw compile'
    }
    stage('test') {
            sh './mvnw test'
    }
    stage('docker build/push') {
        sh 'Work In progress'
    }
}