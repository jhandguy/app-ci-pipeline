node {
  checkout scm
  jobDsl targets: ['jobs/build_qa.groovy', 'jobs/build_beta.groovy'].join('\n')
}
