pipelineJob("${platform}-build-qa") {
  description("QA build for platform ${platform}")

  definition {
    cpsScm {
      scm {
        git {
          remote { url("https://github.com/jhandguy/${platform}-ci-pipeline") }
          branches('master', '**/feature*')
          scriptPath('pipelines/build_qa.groovy')
          extensions { }
        }
      }
    }
  }
}
