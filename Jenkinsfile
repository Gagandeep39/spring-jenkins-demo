node {
    def commit_id
    stage('Preparation') {
        checkout scm
        sh 'git rev-parse --short HEAD > .git/commit-id'
        commit_id = readFile('.git/commit-id').trim()
        sh 'chmod +x mvnw'
    }
    stage('test') {
            sh './mvnw test'
    }
    stage('docker build/push') {
        sh 'echo Deployment Stage'
    }
}