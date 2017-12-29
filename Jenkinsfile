
pipeline {
  agent any

  parameters {
    choice(choices: 'android\nios', description: 'Mobile Platform for which Jobs are seeded', name: 'platform')
  }

  stages {
    stage('Seed Jobs') {
      steps {
        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               removedJobAction: 'DELETE',
               removedViewAction: 'DELETE',
               sandbox: true,
               additionalParameters: [platform: ${params.platform}]
      }
    }
  }
}
