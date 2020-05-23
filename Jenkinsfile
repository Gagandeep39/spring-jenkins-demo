node {
    // agent any
    environment {
        to = emailextrecipients([
        [$class: 'CulpritsRecipientProvider'],
        [$class: 'DevelopersRecipientProvider'],
        [$class: 'RequesterRecipientProvider']
    ])
    }
    // stages {
    stage('Preparation') {
        // steps {
        // checkout scm
        sh 'git rev-parse --short HEAD > .git/commit-id'
        // script {
        commit_id = readFile('.git/commit-id').trim()
        // }
        sh 'chmod +x mvnw'
    // }
    }
    stage('Compile') {
        // steps {
        sh './mvnw compile'
    // }
    }
    stage('test') {
        // steps {
        sh './mvnw test'
    // }
    }
    stage('docker build/push') {
        // steps {
        sh 'echo Work In progress'
    // }
    }
    stage('Sonar Sccaner') {
        def sonarqubeScannerHome = tool name: 'sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
        withCredentials([string(credentialsId: 'sonar', variable: 'sonarLogin')]) {
            sh "${sonarqubeScannerHome}/bin/sonar-scanner -e -Dsonar.host.url=http://sonarqube:9000 -Dsonar.login=${sonarLogin} -Dsonar.projectName=gs-gradle -Dsonar.projectVersion=${env.BUILD_NUMBER} -Dsonar.projectKey=GS -Dsonar.sources=complete/src/main/ -Dsonar.tests=complete/src/test/ -Dsonar.language=java -Dsonar.java.binaries=."
        }
    }
// }
// post {
//     failure {
//         // script {
//             currentBuild.result = 'FAILURE'
//             // set variables
//             def subject = "${env.JOB_NAME} - Build #${env.BUILD_NUMBER} ${currentBuild.result}"
//             def content = '${JELLY_SCRIPT,template="html"}'
//             // send email
//             if (to != null && !to.isEmpty()) {
//                 emailext(body: content, mimeType: 'text/html',
//         replyTo: '$DEFAULT_REPLYTO', subject: subject,
//         to: to, attachLog: true )
//             }
//         // }
//     }
// }
}
