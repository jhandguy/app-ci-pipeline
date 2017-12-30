
pipeline {
  agent any

  parameters {
    choice(choices: 'android\nios', description: 'Mobile Platform for which Jobs are seeded', name: 'platform')
  }

  stages {
    stage('Seed Platform Shared Jobs') {
      steps {
        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               sandbox: true,
               additionalParameters: [platform: params.platform]
      }
    }
  }
}
