
pipeline {
  agent any

  def platforms = ['android', 'ios']

  parameters {
    choice(choices: "cross\n${platforms.join('\n')}", description: 'Mobile Platform for which Jobs are seeded', name: 'platform')
  }

  stages {
    stage('Seed Platform Shared Jobs') {
      steps {
        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               sandbox: true,
               additionalParameters: [platform: params.platform, platforms: platforms]
      }
    }
  }
}
