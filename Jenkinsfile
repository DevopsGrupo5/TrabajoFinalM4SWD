pipeline {
    agent any

    stages {
        stage('compile') {
            steps {
              
                sh './mvnw.cmd clean compile -e'
                
                
            }
        }
        stage('test Unitario code') {
            steps {
               
                sh './mvnw.cmd clean test -e'
                
            }
        }
        stage('jar code') {
            steps {
               
                sh './mvnw.cmd clean package -e'
                
            }
        }
        stage('run jar') {
            steps {
        
                sh './mvnw spring-boot:run'
               
                
            }
        }
        
    }
}