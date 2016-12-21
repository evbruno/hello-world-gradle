#!groovy
properties([disableConcurrentBuilds()])
node {

	stage('Checkout') {
		checkout scm
	}

	stage('Setup') {
		sh './gradlew clean'
	}

	stage('Build') {
		sh './gradlew build -x test'
	}

	stage('Test') {
        sh './gradlew test'
	}

}
