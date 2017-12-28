node {
  checkout scm
  jobDsl targets: ['jobs/seed_build_qa.groovy', 'jobs/seed_build_beta.groovy'].join('\n')
}
