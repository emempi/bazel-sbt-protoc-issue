genrule(
    name = "build",
    srcs = glob(["**/*.scala", "**/*.proto", "**/*.sbt"], exclude=["**/target/**"]),
    outs = ["target"],
    cmd = "sbt compile; cp -r target $@",
)
