pipelineJob("${platform}-build-qa") {
  description("QA build for platform ${platform}")

  triggers {
    githubPush()
  }

  definition {
    cps {
      script(readFileFromWorkspace('pipelines/build_qa.groovy'))
      sandbox()
    }
  }
}
