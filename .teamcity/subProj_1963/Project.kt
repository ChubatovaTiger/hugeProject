package subProj_1963

import subProj_1963.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1963")
    name = "subProj 1963"

    buildType(subProj_bt_1963_1)
    buildType(subProj_bt_1963_2)
    buildType(subProj_bt_1963_3)
    buildType(subProj_bt_1963_4)
    buildType(subProj_bt_1963_0)
    buildType(subProj_bt_1963_5)
})
