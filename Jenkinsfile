
pipeline {
  agent any
  
  stages {
    stage('Seed Jobs') {
      steps {
        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               removedJobAction: 'DELETE',
               removedViewAction: 'DELETE',
               lookupStrategy: 'SEED_JOB',
               sandbox: true,
               additionalParameters: [platform: 'android']
      }
    }
  }
}
