
pipeline {
  agent any

  stages {
    stage('Seed') {
      steps {
        jobDsl targets: ['jobs/*.groovy'].join('\n')
               lookupStrategy: 'SEED_JOB',
               sandbox: true,
               additionalParameters: [platform: 'android']
      }
    }
  }
}
