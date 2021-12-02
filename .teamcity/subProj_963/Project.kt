package subProj_963

import subProj_963.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_963")
    name = "subProj 963"

    buildType(subProj_bt_963_1)
    buildType(subProj_bt_963_0)
    buildType(subProj_bt_963_3)
    buildType(subProj_bt_963_2)
    buildType(subProj_bt_963_5)
    buildType(subProj_bt_963_4)
})
