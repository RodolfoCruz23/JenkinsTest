pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'javac Calculator.java'
      }
    }

    stage('run') {
      steps {
        bat 'java Calculator.java'
      }
    }

  }
}