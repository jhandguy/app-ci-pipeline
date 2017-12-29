
pipeline {
  agent any

  stages {
    stage('Seed') {
      steps {
        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               sandbox: true,
               additionalParameters: [platform: 'android']
      }
    }
  }
}
