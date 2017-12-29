pipelineJob("${platform}-build-beta") {
  description("Beta build for platform ${platform}")

  definition {
    cpsScm {
      scm {
        git {
          remote { url("https://github.com/jhandguy/${platform}-ci-pipeline") }
          branches('master', '**/feature*')
          scriptPath('build-beta/Jenkinsfile')
          extensions { }
        }
      }
    }
  }
}
