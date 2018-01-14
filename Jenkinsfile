pipeline {
  agent any

  stages {
    stage('Seed Android Jobs') {
      steps {
        dir ('android') {
          git url: 'https://github.com/jhandguy/android-ci-pipeline.git', branch: 'generic'
          sh 'cp -r pipelines ../pipelines'
        }

        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               sandbox: true,
               additionalParameters: [platform: 'android']
      }
    }
    stage('Seed iOS Jobs') {
      steps {
        dir ('ios') {
          git url: 'https://github.com/jhandguy/ios-ci-pipeline.git', branch: 'generic'
          sh 'cp -r pipelines ../pipelines'
        }

        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               sandbox: true,
               additionalParameters: [platform: 'ios']
      }
    }
  }
}
