node{
    stage("Pull Repo"){
        git 'git@github.com:jipara/packerde.git'
    }
    stage("Build AMI"){
        sh "packer build updated/updated.json"
    }
}