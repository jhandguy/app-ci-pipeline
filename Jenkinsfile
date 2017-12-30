def platforms = ['android', 'ios']

pipeline {
  agent any

  parameters {
    choice(choices: "cross\n${platforms.join('\n')}", description: 'Mobile Platform for which Jobs are seeded', name: 'platform')
  }

  stages {
    stage('Seed Platform Shared Jobs') {
      steps {
        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               removedJobAction: 'DELETE',
               removedViewAction: 'DELETE',
               sandbox: true,
               additionalParameters: [platform: params.platform, platforms: platforms]
      }
    }
  }
}
