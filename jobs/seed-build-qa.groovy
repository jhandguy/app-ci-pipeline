pipelineJob('build-qa') {
    definition {
        cps {
            script(readFileFromWorkspace('build-qa.groovy'))
            sandbox()
        }
    }
}
